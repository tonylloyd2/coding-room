from django.db import models
from django.contrib.auth.models import User #imports the inbuilt django user model NB: The model only has username,email and password fields so if you need extra fields you can use the abdtract user but in this case we use an extended field valled profile
from django.db.models.signals import post_save #acts loke the actionlistener for when the signup form is sunmitted
from django.dispatch import receiver

#a class is converted to a table in the database
class Profile(models.Model):
    #instantiate a one to one field i.e a user can only have one profile
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    first_name = models.CharField(max_length=100, blank=True)
    last_name = models.CharField(max_length=100, blank=True)
    email = models.EmailField(max_length=150)

#This function allows rows to be displayed with the username in the django admin page #not mandatory
    def __str__(self):
        return self.user.username

#receives the values for the extra fields filled in the signup form
@receiver(post_save, sender=User)
def update_profile_signal(sender, instance, created, **kwargs):
    if created:
        Profile.objects.create(user=instance)
    instance.profile.save() #saves the model to the database