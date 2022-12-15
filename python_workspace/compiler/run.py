from tkinter import *
from tkinter.filedialog import asksaveasfilename
from tkinter.filedialog import askopenfilename
import subprocess

compiler = Tk()
compiler.title("simple compiler")
file_path = ''


def set_file_path(path):
    global file_path
    file_path = path


def open_file():
    path = askopenfilename(filetypes=[('Python Files', '*.py')])
    with open(path, 'r ') as file:
        code = file.read()
        editor.delete('1.0', END)
        editor.insert('1.0', code)
        set_file_path(path)


def save_as():
    if file_path == '':
        path = asksaveasfilename(filetypes=[('Python Files', '*.py')])
    else:
        path = file_path
    with open(path, 'w') as file:
        code = editor.get('1.0', END)
        file.write(code)
        set_file_path(path)


def run():
    command = f'python {file_path}'
    process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
    output, error = process.communicate()
    code_output.insert('1.0', output)
    code_output.insert('1.0', error)


menu_bar = Menu(compiler)

file_menu = Menu(menu_bar, tearoff=0)
file_menu.add_command(label='open', command=open_file)
file_menu.add_command(label ='save', command=save_as)
file_menu.add_command(label='Save As', command=save_as)
file_menu.add_command(label='exit', command=exit)
menu_bar.add_cascade(label="file", menu=file_menu)

run_bar = Menu(menu_bar, tearoff=0)
run_bar.add_command(label='run', command=run)
menu_bar.add_cascade(label="run", menu=run_bar)


run1 = Menu(menu_bar, tearoff=0)
run1.add_command(label='save', command=run)
menu_bar.add_cascade(label="save", menu=run1)

run2 = Menu(menu_bar, tearoff=0)
run2.add_command(label='open', command=run)
menu_bar.add_cascade(label="open", menu=run2)

run11 = Menu(menu_bar, tearoff=0)
run11.add_command(label='save as', command=run)
menu_bar.add_cascade(label="save as", menu=run11)


compiler.config(menu=menu_bar)

editor = Text()
editor.pack()

code_output = Text()
code_output.pack()

compiler.mainloop()
