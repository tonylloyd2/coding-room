import random
def check_level_spelling(level):
    if level == "easy":
        print(f"entering easy level")
    elif level == "hard":
        print(f"entering hard level")
    else:
        while level != "hard" and level != "easy":
            level = input("Wrong spelling choose a difficulty . type 'easy' or 'hard' ").lower()
        if level == "easy":
            print(f"entering easy level")
        elif level == "hard":
            print(f"entering hard level")
def choose_level(level):
    if level == "easy":
        return 5
    elif level =="hard":
        return 3
def generate_number():
    return random.randint(1,100)
def where_numberlies(user_guess , number):
    if user_guess > number:
        print(f"The guess is too high")
    elif user_guess < number:
        print(f"The guess is too low")
def check_number(attempts , user_guess , generated_number , level):
    attempts = choose_level(level)
    if user_guess == generated_number:
        print(f'you have won the game {generated_number}')
        return True
    else:
        attempts = attempts - 1
        while attempts != 0 and user_guess != generated_number:
            where_numberlies(user_guess,generated_number)
            user_guess = int(input(f"**Wrong answer** \n**You have {attempts} remaining attempts ...try again** : {generated_number} : "))
            attempts = attempts - 1
            if user_guess == generated_number:
                print(f'you have won the game {generated_number}')
                break
        if attempts == 0 and user_guess != generated_number:
            print(f"You have ran out of guesses ..... \n ****\n answer is {generated_number}")
level = input("Choose a difficulty . type 'easy' or 'hard' ").lower()

check_level_spelling(level)

user_guess = int(input(f"choose your number : "))

check_number(attempts=choose_level(level),user_guess=user_guess ,generated_number=generate_number() , level=level )
