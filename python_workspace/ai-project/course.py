from tabulate import tabulate
from os import name as SystemName,system

attend = [
    ["1","likes_party","yes"],
    ["2","Drunkered","yes"],
    ["3","suites","yes"],
    # ["4","suites","yes"],
    # ["5","Drunkered","no"],
    # ["6","likes_party","yes"],
    # ["7","Drunkered","yes"],
    # ["8","suites","yes"],
    # ["9","likes_party","no"],
    # ["10","Drunkered","no"],
    # ["11","Drunkered","yes"],
    # ["12","likes_party","no"],
    # ["13","suites","yes"],
    # ["14","suites","no"],
    # ["13","suites","yes"],
    # ["14","suites","yes"],
]


table1 = [["course","yes","no","probability","outcome"]]

for day in attend:
    x = 0
    for row in table1:
        if len(row) > 0:
            if (day[1] != row[0]) and (x==len(table1)-1):
                table1.append([day[1],0,0,0.0,""])
            elif(day[1] == row[0]):
                continue
        x+=1

table1.append(["",0.0,0.0,""])

for row in table1:
    for row2 in attend:
        if (row[0]==row2[1]) and (row2[2] == "yes"):
            row[1]+=1
        elif (row[0]==row2[1]) and (row2[2] == "no"):
            row[2]+=1
         
count_yes = 0
count_no = 0
count_row = 0
for row in table1:
    if count_row >= 1:
        if count_row < len(table1) - 1:
            row[3] = "%.3f" % ((row[1]+row[2])/len(attend))
        count_yes += row[1]
        count_no += row[2]
    count_row+=1

table1[len(table1)-1][1] = "%.3f" % (count_yes/(count_yes+count_no))
table1[len(table1)-1][2] = "%.3f" % (count_no/(count_yes+count_no))

prob_y = table1[len(table1)-1][1]
prob_n = table1[len(table1)-1][2]

def get_prob(x,y,z):
    x = float(x)
    y = float(y)
    z = float(z)
    return (x*y)/z

def get_outcome(y,n,z):
    positive = get_prob(y,prob_y,z)
    negative = get_prob(n,prob_n,z)
    
    if positive > 0.8:
        return "education"
    elif positive >= 0.6 and positive <= 0.79:
        return "Drama"
    elif positive >= 0.8 and positive < 0.9:
        return "Acturial"
    elif positive < 0.5 and positive >= 0.3:
        return "Engineering"
    elif positive < 0.2 :
        return "medicine"
    else:
        return "medicine"
count_row =0
for row in table1:
    if 0 < count_row < len(table1)-1:
        row[len(table1)-1] = get_outcome((row[1]/count_yes),(row[2]/count_no),row[3])
    
    count_row+=1

table1_copy = table1[:]
table1_copy.pop(0)
print(tabulate(tabular_data=table1_copy,headers=table1[0],tablefmt='orgtbl'))