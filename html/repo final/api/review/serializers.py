from django.forms import ModelForm
from rest_framework import serializers
from .models import Review

class ReviewSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Review
        fields = ('user', 'comment','rate')
class ReviewForm(ModelForm):
    class Meta:
        model =  Review
        fields = ('user', 'comment','rate', 'subject')