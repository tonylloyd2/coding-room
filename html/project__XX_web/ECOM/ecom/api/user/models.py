from unicodedata import name
from django.db import models
from django.contrib.auth.models import AbstractUser
from flask import session
import phonenumbers
# Create your models here.

class CustomUser(AbstractUser):
    name = models.CharField(max_length=50,default='i am an Anonymous user of default')
    email = models.EmailField(max_length=100,unique=True)
#   nullifies login via username
    username = None
# switching the username to email
    USERNAME_FIELD = 'email'
    REQUIRED_FIELDS = []
    date_of_birth = models.CharField(max_length=20, null=True,blank=True)
    profile_picture = models.ImageField(upload_to ="post",blank=True, null=True)

    phonenumber = models.CharField(max_length=20,blank=True,null=True)
    gender = models.CharField(max_length=10,blank=True,null=True)

    session_token =models.CharField(max_length=10,default=0)

    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


    def __str__(self) ->  str:
        return self.email