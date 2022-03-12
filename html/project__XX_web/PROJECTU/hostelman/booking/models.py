from django.db import models
from hostel.models import Hostel
from room.models import Room

class Booking(models.Model):
    booking_id = models.CharField(max_length=50,primary_key=True,default=0)
    first_name = models.CharField(max_length=50,default=0)
    last_name = models.CharField(max_length=50,default=0)    
    email = models.CharField(max_length=50,default=0)
    hostel = models.CharField(max_length=50,default=0)
    room = models.CharField(max_length=50,default=0)
    status = models.CharField(max_length=50,default='active')
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
  
    def __str__(self):
        return self.email
    