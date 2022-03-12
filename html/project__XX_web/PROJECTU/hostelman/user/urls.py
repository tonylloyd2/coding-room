# djangotemplates/example/urls.py

from django.urls import path,include
from user.views import home_view, signup_view,receipt_view,booking_view,change_room,checkout
from room.views import room_view

urlpatterns = [
    path('', home_view, name="home"), 
    path('accounts/', include('django.contrib.auth.urls')),
    path('signup/', signup_view, name="signup"),
    path('receipt/',receipt_view,name="receipt"),
    path('booking/',booking_view,name="booking"),
    path('ChangeRooms/',change_room,name="ChangeRooms"),
    path('checkout/',checkout,name="checkout")
]
