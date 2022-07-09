# when given a a random number n ...find the number of its trailing zeros ie 120 = 1 , 300 = 2
from operator import mod


def trailing(given_num):
    count = 0
    while given_num > 9:
        if given_num % 10 == 0:
            given_num = given_num / 10
            count += 1
        else:
            return count
            # break
    output = print( f"the number has {count} number of zeros")
    return output
ask =  int(input("enter the number to find out its trailing zeros") )
if ask > 0:
    print (f"hello")
    trailing(given_num=ask)
else:
    print ("non zero") 