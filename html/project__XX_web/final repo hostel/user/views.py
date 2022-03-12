from rest_framework import viewsets
from rest_framework.permissions import AllowAny
from .serializers import UserSerializer
from .models import CustomUser
from django.http import JsonResponse
from django.contrib.auth import get_user_model , login , logout
from django.views.decorators.csrf import csrf_exempt
import random
import re

# Create your views here.



def generate_session_token(length):
    return ''.join(random.SystemRandom().choice([chr(i) for  i in range ( 97 , 123)] + [ str(i) for i in range(length)]))



@csrf_exempt
def signin(request):
    if not request.method == "POST":
        return JsonResponse({'error':'Send a post request with valid parametres only'})
    
    username = request.POST['email']
    password = request.POST['password']
# validation of the email and password
    if not re.match("", username):
        return JsonResponse({'error':' Enter a valid username address'})

    if len(password) < 4 :
        return JsonResponse({'error':'Password need to be atleast of 4 characters'})

    UserModel = get_user_model()

    try:
        
        user  = UserModel.objects.get(email = username)

        if user.check_password(password):
            usr_dict = UserModel.objects.filter(email=username).values().first()
            usr_dict.pop('password')

            if   user.session_token != "0":
                user.session_token = "0"
                user.save
                return JsonResponse({'error': ' Previous session exists! '})

            token = generate_session_token()
            user.session_token = token
            user.save
            login(request,user)
            return JsonResponse({'token':token , 'user': usr_dict})
        else:
            return JsonResponse({'error':'Invalid password'})         

    except UserModel.DoesNotExist:
        return JsonResponse({'error': 'invalid email'})

def signout(request , id):
    logout(request)

    UserModel = get_user_model()

    try:
        user = UserModel.objects.get(pk=id)
        user.session_token = "0"
        user.save()
    except UserModel.DoesNotExist:
        return JsonResponse({'error':'Invalid user id'})

    return JsonResponse({'success':'you have logged out succesfully  :) '})


# logout
class UserViewSet(viewsets.ModelViewSet):
    permission_classes_by_action = {'create': [AllowAny]}

    queryset = CustomUser.objects.all().order_by('id')
    serializer_class = UserSerializer

    def get_permissions(self):
        try:
            return [permission() for permission in self.permission_classes_by_action[self.action]]
        except KeyError:
            return [permission() for permission in self.permission_classes]






















