import random

def level(level , guesses):
    if level == "easy":
        guesses = int(5)
        print(f"entering easy level")
        # return guesses
        print (guesses)
    elif level =="hard":
        guesses = int(3)
        print(f"entering hard level")
        # return guesses
        print (guesses)

level = input("Choose a difficulty . type 'easy' or 'hard' ").lower()
guesses = int(0)
level(level,guesses)

def guess(x):
    random_number = random.randint(1,x)
    guesses = 0
    print("Welcome to Guessing game !")
    print("I'm thinking of a number between 1 and 100")
    level = input("Choose a difficulty . type 'easy' or 'hard' ").lower()
    guesses = level(level , guesses )
    # user_guess = int(input("Guess the number : "))

    while guess != random_number :
          guess =int( input(f" guess a number between 1 and {x} : " ))
          print(guess)

          if guess > random_number :
              print(" The number is too high try again")
          elif guess < random_number :
              print("the number is too low try again")
          # elif guess == random_number :

    print(f"you guessed correct {random_number}")
# guess(100) 