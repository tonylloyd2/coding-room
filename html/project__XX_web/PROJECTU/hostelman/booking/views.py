from django.shortcuts import render
from .models import Booking

def book(request):
    if request.method == "POST":
        user = request.GET['user']
        hostel = request.POST['hostel']
        room = request.POST['room']
        