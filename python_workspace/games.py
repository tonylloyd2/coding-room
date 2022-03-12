import random
import time
import subprocess


def rock_paper():
    user_wins = 0
    computer_wins = 0
    draws = 0
    game_options = ["r", "p", "s"]
    computer_ops = ["rock", "paper", "scissors"]
    print("********* WELCOME TO ROCK PAPER SCISSORS **********")
    print("\t[+] DIFFICULTY ---> MEDIUM")
    print("\n")
    time.sleep(1.5)
    print("[+] Just a moment... \U0001F600")
    time.sleep(3)

    clear_screen()
    print("\n")
    while True:
        user_option = input("[+] Type r --> rock, p --> paper, s --> scissors, q --> quit: ").lower()
        if user_option == "q":
            print("\n")
            print("[+] Quitting.....")
            print("[+] Don't press any key on your CHEAP computer!!")
            time.sleep(5)
            print("[+] I'm glad you left.....")
            time.sleep(2)
            print("[+] You're a looser anyway :(")
            print("\n")
            time.sleep(5)
            print("[+] Deleting you from memory since you're a looser...")
            print("[+] Please wait...")
            time.sleep(5)
            break

        if user_option not in game_options:
            print("Invalid Move Bitch")
            print("\n")
            continue

        random_number = random.randint(0, 2)
        computer_option = computer_ops[random_number]
        print("computer picked", computer_option + ".")

        if user_option == "r" and computer_option == "scissors":
            print("[+] You won!")
            user_wins = user_wins + 1
            print("\n")

        elif user_option == "p" and computer_option == "rock":
            print("[+] You won!")
            user_wins = user_wins + 1
            print("\n")

        elif user_option == "s" and computer_option == "paper":
            print("[+] You won!")
            user_wins = user_wins + 1
            print("\n")

        elif user_option == game_options[0] and computer_option == computer_ops[0]:
            print(f"[+] You chose {user_option}!")
            print("[+] Draw!")
            draws += 1
            print("\n")

        elif user_option == game_options[1] and computer_option == computer_ops[1]:
            print(f"[+] You chose {user_option}!")
            print("[+] Draw!")
            draws += 1
            print("\n")

        elif user_option == game_options[2] and computer_option == computer_ops[2]:
            print(f"[+] You chose {user_option}!")
            print("[+] Draw!")
            draws += 1
            print("\n")

        else:
            print("[+] You lost!")
            computer_wins = computer_wins + 1
            print("\n")

    clear_screen()
    print("\n")
    print("[+] Analyzing Results...")
    time.sleep(3)
    print("[+] Generating Report...")
    print("\n")
    time.sleep(5)
    print("***** Game Outcomes *****")
    print(f"\t[+] Games won ---> {user_wins}")
    time.sleep(2)
    print(f"\t[+] Games lost ---> {computer_wins}")
    time.sleep(2)
    print(f"\t[+] Draws ---> {draws}")
    time.sleep(2)
    print("\n")
    print("[+] Gathering Honest Remarks...")
    print("[+] Please wait..............")
    time.sleep(5)
    print("\n")
    if user_wins < computer_wins:
        print("[+] You weakling..... The computer beat you :(")
        time.sleep(3)
        print("[+] We've never seen such a looser!")
        time.sleep(3)
        print("[+] GAME OVER you MOTHERFUCKER!!")
        time.sleep(3)
        print("[+] YOU ARE A DISGRACE! :(")
        print("\n")
        time.sleep(3)
        print("[+] REGARDS.... @Carlito")
        time.sleep(4)
        print("\nBye!..")

    elif user_wins > computer_wins:
        print("[+] You should Consider working for NASA!!")
        time.sleep(3)
        print("[+] We, THE CARLITO FAMILY, actually thought you'd lose!")
        time.sleep(3)
        print("[+] Anyway, Congrats you won this time :)")
        time.sleep(3)
        print("[+] Bye You CHEAP FUCKER!! :)")
        time.sleep(5)

    else:
        print("[+] Outcome ---> Draw :[")
        time.sleep(3)
        print("[+] try harder next time BITCH!!")
        time.sleep(5)


def games():
    print("********** Available Games ************")
    print("\t1. Rock-Paper-Scissors")
    print("\t2. Guess The Digit")
    print("\t3. Quit")


def guess_the_number(player):
    clear_screen()
    number_of_guesses = 5
    random_number = random.randint(0, 9)
    print("********* WELCOME TO GUESS THE DIGIT **********")
    print("\t\t\n[+] DIFFICULTY ---> AMATEUR")
    print("\n")
    time.sleep(3)
    print("\t\t\t******** RULES *******")
    print("\t\t1. Guess a number within the range 0 - 9")
    time.sleep(1)
    print(f"\t\t2. Don't FUCKING lose!!")
    time.sleep(3)
    print("\n")
    print("[+] Just a moment... ")

    time.sleep(2)
    clear_screen()
    print("\n")
    while True:
        if number_of_guesses == 0:
            print("[+] Out Of Guesses")
            break

        print(f"[+] Guesses Remaining: {number_of_guesses}")
        user_guess = input("[+] Make a Guess: ")

        if user_guess.isdigit():
            user_guess = int(user_guess)
        else:
            print("\n")
            print("[+] Bomboclaat! Dat Be an Invalid Guess!!")
            print("\n")
            number_of_guesses -= 1
            continue

        if user_guess < 0 or user_guess > 9:
            print("\n")
            print("[+] I said the guess should be within 0-9 ! :(")
            time.sleep(1)
            print("[+] ASSHOLE!!")
            print("\n")
            number_of_guesses -= 1
            continue

        if user_guess > random_number:
            print("\n")
            print("[+] My guess is LOWER than that")
            print("\n")
            number_of_guesses -= 1

        elif user_guess < random_number:
            print("\n")
            print("[+] My guess is GREATER than that")
            print("\n")
            number_of_guesses -= 1

        else:
            print("\n")
            print("[+] You Won!")
            print("[+] You should Consider working for NASA!!")
            time.sleep(2)
            print("[+] LATER SUCKER! ...")
            print("\n")
            time.sleep(3)
            break

    print("\n")
    print("[+] Generating Report...")
    time.sleep(5)
    print("\n")
    print("[+] Gathering Honest Remarks...")
    print("[+] Please wait..............")
    time.sleep(5)
    print("\n")
    print(F"[+] DEAR {player}! YOU RAN OUT OF GUESSES :(")
    time.sleep(3)
    print("[+] GAME OVER you MOTHERFUCKER!!")
    time.sleep(3)
    print("[+] YOU ARE A DISGRACE! :(")
    time.sleep(3)
    print("[+] YOU SHOULD CONSIDER A CAREER AS A BITCH!!")
    time.sleep(3)
    print("[+] ONE MORE THING...")
    time.sleep(3)
    print("[+] FUCK OFF")


def clear_screen():
    try:
        subprocess.call("clear")
    except:
        subprocess.call("cls")


clear_screen()
player_name = input("[+] Player name: ")
print("\n")
print("[+] Hello", player_name.title(), ", Welcome to CARLITO Games :)")
print("\n")
print("[+] Before we Begin.....")
print("\n")
print("******** POLITE NOTICE **********")
print("[+] THESE GAMES ARE EXTREMELY ABUSIVE!!")
print("\n")
user_consent = input("[+] Do you wish to continue? [y/n]: ")
time.sleep(1)

if user_consent.lower() == "y":
    print("\n")
    print("\n[+] First Of All.. That's a Stupid name you've got :)")
    time.sleep(2)
    print("[+] loading...")
    time.sleep(1)
    print("[+] please wait...")
    time.sleep(1)
    print("[+] Done...")
    print("\n")
    print("[+] Preparing Game Space...")
    print("\n")
    time.sleep(1)
    print("[+] Let's Go BITCH!!")
    print("\n")
    print("[+] Clearing Screen...")
    time.sleep(4)

    clear_screen()

    games()
    print("\n")
    game_to_play = (input("[+] Choose a game number to play the Game: "))

    if game_to_play.isdigit():
        game_to_play = int(game_to_play)
    else:
        print("[+] Invalid Option Sucker")
        time.sleep(3)
        print("[+] Bye!... ")
        time.sleep(3)
        quit()

    if game_to_play == 1:
        print("\n")
        rock_paper()
    elif game_to_play == 2:
        print("\n")
        guess_the_number(player_name)
    elif game_to_play == 3:
        print("\n[+] Bye..")
        quit()
    else:
        print("Wrong choice")
else:
    print("See Ya LOOSER :(")
