from django.urls import path, include
from rest_framework.authtoken import views
from .views import home

urlpatterns = [
    path('', home, name='api.home'),
    path('hostel/', include('api.hostel.urls')),
    path('user/', include('api.user.urls')),
    path('review/', include('api.review.urls')),
    path('api-token-auth/', views.obtain_auth_token, name='api_token_auth'),

]
