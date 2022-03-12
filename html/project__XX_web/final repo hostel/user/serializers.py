from rest_framework import serializers
from django.contrib.auth.hashers import make_password
from rest_framework.decorators import  authentication_classes , permission_classes

# import the class from user models
from .models import CustomUser

class UserSerializer(serializers.HyperlinkedModelSerializer):
    
    def create(self, validated_data):
        # extracting password
        password = validated_data.pop('password',None)
        instance = self.Meta.model(**validated_data)
        
        if password is not None:
            instance.set_password(password)
        instance.save()
        return instance 


    def update(self, instance, validated_data):
        for attr , value in validated_data.items():
            # validating the password
            if attr == 'password':
                instance.set_password(value)
            else:
                # 
                setattr(instance , attr , value)
        
        instance.save()
        return instance

    class Meta:
        model = CustomUser
        extra_kwargs = {'password':{'write_only':True}}
        fields = ('name','email','password','date_of_birth','gender','profile_pic','is_active','is_staff','is_supperuser')