from django.urls import path
from . import views

urlpatterns = [
    path('', views.rooms , name='roomspage'),
 ]