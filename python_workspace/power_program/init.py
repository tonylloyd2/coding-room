# given a number n and raising factor x find n^x ie 2^3 = 8
# def multiply_recurring ():
def power_function(number , rais_by):
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
    output = print (f"the solution of {number}^{rais_by} = {solution}")
    return output
number_to_be_raised = int(input(f"enter number to be raised : "))
number_to_rais_by = int(input(f"rais {number_to_be_raised} by : "))
power_function(number=number_to_be_raised , rais_by=number_to_rais_by)