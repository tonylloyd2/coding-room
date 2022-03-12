from functools import total_ordering
from itertools import product
from django.shortcuts import render
from itsdangerous import json
from rest_framework import viewsets
from django.http import JsonResponse
from django.contrib.auth import get_user_model
from .serializers import OrderSerializers
from .models import Order
from django.views.decorators.csrf import csrf_exempt


# Create your views here.
def validate_user_session(id,token):
    UserModel = get_user_model
    try:
        user = UserModel.objects.get(pk=id)
        if user.session_token ==  token:
            return True
        return False

    except UserModel.DoesNotExist:
        return  False

@csrf_exempt
def add(request,id,token):
    if not validate_user_session(id,token):
        return JsonResponse({'error':' please relogin','code':'1'})
    if request.method == "POST":
        user_id = id
        transaction_id = request.POST['transaction_id']
        amount = request.POST['amount']
        products = request.POST['products']

        total_prods = len(products.split(',') [:-1])

        UserModel = get_user_model

        try:
            user : UserModel.objects.get(pk=user_id)
        except UserModel.DoesNotExist:
            return JsonResponse({'error':' user does not exist'})

        Order2 = Order(
            user=user,
            product_names = products,
            total_products = total_prods,
            transaction_id=transaction_id , 
            total_amount = amount
            )
        Order2.save()
        return JsonResponse({'successs':True , 'error':False,'message':'Order placed successfully'})
    

class OrderViewSet(viewsets.ModelViewSet):
    queryset = Order.objects.all().order_by('name')
    serializer_class = OrderSerializers
