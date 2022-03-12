from rest_framework import serializers
from .models import Order


class OrderSerializers(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Order
        fields = ('user','product_names','total_products','transaction_id','total_amount')