""" 
        ** CONDITION PROBABILITY **

                                                """

""" 
finding the probability viv will go for a party and it will rain (P(Y/R) >/< (P(N/R) ) 


        (P(Y/R) =    P(R/Y)  X   P(Y)                                             P(R/N)  X   P(N)
                     ______________              OR IF LESS THAN                  ________________        
                          P(R)                                                          P(R)
  

 """


analysis_dict = {
    "cloudy":{
        "yes":5,
        "no":0,
    },
    "rainy":{
        "yes":2,
        "no":2,
    },
    "sunny":{
        "yes":3,
        "no":2,
    }
}
days = 14
counter_list =[
    [ "cloudy",5,0],
    ["rainy" ,2,2],
    ["sunny" , 3,2],
]
yes_no_dict = {}

def get_all_yes_and_no(key_condition):
    """ 
    used for p(s) or p(r) over the total number of days

                    or / and 

    used for getting the total value of yes and no ie  p(s/y) or p(s/n) or p(r/y) or p(r/n)
    
    
     """
    control_list = [] 
    get_yes_count = 0
    get_no_count = 0
    iterator = 0
    for item in counter_list:
        control_list += counter_list[iterator]
        iterator = iterator + 1
    #     print(control_list)
    # print(control_list)
    yes_iterator = 1
    no_iterator = 2
    for item in range(1,4):
        get_yes_count  += control_list[yes_iterator] 
        yes_iterator += 3
        get_no_count += control_list[no_iterator]
        no_iterator += 3
    if key_condition == "yes":
        return get_yes_count
    else :
        return get_no_count
    print(f"no = {get_no_count }   \nyes = {get_yes_count}")    
def get_yes_no_number_of_condition(user ,  key_condition ):
    """ 
     used to get the proability of either cloudy , rainy , sunny 

     ie cloudy == 5/14 
        rainy == 4/14
    
     """
    get_yes_count = 0
    get_no_count = 0
    if user == 1:
        for key in analysis_dict:
            if key == "cloudy":
                yes_no_dict  = analysis_dict[key]
        for key in yes_no_dict:
            if key_condition == "yes":
                get_yes_count = get_yes_count + yes_no_dict[key_condition]
                return get_yes_count
            elif key_condition == "no":
                get_no_count = get_no_count + yes_no_dict[key_condition]
                return get_no_count
    elif user == 2:
        for key in analysis_dict:
            if key == "rainy":
                yes_no_dict  = analysis_dict[key]
        for key in yes_no_dict:
            if key_condition == "yes":
                get_yes_count = get_yes_count + yes_no_dict[key_condition]
                return get_yes_count
            elif key_condition == "no":
                get_no_count = get_no_count + yes_no_dict[key_condition]
                return get_no_count
    else:
        for key in analysis_dict:
            if key == "sunny":
                    yes_no_dict  = analysis_dict[key]
        for key in yes_no_dict:
            if key_condition == "yes":
                get_yes_count = get_yes_count + yes_no_dict[key_condition]
                return get_yes_count
            elif key_condition == "no":
                get_no_count = get_no_count + yes_no_dict[key_condition]
                return get_no_count
    # print(f"yes = {get_yes_count}  no = {get_no_count} " )
def return_condition_fraction(user ):
    control_list2 = []
    counter = 1
    iterator = 0
    if user == 1:    
        for item in range(0 ,3):
            control_list2 += counter_list[item]
            counter += 1        
        for item in range(1,3):    
            iterator  += control_list2[item]
        return iterator / days
    elif user == 2:
        for item in range(0 ,3):
                control_list2 += counter_list[item]
                counter += 1        
        for item in range(4,6):    
            iterator  += control_list2[item]
            # print(iterator)
        return iterator / days
    else:
        for item in range(0 ,3):
                control_list2 += counter_list[item]
                counter += 1        
        for item in range(7,9):    
            iterator  += control_list2[item]
            # print(iterator)
        return iterator / days
""" 
finding the probability viv will go for a party and it will rain (P(Y/R) >/< (P(N/R) ) 


        (P(Y/R) =    P(R/Y)  X   P(Y)                                             P(R/N)  X   P(N)
                     ______________              OR IF LESS THAN                  ________________        
                          P(R)                                                          P(R)
  
 """

print(" 1 p(c/y) \n 2 p(r/y) \n 3 p(s/y)")

user = int(input("what probability would you like ? type a number"))

while user > 3 or user <= 0 :
    user = int(input("what probability would you like ? type a number"))
condition_probability =  return_condition_fraction(user)

yes_count = get_yes_no_number_of_condition(user , "yes")
no_count = get_yes_no_number_of_condition(user, "no")

total_yes_count = get_all_yes_and_no(key_condition="yes")
total_no_count = get_all_yes_and_no(key_condition="no")

# print(f" yes = {yes_count}  no = {no_count}")
# print(f" yes total = {total_yes_count}  no = {total_no_count}")

def calc_yes_possibility(condition_probability , yes_count , total_yes_count):
    return  ( ((yes_count / total_yes_count) * (total_yes_count / days)) / (condition_probability))
def calc_no_possibility(condition_probability , no_count , total_no_count):
    return (  ((no_count / total_no_count) * (total_no_count / days)) / (condition_probability) )
def compare_probabilities(probability_yes , probability_no):
    if probability_yes > probability_no:
        return f"The outcome probability is {probability_yes * 100}% \n She will go to the party"
    elif probability_no > probability_yes:
        return f"The outcome probability is {probability_no * 100}% \n She will go to the party"
    else:
        return f"The outcome probability is even \n She will either go to the party or fail to go to the party"

probability_yes = calc_yes_possibility(condition_probability, yes_count, total_yes_count)
probability_no = calc_no_possibility(condition_probability, no_count, total_no_count)
output = compare_probabilities(probability_yes, probability_no)
print(output)
