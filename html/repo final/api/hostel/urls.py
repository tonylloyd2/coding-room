from rest_framework import routers
from django.urls import path , include
from . import views

# router = routers.DefaultRouter()
# router.register(r'', views.HostelViewSet)
urlpatterns = [
    # path('' , include(router.urls)),
    path('', views.hostel , name='hostel'),
]
