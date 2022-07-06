import os
from art import logo
from time import sleep
from art import logo
def add(number1 , number2):
    return number1 + number2
def substract(number1 , number2):
    return number1 - number2
def divide(number1 , number2):
    return number1 / number2
def multiply(number1 , number2):
    return number1 * number2
# def calculation_function ()
def screen_clear():
   # for mac and linux(here, os.name is 'posix')
   if os.name == 'posix':
      _ = os.system('clear')
   else:
      # for windows platfrom
      _ = os.system('cls')
   # print out some text
operations = {
    "+":add,
    "-":substract,
    "/":divide,
    "*":multiply
}
def quit(user_answer):
    if user_answer == 'q':
        
        return False
    else:
        return True
def list_operations():
    for operation in operations:
        print( "' "+operation +" '")


def calculator():

    print(logo)
    # quit_var = FALSE 
    # while  quit_var == True:    
    number1 = float(input("Enter the first number  :  "))
    
    list_operations()

    should_continue = True

    while should_continue:    
        operation_symbol = input("pick an operation from line above : " )
        number2 = float(input("Enter the second number :  "))
        calculation_function = operations[operation_symbol]
        answer = calculation_function(number1,number2)

        print("\n\nthinking...")
        sleep(3)
        screen_clear()
        print(logo) 
        print(f"\nwell here's your answer fella (: \n\n {number1} {operation_symbol} {number2} = {answer} \n\n")

        user_answer = input("do you wish to continue? : type 'q' to quit or any other letter to continue : ").lower()
        should_continue =  quit(user_answer)
        # print(should_continue)

        if should_continue == False:
            sleep(3)
            screen_clear()
            print("Goodbye")
            sleep(2)
            break
        else:    
            if input (f"Type 'y' to continue with {answer} , or Type 'n' to start a new calculation : ")=="y":
                number1=answer
                list_operations()
            else:
                should_continue = False
                print("screen clears in 5 seconds")
                sleep(6)
                screen_clear()
                calculator()

calculator()