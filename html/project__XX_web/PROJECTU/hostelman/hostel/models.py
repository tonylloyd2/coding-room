from django.db import models

class Hostel(models.Model):
    hostel_name = models.CharField(max_length=50,unique=True)
    total_rooms = models.CharField(max_length=50)
    available_rooms = models.CharField(max_length=50)
    room_prices = models.CharField(max_length=50)
    image = models.ImageField(upload_to='images/', blank=True, null=True)
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self):
        return self.hostel_name
