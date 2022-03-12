from django.urls import path,include
from user.views import home_view,profile_view,signup_view

urlpatterns = [
    path('', home_view, name="home"), 
    path('accounts/', include('django.contrib.auth.urls')),
    path('profile/',profile_view,name="profile"),
    path('signup/', signup_view, name="signup"),
    ]