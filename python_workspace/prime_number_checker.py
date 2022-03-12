from xmlrpc.client import boolean
import math


user_input_number = int(input(" enter number to check : "))

def prime_number_checker(number):
    boolean_validater = True
    half_of_number = math.ceil(number/2)
    for number_test in range(2 ,half_of_number):
        if number % number_test == 0 :
            boolean_validater = False
        else:
            boolean_validater = True
            
    if boolean_validater == True:
        print(f"{number} is a  prime number")
    else:
        print(f"{number} is not prime  number")





prime_number_checker(number=user_input_number)        
