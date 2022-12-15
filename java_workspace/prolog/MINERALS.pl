


go :- hypothesize(Disease),
      write('I guess that the disease is: '),
      write(Disease),
      nl,
      undo.

hypothesize(malaria)	:-malaria,!.
hypothesize(cholera)	:-cholera,!.
hypothesize(bilharzia)	:-bilharzia,!.
hypothesize(typhoid)	:-typhoid,!.
hypothesize(corona)		:-corona,!.
hypothesize(tuberculosis)	:-tuberculosis,!.
hypothesize(unknown).

malaria :-flu,
        cold,
        verify(fatigue),
		verify(rapid_breathing),
		verify(rapid_heart_rate),
		verify(general_feeling_of_discomfort),
		verify(headache),
		verify(nausea_and_vomiting), 
		verify(diarrhea),
		verify(abdominal_pain), 
		verify(muscle_or_joint). 		
			
cholera	:- 	verify(diarrhea),
		verify(nausea_and_vomiting),
		verify(dehydration).
			
			
bilharzia:-	verify(nausea_and_vomiting),
		verify(diarrhea),
		verify(abdominal_pain),
		verify(muscle_or_joint_pain),
		verify(rapid_heart_rate).

typhoid:-	verify(fever_that_starts_low_and_increases_daily),
		verify(headache),
		verify(weakness_and_fatigue),
		verify(muscle_aches),
		verify(sweating),
		verify(dry_cough),
		verify(loss_of_appetite_and_weight_loss),
		verify(stomach_pain),
		verify(diarrhea_or_constipation),
		verify(rash),
		verify(extremely_swollen_stomach).

tuberculosis:-	verify(coughing_for_three_or_more_weeks),
		verify(coughing_up_blood_or_mucus),
		verify(chest_pain_or_pain_with_breathing_or_coughing),
		verify(unintentional_weight_loss),
		verify(fatigue),
		verify(fever),
		verify(night_sweats),
		verify(chills),
		verify(loss_of_appetite).
        
corona :-	flu,
        cold,
		verify(tiredness),
		verify(shortness_of_breath_or_difficulty_breathing),
		verify(muscle_aches),
		verify(do_you_have_chills),
		verify(runny_nose),
		verify(headache),
		verify(chest_pain),
		verify(pink_eye_conjunctivitis),   
		verify(nausea_and_Vomiting),
		verify(diarrhea),
		verify(rash).
		   	   
flu:-		verify(sore_throat),
		verify(cough),
		verify(fever),
		verify(headache),
		verify(shortnes_of_breathe).


cold:-     verify(cough),
		   verify(sneezing).

/* how to ask questions */
ask(Question) :-
    write('Do you have the following signs and symptoms: '),
    write(Question),
    write('? '),
    read(Response),
    nl,
    ( (Response == yes ; Response == y)
      ->
       assert(yes(Question)) ;
	   (Response == no ; Response == n)
      ->
       assert(no(Question)), fail;
	   
	   write("initiating another question ..."),nl,
	   write("Please enter yes/no or y/n"),nl,
	   go
	   ).

:- dynamic yes/1,no/1.

/* How to verify something */
verify(S) :-
   (yes(S) 
    ->
    true ;
    (no(S)
     ->
     fail ;
     ask(S))).

/* undo all yes/no assertions */
undo :- retract(yes(_)),fail. 
undo :- retract(no(_)),fail.
undo.
