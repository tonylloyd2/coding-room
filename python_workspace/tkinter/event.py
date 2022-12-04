import tkinter as tk
from tkinter import messagebox

class MyGui:

    def __init__(self):
        self.window = tk.Tk()

        self.label = tk.Label(self.window , text="your text ? " , font=("Arial" , 18))
        self.label.pack(padx=10 , pady=10)

        self.textbox = tk.Text(self.window , height=5 , font=('Arial' , 17))
        self.textbox.bind("<KeyPress>" ,self.shortcut )
        self.textbox.pack(padx=10 , pady=10)

        self.check_state = tk.IntVar()

        self.checkbox= tk.Checkbutton(self.window , text="show Messagebox" , font=("Arial" , 16)  , variable = self.check_state)
        self.checkbox.pack(padx=10 , pady=10)

        self.button = tk.Button(self.window , command=self.show_message,  text="show message" , font=('Arial' , 18))
        self.button.pack(padx=10 , pady=10)

        self.window.mainloop()

    def shortcut(self , event):
        print(event.keysym)
        print(event.state)
        



    def show_message(self):
        if (self.check_state.get() == 0 ):
            print(self.textbox.get('1.0' , tk.END))
        else:
            messagebox.showinfo(title="Message" , message=self.textbox.get('1.0',tk.END))
class Run:
    MyGui()