from django.db import models

# Create your models here.
class Hostel(models.Model):

    hostel_name = models.CharField(max_length=50 )
    Number_of_rooms = models.CharField(max_length=10)
    description = models.CharField(max_length=250 , default='')
    Address = models.CharField(max_length=50 ,null=True)    
    image = models.ImageField(upload_to = 'images/',blank=True,null=True,default='') 
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self) -> str:
        return self.hostel_name