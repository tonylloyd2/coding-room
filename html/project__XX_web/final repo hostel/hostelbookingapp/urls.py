from django.contrib import admin
from django.urls import path, include
from django.conf.urls.static import static
from django.conf import settings
from .settings import MEDIA_ROOT,MEDIA_URL
urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('main.urls')),
    path('auth/', include('rest_framework.urls')),
    path('vendors/', include('vendors.urls')),
    path('payment/', include('payment.urls')),
    path('rooms/', include('rooms.urls')),
    path('booking/', include('booking.urls')),
    path('hostel/', include('hostel.urls')),
    path('user/', include('user.urls')),
    

]
urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT )
