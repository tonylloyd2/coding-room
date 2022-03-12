from django.shortcuts import render
from django.contrib.auth import login, authenticate
from .forms import SignUpForm
from django.contrib.auth.models import User
from hostel.models import Hostel
from room.models import Room
from user.models import Profile
from booking.models import Booking
from django.shortcuts import render, redirect
import random
from django.http import JsonResponse


def generate_id(length):
    return ''.join(random.SystemRandom().choice([chr(i) for i in range(97, 123)] + [str(i) for i in range(length)]) for _ in range(length))
    
def checkout(request):
    booking_id = request.GET['booking_id'] 
    booking = Booking.objects.filter(booking_id=booking_id,status='active')
    if booking.exists():
        booking.update(status='checked out')
        room = Booking.objects.get(booking_id=booking_id)
        room_no = room.room
        Room.objects.filter(room_no=room_no).update(status='available')
        msg="Checked out succesfully"
    else:
        msg="Already checked out"    
    user_email = request.GET['email']
    bookings = Booking.objects.filter(email=user_email)
    print(bookings)
    return render(request,'bookings.html',{'bookings':bookings,'msg':msg})
    
    

def change_room(request):
    status = "available"
    hostel_name = request.GET['hostel_name']
    try:
        rooms = Room.objects.filter(hostel__hostel_name=hostel_name,status=status).order_by('room_no')
        if rooms.exists():
            data=list(rooms.values('room_no'))
        else:    
            data=[{'room_no':'No rooms available'}]
    except Exception:
        data['error_message'] = 'error'
        print(data)
        return JsonResponse(data)
    print(data)    
    return JsonResponse(data, safe=False)



def home_view(request):
    hostels = Hostel.objects.all().order_by('hostel_name')
    print(hostels)
    host = "Equator"
    status = "available"
    rooms = Room.objects.filter(hostel__hostel_name=host,status=status).order_by('room_no')   
    if request.method == 'POST':
        active_booking = Booking.objects.filter(email= request.POST.get('email'),status='active')
        if active_booking.exists():
            msg="You have an active booking.Please checkout!"
        else:    
            checkroom = Room.objects.filter(hostel__hostel_name=request.POST.get('hostel_name'),room_no=request.POST.get('room_no'))
            checkhostel = Hostel.objects.filter(hostel_name=request.POST.get('hostel_name'))
            if checkroom.exists() and checkhostel.exists():
                booking = Booking()
                booking.booking_id = generate_id(12)
                booking.first_name = request.user.profile.first_name
                booking.last_name = request.user.profile.last_name
                booking.email = request.user.email
                booking.hostel = request.POST.get('hostel_name')
                booking.room = request.POST.get('room_no')
                booking.save()
                Room.objects.filter(room_no=request.POST['room_no']).update(status='booked')
                msg="Booking added succesfully"
            else:
                msg="Room is not available"
        return render(request, 'home.html',{'hostels':hostels,'rooms':rooms,'msg':msg})
    output = {'hostels':hostels,'rooms':rooms}
    print(output) 
    return render(request, 'home.html', output)
    


def booking_view(request):
           user_email = request.GET['email']
           bookings = Booking.objects.filter(email=user_email).order_by('created_at').reverse()[:5]
           return render(request,'bookings.html',{'bookings':bookings})
     
      
        
def receipt_view(request):
           booking_id = request.GET['booking_id']
           bookings = Booking.objects.filter(pk=booking_id)
           print(bookings)
           return render(request,'receipt.html',{'bookings':bookings})
   
                      
                                                            
def signup_view(request):
    if request.method  == 'POST':
        form = SignUpForm(request.POST)
        if form.is_valid():
            user = form.save()
            user.refresh_from_db()
            user.profile.first_name = form.cleaned_data.get('first_name')
            user.profile.last_name = form.cleaned_data.get('last_name')
            user.profile.email = form.cleaned_data.get('email')
            user.save()
            login(request, user)
            return redirect('home')
    else:
        form = SignUpForm()
    return render(request, 'signup.html', {'form': form})