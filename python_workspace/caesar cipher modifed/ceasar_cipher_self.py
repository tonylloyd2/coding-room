# from email import message
from art import logo
import os
from time import sleep

alphabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]

def screen_clear():
   # for mac and linux(here, os.name is 'posix')
   if os.name == 'posix':
      _ = os.system('clear')
   else:
      # for windows platfrom
      _ = os.system('cls')
def check_direction_spelling( direction ):
    if direction == "encode" or direction == "decode":
        return direction
    while direction != "encode" and direction != "decode":
        print("there is a typoo in the  word '"+direction+"' recheck the spelling and type again either  'encode'  to encrypt or 'decode' to decrypt : ")
        direction = input().strip()
        if direction == "encode" or direction == "decode":
             return direction
def encode(message_to_encode , shift_number):
    print("Entering encoding mode ***")
    sleep(2)
    pass
def decode():
    pass
print(f"\n encode and decode your messages here .... :)")
sleep(4)
screen_clear()
print(logo)
direction = input(" type ' encode ' to encrypt or 'decode' to  decrypt :  ").lower().strip()
check_direction_spelling(direction)
message = input("*** Type your message *** \n : ").lower().strip()
shift = int(input( " Enter your desires shift number : "))
