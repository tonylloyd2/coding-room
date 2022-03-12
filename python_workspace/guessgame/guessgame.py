import random
def guess(x):
    random_number = random.randint(1,x)
    guess = 0
    while guess != random_number :
          guess =int( input(f" guess a number between 1 and {x} : " ))
          print(guess)

          if guess > random_number :
              print(" The number is too high try again")
          elif guess < random_number :
              print("the number is too low try again")
          # elif guess == random_number :

    print(f"you guessed correct {random_number}")
guess(10)