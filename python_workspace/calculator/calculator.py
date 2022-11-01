import os
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
def power(number , rais_by):
    number = float(number)
    rais_by = int(rais_by)
    if rais_by == 0:
        solution = 1
    elif rais_by == 1:
        solution = number
    elif rais_by > 1:
        solution = number
        for multiplier in range(1, rais_by ):
            solution *= number
    elif rais_by < 0:
        multiplier = int(-1)
        rais_by = multiplier * rais_by
        solution = number
        for multiplier in range(1, rais_by ):
            solution *= number
        solution = 1 / solution
        rais_by = multiplier * rais_by
        print (rais_by)
    return solution
def screen_clear():
   # for mac and linux(here, os.name is 'posix')
   if os.name == 'posix':
      _ = os.system('clear')
   else:
      # for windows platfrom
      _ = os.system('cls')
def quit(user_answer):
    if user_answer == 'q': 
        return False
    else:
        return True
operations = {
    "+":add,
    "-":substract,
    "/":divide,
    "*":multiply,
    "^":power
}
def list_operations():
    for operation in operations:
        print( "' "+operation +" '")
def calculator():
    print(logo)
    number1 = float(input("Enter the first number  :  ")) 
    list_operations()
    should_continue = True
    while should_continue:    
        operation_symbol = input("pick an operation from line above : " )
        number2 = float(input("Enter the second number :  "))
        calculation_function = operations[operation_symbol]
        answer = calculation_function(number1,number2)
        print("\n\nthinking...")
        sleep(2)
        screen_clear()
        print(logo) 
        print(f"\nwell here's your answer fella (: \n\n {number1} {operation_symbol} {number2} = {answer} \n\n")
        user_answer = input("do you wish to continue? : type 'q' to quit or any other letter to continue : ").lower()
        should_continue =  quit(user_answer)
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
