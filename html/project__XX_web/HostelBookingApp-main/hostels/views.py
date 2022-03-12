from multiprocessing import context
from django.shortcuts import render

# Create your views here.
def index(request):
    context = {'name': 'And win'}
    return render(request, 'hostels/index.html', context)
