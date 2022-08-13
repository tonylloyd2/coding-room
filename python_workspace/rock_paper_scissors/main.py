import random
rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

#Write your code below this line 👇
rps_list = list((scissors,rock,paper))
list_number = len(rps_list)
random_choice = random.randint(0 , list_number - 1)
def FIZZBUZZ():
  user_guess = input("***********\n\n ROCK \n\n*********\n\n PAPER \n\n**********\n\n SCISSORS \n\n*********\n ????\n")
  user_guess_to_lower = user_guess.lower()
  if user_guess_to_lower == "rock":
    print(f" ******************your entry*****************\n\n")
    print(rock)
  elif user_guess_to_lower == "paper":
    print(f" ******************your entry*****************\n\n")
    print(paper)
  elif user_guess_to_lower == "scissors" :
    print(f" ******************your entry*****************\n\n")
    print(scissors)
    print(f"\n\n *************your entry**********************\n\n")
  else :
    print(f" your entry {user_guess_to_lower} is invalid try again")

  if random_choice == 0 and user_guess_to_lower == "rock":
    print(f" ****************** our entry*****************\n\n")
    print(rock)
    print(f" ******************its a tie *****************\n\n")
  elif random_choice == 1 and user_guess_to_lower =="paper":
    print(f" ****************** our entry*****************\n\n")
    print(paper)
    print(f" ******************its a tie *****************\n\n")
  elif random_choice == 2 and user_guess_to_lower =="scissors":
    print(f" ****************** our entry*****************\n\n")
    print(scissors)
    print(f" ******************its a tie *****************\n\n")
  elif random_choice == 0 and user_guess_to_lower =="scissors":
    print(f" ****************** our entry*****************\n\n")
    print(rock)
    print(f" ******************rock crashes scissors so you loose *****************\n\n")
  elif random_choice == 0 and user_guess_to_lower =="paper":
    print(f" ****************** our entry*****************\n\n")
    print(rock)
    print(f" ******************paper folds rock , you win  *****************\n\n")
  elif random_choice == 1 and user_guess_to_lower =="scissors":
    print(f" ****************** our entry*****************\n\n")
    print(paper)
    print(f" ******************scissors cuts paper ,so you win *****************\n\n")
  elif random_choice == 1 and user_guess_to_lower =="rock":
    print(f" ****************** our entry*****************\n\n")
    print(paper)
    print(f" ******************paper folds rock , so you loose*****************\n\n")
  elif random_choice == 2 and user_guess_to_lower =="rock":
    print(f" ****************** our entry*****************\n\n")
    print(scissors)
    print(f" ******************rock crashes scissors so you win *****************\n\n")
  elif random_choice == 2 and user_guess_to_lower =="paper":
    print(f" ****************** our entry*****************\n\n")
    print(scissors)
    print(f" ******************scissors cuts paper so you loose *****************\n\n")

  print(f"\n\n *********************************************\n\n")
  print(f" thank you for participating")
  print(f"\n\n *********************************************\n\n")


FIZZBUZZ()

while True:
  user_responce = str(input("type yes to continue and q to exit : "))
  user_responce = user_responce.lower()
  if not user_responce == 'q':
    FIZZBUZZ()
  else:
    print("byeeee")
    break  
