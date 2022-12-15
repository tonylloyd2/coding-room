from kivy.factory import Factory
from kivy.lang import Builder
from kivymd.app import MDApp
from kivymd.uix.screenmanager import MDScreenManager
from kivymd.uix.screen import Screen
from kivymd.uix.selectioncontrol import MDCheckbox
from kivymd.uix.boxlayout import MDBoxLayout
from kivymd.uix.label import MDLabel
from tabulate import tabulate

days_to_calc = 7

data = [[]]
courses ={
    "1":"computer science",
    "2":"computer technology",
    "3":"Information technology",
    "4":"Information comunication technology"
}

day_value = {"X":"N","Y":"N","Z":"N"}

probability_table = [["question","yes","no","probabilty","positive","negative"]]

def calc_probability(x,y,z):
    x = float(x)
    y = float(y)
    z = float(z)

    return (x*y)/z

def predict_course(positive):
    if positive >= 1.75:
        return courses["1"]
    if 1.75 > positive >= 1.55:
        return courses["2"]
    if 1.55> positive >= 1.25:
        return courses["3"]
    else:
        return courses["4"]

class WindowManager(MDScreenManager):
    pass

class MainScreen(Screen):
    pass

class ResultScreen(Screen):
    pass

class MainApp(MDApp):
    def build(self):
        self.App = Builder.load_file('Main.kv')
        self.data_count = 0

        return self.App
    
    def navigation_draw(self):
        pass

    def click_checkbox(self,checkbox,value,check_value):
        if value:
            day_value[check_value] = "Y"
        elif not value:
            day_value[check_value] = "N"

    def update_data(self):
        self.main_screen = self.root.ids.MainScreen
        self.result_screen = self.root.ids.ResultScreen
        if self.data_count < days_to_calc:
            for key in day_value:
                if len(data[0])==0:
                    data[0] = [key,day_value[key]]
                else:
                    data.append([key,day_value[key]])
                day_value[key] = "N"

            self.main_screen.ids.checkbox_x.active = False
            self.main_screen.ids.checkbox_y.active = False
            self.main_screen.ids.checkbox_z.active = False

            self.data_count+=1
            self.root.ids.MainScreen.ids.course_title.text = " DAY {} DATA ".format(self.data_count+1)
        
        if self.data_count==days_to_calc:
            for d_row in data:
                x = 0
                for p_row in probability_table:
                    if d_row[0]==p_row[0]:
                        if d_row[1]=="N":
                            p_row[2]+=1
                        elif d_row[1]=="Y":
                            p_row[1]+=1
                        break

                    elif (d_row!=p_row) and x==len(probability_table)-1:
                        if d_row[1]=="N":
                            probability_table.append([d_row[0],0,1,0.0,0.0,0.0])
                        elif d_row[1]=="Y":
                            probability_table.append([d_row[0],1,0,0.0,0.0,0.0])
                        
                        break
                    x+=1
            
            probability_table.append(["probability",0.0,0.0,"*",0.0,0.0,0.0])

            count_row = 0
            count_yes = 0
            count_no = 0
            for row in probability_table:
                if 0 < count_row < len(probability_table)-1:
                    row[3] = "%.3f" % ((row[1]+row[2])/len(data))
                    count_yes += row[1]
                    count_no += row[2]
                count_row+=1

            if count_yes > 0:
                probability_table[len(probability_table)-1][1] = prob_yes = '%.3f' % (count_yes/len(data))
            if count_no > 0:
                probability_table[len(probability_table)-1][2] = prob_no = '%.3f' % (count_no/len(data))

            count_row = 0
            for row in probability_table:
                if 0 < count_row < len(probability_table)-1:
                    if count_yes > 0:
                        row[4] = '%.3f' % calc_probability((float(row[1])/count_yes),prob_yes,float(row[3]))
                    if count_no > 0:
                        row[5] = '%.3f' % calc_probability((float(row[2])/count_no),prob_no,float(row[3]))
                count_row+=1

            count_row = 0
            for row in probability_table:
                if 0 < count_row < len(probability_table)-1:
                    probability_table[len(probability_table)-1][4] += float(row[4])
                    probability_table[len(probability_table)-1][5] += float(row[5])

                count_row+=1
            print(tabulate(data))
            print(tabulate(probability_table))

            self.root.current = "ResultScreen"
            course = predict_course(float(probability_table[len(probability_table)-1][4]))
            
            self.result_screen.ids.course_text.text = course
            
if __name__ == "__main__":
    MainApp().run()