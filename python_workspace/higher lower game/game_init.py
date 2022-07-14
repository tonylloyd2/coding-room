import os
from time import sleep
from art import logo 
from art import vs
from game_data import data 
import random
def screen_clear():
   # for mac and linux(here, os.name is 'posix')
   if os.name == 'posix':
      _ = os.system('clear')
   else:
      # for windows platfrom
      _ = os.system('cls')
   # print out some text

def generate_number():
    return random.randint(0,49)
def print_quiz(dictionary1 , dictionary2):
    return f"A : {dictionary1['name']} is  a {dictionary1['description']}  from  {dictionary1['country']}  {dictionary1['follower_count']} \n {vs} \n B : {dictionary2['name']} is  a {dictionary2['description']}  from  {dictionary2['country']}  {dictionary2['follower_count']}"
print(f"{logo}")
dictionary1 = {}
dictionary2 = {}
user_score = 0
is_user_correct = True
dictionary3 = {}
number1 = generate_number()
number2 = generate_number()
number3 = generate_number()
if number1 == number2 :
    number2 = generate_number()
dictionary1 = data[number1]
dictionary2 = data[number2]
print(print_quiz(dictionary1 , dictionary2))
user_choice = input('Who has more followers ?  A  or B ? : ').upper().strip()
if user_choice == "A" and dictionary1['follower_count'] > dictionary2['follower_count'] :
    user_score += 1
    # print(f"you won {user_score}")
    while is_user_correct:
        if number3 == number2 or number3 == number1:
            number3 = generate_number()
        dictionary3 = data[number3]
        print(print_quiz(dictionary2 , dictionary3))
        user_choice = input('Who has more followers ?  A  or B ? : ').upper().strip()
        pass

# lose event 
elif user_choice == "A" and dictionary1['follower_count'] < dictionary2['follower_count'] :
    print("you lose")
elif user_choice == "B" and dictionary2['follower_count'] > dictionary1['follower_count'] :
    print("you win")
# lose event
elif user_choice == "B" and dictionary2['follower_count'] < dictionary1['follower_count'] :
    print("you lose")
elif (user_choice == "A" or user_choice == "B") and (dictionary2['follower_count'] == dictionary1['follower_count'] ):
    print("draw")



