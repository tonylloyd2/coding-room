student_heights = input(" enter the heights of the students").split()
for n in range(0, len(student_heights)):
  student_heights[n] = int(student_heights[n])

students_number = 0
sum = 0
for student in student_heights:
  students_number += 1
  sum += student

average_height = sum / students_number
average_height = round(average_height , 3)
print(f"sum =  {sum} \n number of students = {students_number} \n average height = {average_height}")