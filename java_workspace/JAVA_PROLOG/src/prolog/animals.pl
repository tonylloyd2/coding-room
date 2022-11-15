/* 
LLOYD KATILA  CCS/00008/020
*/


go :- hypothesize(Animal),
      write('I guess that the Animal is: '),
      write(Animal),
      nl,
      undo.

hypothesize(zebra)	:-zebra,!.
hypothesize(cow)	:-cow,!.
hypothesize(deer)	:-deer,!.
hypothesize(goat)	:-goat,!.
hypothesize(sheep)		:-sheep,!.
hypothesize(rabbit)	:-rabbit,!.
hypothesize(buffallo)	:-buffallo,!.
hypothesize(wildbeast)	:-wildbeast,!.
hypothesize(donkey)	:-donkey,!.
hypothesize(girraffe)	:-girraffe,!.
hypothesize(lion)	:-lion,!.
hypothesize(chimpanzee) :-chimpanzee,!.
hypothesize(leopard) :-leopard,!.
hypothesize(hyena) :-hyena,!.
hypothesize(fox) :-fox,!.
hypothesize(tiger) :-tiger,!.
hypothesize(wolf) :-wolf,!.
hypothesize(dog) :-dog,!.
hypothesize(squirrel) :-squirrel,!.
hypothesize(pig) :-pig,!.
hypothesize(unknown).

zebra :-verify(skin_color_white_and_black_stripped),
		verify(herbivore),
		verify(similar_to_donkey).
		
			
cow	:- 	verify(herbivore),
		verify(tamed),
		verify(similar_to_bufallo),
		verify(offspring_is_a_calf),
		verify(tamed),
		verify(milked).
			
			
deer:-	verify(wild),
		verify(untamed),
		verify(eyes_are_on_the_side_of_the_head),
		verify(walk_in_groups_called_herds),
		verify(have_long_ears_and_some_male_species_have_antlers).

goat:-verify(ruminant),
		verify(hollow_horned_mammal_belonging_genus_Capra),
		verify(horns_that_arch_backward),
		verify(short_tail),
		verify(male_called_bucks),
		verify(tamed).

sheep:-	verify(woolen_skin),
		verify(herbivore),
		verify(tamed),
		verify(offspring_is_a_lamb).
        
rabbit :-
		verify(can_hop_and_BOY_can_they_also_jump),
		verify(eyes_are_positioned_on_the_sides_of_their_heads),
		verify(baby_is_called_a_kit_a_female_is_called_a_doe_and_a_male_is_called_buck),
		verify(herbivore),
		verify(live_in_warrens),
		verify(tamed).
		

buffallo:- verify(stout_legs_to_support_its_oxlike_body),
		verify(untamed),
		verify(herbivore),
	   verify(similar_to_cows),
	   verify(wild).
	   
	   

wildbeast:- 
		verify(large_box_like_head_with_curving_horns),
		verify(gray_coat_and_a_black_mane_as_well_as_a_beard_that_can_be_black_or_white),
		verify(numbness),
	    verify(fatigue),
		verify(vision_or_hearing_problems),
		verify(bleeding),
		verify(pain).

donkey:- 	verify(mane_is_short_and_upright_and_the_tail_with_long_hairs_only_at_the_end_is_more_cowlike_than_horselike),
			verify(long_ears_are_dark_at_the_base_and_tip),
			verify(sure_footed_and_can_carry_heavy_loads_over_rough_terrain),
			verify(herbivore),
			verify(tamed).

girraffe :- 	verify(long_neck),		
				verify(untamed),
				verify(wild),
				verify(herbivore).

lion :- verify(king_of_the_jungle),
				verify(carnivore),
				verify(walk_in_pride),
				verify(wild),
				verify(untamed).


chimpanzee :- verify(same_class_to_humans),
			verify(wild), 
			verify(untamed),
			verify(omnivore),
			verify(bigger_than_monkey).

leopard :-      verify(rose_like_markings),
				verify(similar_to_cheetah),
				verify(wild),
				verify(carnivore),
				verify(untamed).

hyena :-   verify(produces_laughing_sound),
			verify(eats_predator_leftovers),
			verify(limps_on_one_leg),
			 verify(wild),
			  verify(untamed).

fox :-  verify(can_be_called_wild_dog),
				 verify(similar_to_dogs),
				  verify(long_fur_pointed_ears_relatively_short_legs_and_narrow_snout).
				

tiger :-  verify( orange_and_black_striped_coats), 
			 verify(cat_family),
			  verify(wild),
		     verify(similar_to_cheetah_and_leopard).
		    	

wolf :- verify(similar_to_dogs_and_foxes),
			verify(carnivore),
			verify(less_pointed_ears_and_muzzle_as_well_as_a_shorter_torso_and_a_longer_tail),
			verify(untamed).

dog :-    verify(similar_to_wolf_and_foxes_and_wildogs),
				  verify(tamed),
				  verify(omnivore).

squirrel :-  verify(slender_bodies_with_very_long_very_bushy_tails_and_large_eyes),
		  verify(make_burrows),
		  verify(wild).

anaemia :- verify(yellow_skin),
			verify(irregular_heartbeat),
			verify(chest_pain),
			verify(dizziness),
			verify(weakness).

pig :- verify(many_body_fats),
			verify(tamed),
			verify(associated_to_demons),
			verify(omnivore),
			verify(muslims_dont_eat).


/* how to ask questions */
ask(Question) :-
    write('Does the animal have the following characteristics: '),
    write(Question),
    write(' ? '),
	nl,
    read(Response),
    nl,
    ( (Response == yes ; Response == y)
      ->
       assert(yes(Question)) ;
       assert(no(Question)), fail).

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