from django.contrib import admin
from django.urls import path, include

urlpatterns = [
    path('hostel',  include('hostels.urls')),
    path('admin/', admin.site.urls),
]
