from rest_framework import viewsets
from .serializers import ReviewSerializer
from .models import Review

# Create your views here.


class ReviewViewSet(viewsets.ModelViewSet):
    queryset = Review.objects.all().order_by('user')
    serializer_class = ReviewSerializer
