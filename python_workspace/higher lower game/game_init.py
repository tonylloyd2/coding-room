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
def generate_number():
    return random.randint(0,49)
def print_quiz(dictionary1 , dictionary2):
    return f"A : {dictionary1['name']} is  a {dictionary1['description']}  from  {dictionary1['country']}   \n {vs} \n B : {dictionary2['name']} is  a {dictionary2['description']}  from  {dictionary2['country']} \n"
def check_user_answer():
    print(f"{logo}")
    dictionary1 = {}
    dictionary2 = {}
    number1 = generate_number()
    number2 = generate_number()
    if number1 == number2 :
        number2 = generate_number()
    dictionary1 = data[number1]
    dictionary2 = data[number2]
    print(print_quiz(dictionary1 , dictionary2))
    user_answer = input('Who has more followers ?  A  or B ? : ').upper().strip()
    while user_answer != "A" and user_answer != "B":
        screen_clear()
        print(f'The letter {user_answer} is a wrong input try again')
        sleep(5)
        print(f"{logo}")
        print(print_quiz(dictionary1 , dictionary2))
        user_answer = input('Who has more followers ?  A  or B ? : ').upper().strip()     
    return user_answer , dictionary1 , dictionary2
def track_score():
    user_score = 0
    while True:
        user_choice = check_user_answer() 
        dictionary1 = user_choice[1]
        dictionary2 = user_choice[2]
        if user_choice[0] == "A" and dictionary1['follower_count'] > dictionary2['follower_count'] :
            user_score += 1
            screen_clear()
        elif user_choice[0] == "A" and dictionary1['follower_count'] < dictionary2['follower_count'] :
            screen_clear()
            print(logo)
            sleep(2)
            print(f"You lost your final score is : {user_score}")
            sleep(2)
            print('byeeeeeeeee ......')
            sleep(3)
            screen_clear()
            break
        elif user_choice[0] == "B" and dictionary2['follower_count'] > dictionary1['follower_count'] :
            user_score += 1
            screen_clear()
        elif user_choice[0] == "B" and dictionary2['follower_count'] < dictionary1['follower_count'] :
            screen_clear()
            print(logo)
            sleep(2)
            print(f"You lost your final score is : {user_score}")
            sleep(2)
            print('byeeeeeeeee ......')
            sleep(3)
            screen_clear()
            break
        elif (user_choice[0] == "A" or user_choice[0] == "B") and (dictionary2['follower_count'] == dictionary1['follower_count'] ):
            user_score = user_score
track_score()


