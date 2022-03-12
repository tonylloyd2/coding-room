from django.shortcuts import render,redirect
from django.contrib.auth import login, authenticate
from .forms import SignUpForm
from django.contrib.auth.models import User

def home_view(request):
    return render(request,'home.html')
    
def profile_view(request):
    return render(request,'profile.html')
    
def signup_view(request):
    if request.method  == 'POST':
        form = SignUpForm(request.POST)
        if form.is_valid():
            user = form.save()#capture all the field values  send from the signup form
            user.refresh_from_db()
            user.profile.first_name = form.cleaned_data.get('first_name')
            user.profile.last_name = form.cleaned_data.get('last_name')
            user.profile.email = form.cleaned_data.get('email')
            user.save()#saves the captured details to the database
            login(request, user)#llogs tin the user
    else:
        form = SignUpForm() #creates an instnce of the sign up form
    return render(request, 'registration/signup.html', {'form': form}) # the signup page is return with an empty signup form
