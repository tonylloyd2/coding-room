
# from main import MENU

# print(resources)
resources = {
    "water": 251,
    "milk": 200,
    "coffee": 100,
}
MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "cost": 1.5,
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "cost": 2.5,
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "cost": 3.0,
    }
}
profit = 0
# def check_resources_sufficient(coffe_type):
#     servecoffee=True
#     cappuccino_dictionary = {}
#     cappuccino_ingredients_dictionary = {}
#     cappuccino_dictionary = MENU["cappuccino"]
#     cappuccino_ingredients_dictionary = cappuccino_dictionary["ingredients"]
#     latte_dictionary = {}
#     latte_ingredients_dictionary = {}
#     latte_dictionary = MENU["latte"]
#     latte_ingredients_dictionary = latte_dictionary["ingredients"]
#     esspresso_dictionary = {}
#     esspresso_ingredients_dictionary = {}
#     esspresso_dictionary = MENU["espresso"]
#     esspresso_ingredients_dictionary = esspresso_dictionary["ingredients"]
#     if (coffe_type =="cappuccino"  or coffe_type=="latte" or coffe_type=="esspresso") and resources["coffee"] > 0 and resources["milk"]> 0 and resources["water"] > 0: 
#         if (cappuccino_ingredients_dictionary["coffee"] > resources["coffee"] or cappuccino_ingredients_dictionary["water"] > resources["water"]  or cappuccino_ingredients_dictionary["milk"] > resources["milk"] or resources["coffee"] < 0 or resources["milk"]< 0 or resources["water"] < 0) and coffe_type=="cappuccino":   
#             coffe_type=input("insuffient resources maybe for cappuccino try out 'latte' or 'esspresso' ").lower().strip()
#             if coffe_type=="cappuccino":
#                 coffe_type=input(" fuck you 'latte' or 'esspresso' ").lower().strip()
#             return_report(coffe_type)
#         elif (cappuccino_ingredients_dictionary["coffee"] < resources["coffee"] and cappuccino_ingredients_dictionary["water"] < resources["water"]  and cappuccino_ingredients_dictionary["milk"] < resources["milk"] ) and coffe_type=="cappuccino":
#             # print("your order can be served")
#             return servecoffee 
#         if (latte_ingredients_dictionary["coffee"] > resources["coffee"] or latte_ingredients_dictionary["water"] > resources["water"]  or latte_ingredients_dictionary["milk"] > resources["milk"] or resources["coffee"] < 0 or resources["milk"]< 0 or resources["water"] < 0 )and  coffe_type =="latte" :          
#             coffe_type= input("insuffient resources maybe try out 'esspresso'").lower().strip()
#             if coffe_type=="latte" or coffe_type=="cappuccino":
#                 coffe_type=input(" fuck you try out 'esspresso' ").lower().strip()    
#             return_report(coffe_type)                          
#         elif (latte_ingredients_dictionary["coffee"] < resources["coffee"] and latte_ingredients_dictionary["water"] < resources["water"]  and latte_ingredients_dictionary["milk"] < resources["milk"]) and coffe_type =="latte":
#             # print("your order can be served")
#             return servecoffee    
#         if (esspresso_ingredients_dictionary["coffee"] > resources["coffee"] or esspresso_ingredients_dictionary["water"] > resources["water"] or resources["coffee"] < 0  or resources["water"] < 0) and  coffe_type =="esspresso" :          
#             print("insuffient resources ") 
#             servecoffee = False
#             print("one resouce is missing")
#             for resource in resources:
#                 print(f"{resource} : {resources[resource]} litres" )
#             return servecoffee                              
#         elif (esspresso_ingredients_dictionary["coffee"] < resources["coffee"] and esspresso_ingredients_dictionary["water"] < resources["water"]) and coffe_type =="esspresso":
#             # print("your order can be served")
#             return servecoffee 
#         if coffe_type=="report":
#                 if_report(user_input=coffe_type) 
#     elif resources["coffee"] < 0 or resources["milk"]< 0 or resources["water"] < 0:
#         servecoffee = False
#         print("one resouce is missing")
#         return servecoffee
def process_coffee_resource(order_ingredients):
    for item in order_ingredients:
        resources[item] -= order_ingredients[item]
def report():
    print(f"Water: {resources['water']}ml")
    print(f"Milk: {resources['milk']}ml")
    print(f"Coffee: {resources['coffee']}g")
    print(f"Money: {profit} $")           
def is_resource_sufficient(order_ingredients):
    """Returns True when order can be made, False if ingredients are insufficient."""
    for item in order_ingredients:
        if order_ingredients[item] > resources[item]:
            print(f"​Sorry there is not enough {item}.")
            return False
    return True
def serve_coffee(drink_name):  
    return(f"Here is your {drink_name} ☕️. Enjoy!")
def is_transaction_successfull(payment , bill , drink_name):
    """returns true if enough money has been paid otherwise false"""
    if payment >= bill:
        global profit
        change = round(payment - bill, 2)
        if change > 0:
            print(f"Here is ${change} in change.")
            # print(f"Here is your {drink_name} ☕️. Enjoy!")
            profit += bill
            return True
        elif change == 0:
            # print(f"Here is your {drink_name} ☕️. Enjoy!")
            profit += bill
            return True        
    else:
        print(f"Sorry that's not enough money.Here is {payment}$ refund.")
        return False

def process_coins():
    """Returns the total calculated from coins inserted."""
    print("Please insert coins.")
    total = int(input("how many quarters?: ")) * 0.25
    total += int(input("how many dimes?: ")) * 0.1
    total += int(input("how many nickles?: ")) * 0.05
    total += int(input("how many pennies?: ")) * 0.01
    return total
is_on = True
while is_on:
    choice = input("​What would you like? (espresso/latte/cappuccino): ").lower().strip()
    if choice=="espresso" or choice =="latte" or choice=="cappuccino"  or choice =="report" or choice=="off":
        if choice == "off":
            is_on = False
        elif choice == "report":
            report()
        else:
            drink = MENU[choice]
            if is_resource_sufficient(drink["ingredients"]):
                payment = process_coins()
                if is_transaction_successfull(payment=payment, bill=drink["cost"] , drink_name=choice ):
                    process_coffee_resource(drink["ingredients"])
                    print(f"Here is your {choice} ☕️. Enjoy!")
            else :
                print(" powering down ")       
                is_on = False    
    else:
        print(" Wrong input")                                                                                           









