import tkinter as tk

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

window = tk.Tk()
window.geometry("250x400")
window.title("Python GUI")
label = tk.Label(window , text="hello world" ,  font=('Arial' , 18))
label.pack(padx=20 ,  pady=10)

# myentry = tk.Entry(window , width=6)
# myentry.pack()
# button = tk.Button(window , text=("Click test btn") ,  font =('Arial' , 20))
# button.pack(pady=10)


buttonframe = tk.Frame(window)
buttonframe.columnconfigure(0 , weight=1)
buttonframe.columnconfigure(1 , weight=1)
buttonframe.columnconfigure(2 , weight=1)

btn1 = tk.Button(buttonframe , text='1' , font=('Arial' , 18))
btn1.grid(row=0 , column=0 , sticky=tk.W+tk.E)

btn2 = tk.Button(buttonframe , text='1' , font=('Arial' , 18))
btn2.grid(row=0 , column=0 , sticky=tk.W+tk.E)
btn3 = tk.Button(buttonframe , text='2' , font=('Arial' , 18))
btn3.grid(row=0 , column=1 , sticky=tk.W+tk.E)
btn4 = tk.Button(buttonframe , text='3' , font=('Arial' , 18))
btn4.grid(row=0 , column=2 , sticky=tk.W+tk.E)
btn5 = tk.Button(buttonframe , text='4' , font=('Arial' , 18))
btn5.grid(row=1 , column=0 , sticky=tk.W+tk.E)
btn6 = tk.Button(buttonframe , text='5' , font=('Arial' , 18))
btn6.grid(row=1 , column=1 , sticky=tk.W+tk.E)
btn7 = tk.Button(buttonframe , text='6' , font=('Arial' , 18))
btn7.grid(row=1 , column=2 , sticky=tk.W+tk.E)
btn8 = tk.Button(buttonframe , text='7' , font=('Arial' , 18))
btn8.grid(row=2 , column=0 , sticky=tk.W+tk.E)
btn9 = tk.Button(buttonframe , text='8' , font=('Arial' , 18))
btn9.grid(row=2 , column=1, sticky=tk.W+tk.E)
btn10 = tk.Button(buttonframe , text='9' , font=('Arial' , 18))
btn10.grid(row=2 , column=2, sticky=tk.W+tk.E)

btn_submit = tk.Button(text='submit data for probability' , font=('Arial' , 18))
btn_submit.grid(row=3 , column=1, sticky=tk.W+tk.E)

buttonframe.pack(fill='x')


textbox = tk.Text(window ,height=4,  font=('Arial' , 12))
textbox.pack(padx=10 )

# anotherbtn = tk.Button(window , text="Test")
# anotherbtn.place(x=200 , y=200 ,height=100 , width=100)

window.mainloop()
