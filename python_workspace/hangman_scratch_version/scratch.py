import random
from hangman_art import logo,stages
from hangman_words import word_list


chosen_word = random.choice(word_list)

print(chosen_word)

word_length = len(chosen_word)
lives = len(stages)
print(lives)
display = []

for _ in  range(word_length):
    display.append("_")

print("welcome to hangman games .....")
print(logo)
print("\n")
while "_"  in display:
    print(display)
    
    guess = input("guess a letter :  ")

    for position in range(word_length):
        letter = chosen_word[position]
        if letter == guess:
            display[position] = letter
    if "_" not in display and lives>=1:
        print(f"the word is   {chosen_word} you win")
        break
    if guess not in chosen_word:
        lives -= 1  
        print(stages[lives])
        if lives == 0:
            print(f"you loose  the word is  {chosen_word}")
            print(display)
            break
      