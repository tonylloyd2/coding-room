from turtle import Turtle , Screen
import random
kobe1 = Turtle(shape="turtle")
kobe2 = Turtle(shape="turtle")
kobe3 = Turtle(shape="turtle")
kobe4 = Turtle(shape="turtle")
kobe5 = Turtle(shape="turtle")
kobe6 = Turtle(shape="turtle")
kobe7 = Turtle(shape="turtle")
kobe8 = Turtle(shape="turtle")
referee = Turtle()
referee1 = Turtle()

color = ['red' , 'green' ,"yello"]



kobe1.penup()
kobe2.penup()
kobe3.penup()
kobe4.penup()
kobe5.penup()
kobe6.penup()
kobe7.penup()
kobe8.penup()

referee.penup()
referee1.penup()
screen = Screen()
kobe1.color("blue")
kobe2.color("red")
kobe3.color("green")
kobe4.color("black")
kobe5.color("yellow")
kobe6.color("aqua")
kobe7.color("violet")
kobe8.color("orange")

screen.setup(width=741 , height=450)
user_bet = screen.textinput(title="place your bet " , prompt="enter the color of your turtle :  '[Blue , Red , Green , Black , Yellow , Aqua , violet , Orange]'").lower()
# print(f"{kobe1.position()} color won")

kobe1.goto(-790, -150)
kobe2.goto(-790,-100)
kobe3.goto(-790,-50)
kobe4.goto(-790 ,0)
kobe5.goto(-790 , 50)
kobe6.goto(-790 , 100)
kobe7.goto(-790 , 150)
kobe8.goto(-790 , 190)

referee.goto(760 ,390)
referee1.goto(760 , -390)

referee.pendown()
referee1.pendown()
referee.right(90)
referee1.left(90)
referee1.pencolor("green")
referee.pencolor("green")
for draw in range(0 ,7):
    referee.forward(100)
    referee1.forward(100)
# referee.left(90)
referee.goto(760 , 390)
referee1.goto(760 , -390)
def random_turtle(turtle_number):
    return random.choice(turtle_number)

def move_turtles():
    kobe8.forward(random_turtle(move))
    kobe7.forward(random_turtle(move))    
    kobe6.forward(random_turtle(move))    
    kobe5.forward(random_turtle(move))    
    kobe4.forward(random_turtle(move))    
    kobe3.forward(random_turtle(move))    
    kobe2.forward(random_turtle(move))    
    kobe1.forward(random_turtle(move))
def check_user_bet():
    
    
    if kobe3.pencolor() == user_bet:
        print(f"you've won") 
    if kobe4.pencolor() == user_bet :
        print(f"you've won")
    if kobe5.pencolor() == user_bet :
        print(f"you've won")
    if kobe6.pencolor() == user_bet :
        print(f"you've won")
    if kobe7.pencolor() == user_bet :
        print(f"you've won")
    
     
    
def check_winner():
    if kobe1.xcor() > 741:
        
        if kobe1.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe1.pencolor()} color won")    
        return False
    if kobe2.xcor() > 741:
        
        if kobe2.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("lost")
        print(f"{kobe2.pencolor()} color won")    
        return False
    if kobe3.xcor() > 741:
        
        if kobe3.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe3.pencolor()} color won")    
        return False
    if kobe4.xcor() > 741:

        if kobe4.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe4.pencolor()} color won")    
        return False
    if kobe5.xcor() > 741:
        
        if kobe5.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe5.pencolor()} color won")    
        return False
    if kobe6.xcor() > 741:
        
        if kobe6.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe6.pencolor()} color won")    
        return False
    if kobe7.xcor() > 741:
        
        if kobe7.pencolor() == user_bet :
            print(f"you've won")
        else:
            print("you've lost")
        print(f"{kobe7.pencolor()} color won")    
        return False
    if kobe8.xcor() > 741:
        
        if kobe8.pencolor() == user_bet:
            print(f"you've won")       
        else:
            print("you've lost")
        print(f"{kobe8.pencolor()} color won")    
        return False
number = [1,2,3,4,5,6,7,8]
screen.colormode(33)
move = [2,4,6,8,10,12,14,16]
while True:
    if check_winner() == False:
        break   
    move_turtles()

screen.exitonclick()