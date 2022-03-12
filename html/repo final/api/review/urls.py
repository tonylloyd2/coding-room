from rest_framework import routers
from django.urls import path , include
from . import views

router = routers.DefaultRouter()
router.register(r'', views.ReviewViewSet)
urlpatterns = [
    path('' , include(router.urls)),
    path('', views.Review , name='review'),
]
