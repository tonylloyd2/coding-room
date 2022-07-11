import random
import emoji

# def level(level , attempt):
    
def check_guess(user_guess , random_number , attempts , level):
    run_out_guesses = True
    if level == "easy":
        attempts = 6
        if user_guess == random_number:
            print(f"You have won the game")
        else:
            attempts -= 1
            while not run_out_guesses and attempts != 0:
                user_guess = int(input("Wrong input ****\n** you have {attempts} remaining**\n try once more guess the number : "))
                if user_guess == random_number:
                    print(f"You have won the game")
                    run_out_guesses = False
                else :
                    attempts -= 1
    elif level == "hard":
        attempts = 3
        if user_guess == random_number:
            print(f"You have won the game")
        else:
            attempts -= 1
            while not run_out_guesses and attempts != 0:
                user_guess = int(input("Wrong input ****\n** you have {attempts} remaining**\n try once more guess the number : "))
                if user_guess == random_number:
                    print(f"You have won the game")
                    break
                else :
                    attempts -= 1
    else:
        return f"Wrong input level"
attempts = 0
print("Welcome to Guessing game !")
print("I'm thinking of a number between 1 and 100")
level = input("Choose a difficulty . type 'easy' or 'hard' ").lower()
user_guess = int(input("Guess the number : "))



random_number = random.randint(1,5)

check_guess(user_guess, random_number, attempts, level )



















# guess(chances=chance , level=level , user_guess=user_guess)
# print(emoji.emojize(":winking_face_with_tongue:"))
# print("\N{grinning face}")
# print(emoji.emojize('Python is :thumbsup:', language='alias'))