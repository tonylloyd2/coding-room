class QuizBrain:
    def __init__(self   , question_list) :
        self.question_number = 1
        self.score = 0
        self.question_list = question_list

    def next_question(self):
        current_question = self.question_list[self.question_number ]
        
        user_answer = input(f"Q.{self.question_number} : {current_question.quiz } (True / false )")
        self.question_number += 1

        self.check_answer(user_answer , current_question.answer)

    def still_has_questions(self ):
        return self.question_number < len(self.question_list)
    def check_answer(self  , user_answer , correct_answer):
        
        if user_answer.lower() == correct_answer.lower():
            print("correct")
            self.score += 1
            print(f"the correct answer is {correct_answer}")
        else:
            print("wrong")
            print(f"the correct answer is {correct_answer}")
            # break
        print (f"Score is : = {self.score} / {len(self.question_list) - 1}")
           
            
            

        
