from django.shortcuts import render
from django.shortcuts import render, redirect
from django.http import HttpResponse

def room_view(request):
    if request.method=='GET':
        room_no = request.GET['room_no']
        resp="fuck off "+room_no
        return HttpResponse(resp)
