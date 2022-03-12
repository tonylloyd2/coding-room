from django.contrib import admin
from django.urls import path, include
from django.conf.urls.static import static
from django.conf import settings
from .settings import MEDIA_URL,MEDIA_ROOT
urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('main.urls')),
    path('api/', include('api.urls')),
    path('vendors/', include('vendors.urls')),
    path('payment/', include('payment.urls')),
    # path('rooms/', include('rooms.urls')),
    path('booking/', include('booking.urls')),
  
]

urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
