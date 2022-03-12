import string
from art import logo

def check_direction_spelling( direction ):
    if direction == "encode" or direction == "decode":
        return direction
    while direction != "encode" and direction != "decode":
        print("there is a typoo in the  word '"+direction+"' recheck the spelling and type again either  'encode'  to encrypt or 'decode' to decrypt : ")
        direction = input().strip()
        if direction == "encode" or direction == "decode":
             return direction

def Caesar (start_text,shift_amount,cipher_direction):
    end_text = ""
    # the if statemnet controls only encoding
    # if the user encodes we dont get into the if statement    
    if cipher_direction =="decode" :
            shift_amount *= -1
    elif cipher_direction =="encode":
            shift_amount *= 1
    for character in start_text:
        if character in alphabet:
            position = alphabet.index(character)
            new_position = position + shift_amount
            end_text += alphabet[new_position]
        else:
            end_text += character
    print(f"the {cipher_direction.translate({ord(c): None for c in string.whitespace})}d  text is  {end_text}")    
            
should_game_continue = True
while should_game_continue:
    alphabet = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
    print(logo)
    print("dont include spaces when typing encoding or decoding  (:   \n otherwise wrong meesage will be decoded or encoded")
    direction = input(" type ' encode ' to encrypt or 'decode' to  decrypt :  ").lower().strip()
    check_direction_spelling(direction)
    text = input("type your message\n").lower().strip()
    shift = int(input( " type the shift number"))
    # controlling the bigger shift number
    
    shift = shift % 25
    Caesar(start_text=text,shift_amount=shift,cipher_direction=direction) 

    result = input("Type 'yes' to continue otherwise 'no' to terminate.\n : ").lower()
    if result == "no":
        should_game_continue = False
        print("nice time folk  :) ")