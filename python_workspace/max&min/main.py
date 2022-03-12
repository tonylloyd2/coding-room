student_scores = input("Input a list of student scores ").split()
for n in range(0, len(student_scores)):
  student_scores[n] = int(student_scores[n])
print(student_scores)
max_number = 0
min_number = student_scores[0]
for student in student_scores :
  if(student >= max_number ):
    max_number = student
  else:
    max_number = max_number
print(max_number)
for student in student_scores :
  if(student <= min_number):
    min_number = student
  else:
    min_number = min_number
print(min_number)

