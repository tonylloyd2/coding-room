from operator import le
import random

def checkguess(random_number , chances):
    if user_guess == random_number :
            print (f"you won  the number is = {random_number}")
    else:
        chances -= 1
        for _ in range(chances):
            user_guess = input(f"you have {chances} attempts remaining ... try again : ")
            if user_guess == random_number :
                return f"you won  the number is = {random_number}"
            else:
                chances -= 1
                user_guess = input(f"you have {chances} attempts remaining ... try again : ")

def guess(chances , level , user_guess):
    random_number = random.randint(1,100)
    if level == "easy":
        chances = 6
        checkguess(chances=chances , random_number=random_number)
        # guess = 0
    elif level =="hard":
        chances = 3
        checkguess(chances=chances , random_number=random_number)
    else:
        return f"wrong level input "
chance = 0
print("Welcome to Guessing game !")
print("I'm thinking of a number between 1 and 100")
level = input("Choose a difficulty . type 'easy' or 'hard' ").lower

user_guess = int(input("Guess the number : "))
guess(chances=chance , level=level , user_guess=user_guess)

