from django.db import models
# creating an import of the foreign key to the product app from category
from api.category.models import Category

# Create your models here.

class Product(models.Model):
    name = models.CharField(max_length=50)
    description = models.CharField(max_length=250)
    price = models.CharField(max_length=50)
    stock = models.CharField(max_length=50)
    # whether the product is available or not
    is_active = models.BooleanField(default=True,blank=True)
    # upload to media/images  refer to the settings.py of ecom(main)
    image = models.ImageField(upload_to = 'images/',blank=True,null=True)
    # how to interlink the tables (existing)
    category = models.ForeignKey(Category , on_delete = models.SET_NULL,blank=True,null=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    def __str__(self) ->  str:
        return self.name