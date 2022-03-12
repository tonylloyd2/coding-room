from django.db import models
from hostel.models import Hostel
class Room(models.Model):
    hostel = models.ForeignKey(
        Hostel, on_delete=models.SET_NULL, blank=True, null=True)
    room_no = models.CharField(max_length=10,unique=True)
    price = models.CharField(max_length=50)
    status = models.CharField(max_length=50,default='available')
    is_active = models.BooleanField(default=True, blank=True)
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self):
        return self.room_no
    