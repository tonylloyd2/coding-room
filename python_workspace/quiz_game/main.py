from question_model import Question
from data import question_data
from quiz_brain import QuizBrain
question_bank = [len(question_data) ]


for object in question_data:
    question_string = object["text"]
    question_answer = object["answer"]
    question_object = Question(text=question_string , attribute=question_answer)
    question_bank.append(question_object)

question = QuizBrain(question_bank)

while question.still_has_questions():
    question.next_question()

print("you've completed the quiz test")
print(f"your final score was : {question.score} / {len (question.question_list) - 1}")