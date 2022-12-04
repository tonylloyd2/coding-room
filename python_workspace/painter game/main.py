from turtle import Turtle , Screen
import random
screen = Screen()
screen.listen()
turtle = Turtle()



def draw_turn(): #Task 1
    turtle.forward(40)
    turtle.right(90)
def draw_dash(sides):#Task 2
    angle = 720 / sides
    color = ['red' , 'green' , 'black' ,'aqua' , 'yellow' ,'blue' ,'pink' , 'violet' , 'indigo' , 'gold' , 'orange']
    turtle_color =  random.choice(color)
    turtle.color(turtle_color)
    for draw in range(sides):
        turtle.forward(50)
        turtle.right(angle)
     
sides = 3
for draw in  range(3,50):
   draw_dash( sides) 
   sides = int(sides + 1)




screen.exitonclick()