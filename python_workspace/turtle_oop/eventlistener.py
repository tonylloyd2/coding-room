from turtle import Turtle , Screen

kobe = Turtle()
screen = Screen()

screen.listen()
def move_forward():
    kobe.forward(12)
def turn_left():
    kobe.left(30)
def turn_right():
    kobe.right(180)
def move_up():
    turn_left()
    kobe.forward(20)
def move_down():
    turn_right()
    kobe.backward(100)
for turn in range(1,2):
    
  move_up()
  move_forward()
  turn_right()
  move_down() 
  move_forward()
  move_up()
  move_forward()
  for     turn in range (0 ,10):
    turn_right()
    move_forward()
  for     turn in range (0 ,20):
    move_up()
    move_forward()
    turn_right()
    move_forward()
  for TURN in range(1,44)  :
    move_up()
    move_forward()
    turn_right()
    move_down()
    turn_left()
    for     turn in range (0 ,20):
      move_up()
      move_forward()
      turn_right()
      move_forward()
  for TURN in range(1,44)  :
      move_up()
      move_forward()
      turn_right()
      move_down()
      turn_left()    
      move_up()
      move_forward()
      turn_right()
      move_down()    
  turn_right()
  move_forward()
  move_up()
  for     turn in range (0 ,20):
    move_up()
    move_forward()
    turn_right()
    move_forward()
  for TURN in range(1,44)  :
    move_up()
    move_forward()
    turn_right()
    move_down()
    turn_left()
  move_forward()
  turn_right()
  move_down()
  turn_left()
  move_down()
   
     
screen.exitonclick()