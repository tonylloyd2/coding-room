# import math to round up decimal numbers
import math


height_input = int(input("height of the wall : "))
width_input = int(input("height of the wall : "))

def paint_calculator(height , width,coverage):
    number_of_cans = (height * width ) / coverage
    print(f"the  number of cans needed is : { math.ceil(number_of_cans)}")      

# calling the function
paint_calculator(height=height_input,width=width_input,coverage=5)
