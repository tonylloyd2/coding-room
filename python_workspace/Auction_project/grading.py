student_scores = {
    "Harry": 81,
    "Ron":78,
    "Draco":99,
    "David":34,
    "Daniel":77,
    "Oneuil":61,
}
student_grades = {} 

for key in student_scores :
    score  = student_scores[key]
    if score > 90 :
        student_grades[key] ="Outstanding"
        print(f" {key} : {student_grades[key]}")
    elif score > 80:
        student_grades[key] ="Exceeds expectation"
        print(f" {key} : {student_grades[key]}")
    elif score > 70:
            student_grades[key] ="Acceptable"
            print(f" {key} : {student_grades[key]}")
    else:
        student_grades[key] = "Fail"


        