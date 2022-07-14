import os
from time import sleep
from art import logo
# The screen clear function
def screen_clear():
   # for mac and linux(here, os.name is 'posix')
   if os.name == 'posix':
      _ = os.system('clear')
   else:
      # for windows platfrom
      _ = os.system('cls')
   # print out some text


def check_highest_bidder(bid_dictionary):
   highest_bid = 0
   for bidder in bid_dictionary:
      bid_amount = bid_dictionary[bidder]
      if bid_amount > highest_bid:
         highest_bid = bid_amount
         winner = bidder
   print(f"The winner is {winner} with a bid of {highest_bid}")
bid_dictionary = {}
game_finished = False
while not game_finished:
   print (logo)
   name = input("enter your name : ").strip()
   bid = int(input("enter your bid : "))
   bid_dictionary[name] =  bid
   check_other_bidders = input("are there any others bidders ? type yes if true otherwise any other later ").lower()   
   # add time counter
   if check_other_bidders != "yes":
      game_finished = True
      check_highest_bidder(bid_dictionary)
   else:
      
      sleep(3)
      screen_clear()






