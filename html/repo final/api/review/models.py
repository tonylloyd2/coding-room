from django.db import models
from api.user.models import CustomUser
from django.core.validators import MaxValueValidator, MinValueValidator
from api.hostel.models import Hostel
# from djangoratings.fields import RatingField
# Create your models here.

class Review(models.Model):
 
    user = models.ForeignKey(CustomUser , models.CASCADE )
    hostel = models.ForeignKey(Hostel , models.CASCADE )
    subject = models.CharField(max_length=10,default='optional')
    comment = models.TextField(max_length=250)
    rate =models.IntegerField(default=0,
        validators=[
            MaxValueValidator(5),
            MinValueValidator(0),
        ]
    )

    # status = models.CharField(max_length=10,choices=STATUS , default='New')
    # models.IntegerField(default=0)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True) 
    def __str__(self) -> str:
        return self.subject