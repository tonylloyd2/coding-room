from ast import If
from msilib.schema import tables
from turtle import Turtle , Screen, forward
from prettytable import PrettyTable

first_turtle = Turtle()
# print(first_turtle)
first_turtle.color("green")
first_turtle.shape('turtle')
my_screen = Screen()
# first_turtle.
# my_screen.exitonclick()
# first_turtle.forward(300)
#  construct tale object
# table = PrettyTable()
# table.add_column("index",[1,2,3,4])
# table.add_column("column1",["qedf" , "asevasv" , "sdrfgvser" , "sdfvsd"])
# table.add_column("column2",["dfv" , "ftjktry" , "dfvdf" , " vfdfd"])
# table.align = "l"
# print(table)

for distance in range(0,25):
    print()
    first_turtle.forward(distance = distance +  0)
    print(distance)
my_screen.exitonclick()
    