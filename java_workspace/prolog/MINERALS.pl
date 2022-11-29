       /*DENNIS ONDARA  ESC/00018/020*/

go :- hypothesize(Mineral),
      write('I guess that the mineral is a:'),
      write(Mineral),
      nl,
      undo.

hypothesize(coffee)	:-coffee,!.
hypothesize(tea)	:-tea,!.
hypothesize(gold)	:-gold,!.
hypothesize(naturalgas)	:-naturalgas,!.
hypothesize(crudeoil)	:-crudeoil,!.
hypothesize(helium)	:-helium,!.
hypothesize(bronze)	:-bronze,!.
hypothesize(titanium)	:-titanium,!.
hypothesize(corn)	:-corn,!.
hypothesize(soybeans)	:-soybeans,!.
hypothesize(beans)	:-beans,!.
hypothesize(diamond)	:-diamond,!.
hypothesize(platinum)	:-platinum,!.
hypothesize(rice)	:-rice,!.
hypothesize(peanut)	:-peanut,!.
hypothesize(tin)	:-tin,!.
hypothesize(mercury)	:-mercury,!.
hypothesize(aluminium)	:-aluminium,!.
hypothesize(oranges)	:-oranges,!.
hypothesize(ethanol)	:-ethanol,!.
hypothesize(uranium)	:-uranium,!.
hypothesize(sulphur)	:-sulphur,!.
hypothesize(coal)	:-coal,!.
hypothesize(plutonium)	:-plutonium,!.
hypothesize(lead)	:-lead,!.
hypothesize(ironore)	:-ironore,!.
hypothesize(copper)	:-copper,!.
hypothesize(graphite)	:-graphite,!.
hypothesize(hydrogen)	:-hydrogen,!.
hypothesize(cotton)	:-cotton,!.
hypothesize(cattle)	:-cattle,!.
hypothesize(cocoa)	:-cocoa,!.
hypothesize(milk)	:-milk,!.
hypothesize(palmoil)	:-palmoil,!.
hypothesize(wheat)	:-wheat,!.
hypothesize(sugar)	:-sugar,!.
hypothesize(bananas)	:-bananas,!.
hypothesize(pyrethrum)	:-pyrethrum,!.
hypothesize(palladium)	:-palladium,!.
hypothesize(millet)	:-millet,!.
hypothesize(barley)	:-barley,!.
hypothesize(vegetables)	:-vegetables,!.
hypothesize(flaxseeds)	:-flaxseeds,!.
hypothesize(machinery)	:-machinery,!.
hypothesize(nuclearchemicals)	:-nuclearchemicals,!.
hypothesize(fertilizer)	:-fertilizer,!.
hypothesize(preciousstones):-preciousstones,!.
hypothesize(grapes)	:-grapes,!.
hypothesize(sunflower)	:-sunflower,!.
hypothesize(chlorine)	:-chlorine,!.
hypothesize(flourspar):-flourspar,!.

hypothesize(unknown).
			
			
coffee:-	verify(a_beverage),
		verify(used_as_stimulant),
		verify(grows_in_form_of_red_berries),
		verify(has_varieties_robusta_and_arabica).

tea:-	verify(mainly_grows_on_mountain_regions),
		verify(its_green),
		verify(a_common_beverage_in_kenya),
		verify(harvested_weekly).

gold:-	verify(used_in_motherboards),
		verify(used_in_jewellery),
		verify(its_shiny),
		verify(used_in_dentistry_as_tooth_replacement).

naturalgas:-	verify(used_in_home_heating),
		verify(used_to_produce_electricity),
		verify(used_to_make_liquified_petroleum_gas),
		verify(used_in_cooking).

crudeoil:-	verify(used_to_make_aviation_fuel),
		verify(it_is_produce_by_fossils_pressured_for_years),
		verify(its_by_product_is_used_to_make_plastics),
		verify(used_to_make_lubricants_and_fuel).

helium:-	verify(lighter_than_air),
		verify(use_in_weather_balloons),
		verify(used_in_aircraft_tyres_to_its_light_weight),
		verify(non_flammable).

bronze:-	verify(used_to_make_coins),
		verify(it_consists_of_copper),
		verify(naturally_resistant_to_corrosion),
		verify(its_a_yellowish_brown_metal).

titanium:-	verify(has_very_high_melting_point),
		verify(its_very_expensive),
		verify(used_on_bodies_of_supersonic_aircrafts),
		verify(its_chemical_symbol_is_ti).

corn:-	verify(ground_into_ugali_flour),
		verify(yellow_corn_is_processed_into_animal_feed),
		verify(has_tap_roots),
		verify(grows_on_maize_cobs).

soybeans:-	verify(used_to_tofu),
		verify(used_to_make_animal_feed),
		verify(used_to_make_soya_milk),
		verify(used_to_make_sossi).

beans:-	verify(high_in_protein),
		verify(mostly_red_in_color),
		verify(white_varied_is_mostly_processed_into_baked_beans),
		verify(a_legume).

diamond:-	verify(used_on_drill_bits),
		verify(the_hardest_mineral),
		verify(acts_as_a_prism_in_the_presence_of_light),
		verify(used_in_jewellery).

platinum:-	verify(used_in_dentistry),
		verify(used_in_catalytic_converters),
		verify(used_in_increase_the_rate_of_a_chemical_reaction),
		verify(symbol_of_wealth).

rice:-	verify(the_smallest_grain),
		verify(grows_mostly_in_marshy_area),
		verify(has_high_starch_content),
		verify(varieties_are_basmati_and_pishori).

peanut:-	verify(used_to_make_peanut_butter),
		verify(a_legume),
		verify(its_flowers_go_into_the_ground_to_produce_the_nuts),
		verify(the_nut_is_mostly_roasted).

tin:-	verify(coated_on_steel_cans_to_prevent_rusting),
		verify(its_chemical_symbol_is_sn),
		verify(its_a_silvery_colored_metal),
		verify(its_soft_enough_to_cut_with_little_force).

nickel:-	verify(chemical_symbol_is_ni),
		verify(its_a_silvery_white_lustrous_metal_with_a_slight_golden),
		verify(second_most_abundant_element_in_the_earths_core_after_iron),
		verify(sometimes_added_to_glass_to_give_it_a_green_color).

aluminium:-	verify(its_a_light_weight_metal),
		verify(can_absorb_impact_or_shock),
		verify(the_metal_is_used_in_sports_cars),
		verify(can_easily_be_molded_or_deformed).

oranges:-	verify(used_to_make_orange_juice),
		verify(its_a_citrus_fruit),
		verify(its_bright_yellow_when_ripe),
		verify(round_in_shape).

ethanol:-	verify(used_to_manufacture_alcohol),
		verify(used_in_perfumes_and_cosmetics),
		verify(its_an_alkyl_alcohol),
                verify(has_a_wine_like_odor),
		verify(its_flammable).

uranium:-	verify(used_to_produce_electricity),
                verify(a_very_heavy_metal_which_can_be_used_as_an_abundant_source_of_concentrated_energy),
		verify(used_in_nuclear_reactors),
		verify(chemical_symbol_is_u),
		verify(it_has_radioactive_properties).

sulphur:-	verify(bright_yellow_in_color),
                verify(chemical_symbol_is_s),
		verify(mainly_a_product_on_a_volcanic_mountain),
		verify(its_nonmettalic),
		verify(crystalline_at_room_temperature).

coal:-	verify(its_purely_carbon),
                verify(used_as_fuel_to_generate_electricity),
		verify(can_be_burned_to_produce_extremely_high_temperatures),
                verify(black_or_brownish_black_sedimentary_rock),
		verify(its_appearance_is_like_charcoal),
		verify(its_combustible).

plutonium:-	verify(used_to_make_nuclear_reaction),
                verify(its_highly_radioactive),
		verify(used_to_make_nuclear_bombs),
		verify(a_highly_reactive_metal).
		

lead:-	verify(maily_used_in_lead_acid_accumulators),
		verify(its_a_highly_poisonous_in_water_bodies),
		verify(chemical_symbol_is_pb),
		verify(soft_and_shiny_gray).

ironore:-	verify(its_alloy_is_used_to_produce_steel),
		verify(used_to_manufacture_ball_bearings),
		verify(chemical_symbol_is_fe),
		verify(its_hard_and_brittle).

copper:-	verify(used_to_make_electricity_cables),
		verify(used_to_make_boilers),
		verify(very_good_conductor_of_heat),
		verify(very_good_conductor_of_electricity).

graphite:-	verify(used_to_make_pencils),
                verify(contains_stacked_layers_of_graphene),
		verify(good_conductor_of_electricity),
		verify(an_extremely_brittle_metal),
		verify(its_crystalline_in_nature).

hydrogen:-	verify(its_a_gas),
		verify(its_used_in_fuel_cell_vehicles),
		verify(burns_explosively_in_air_when_in_excess),
		verify(used_in_acetylene_welding_when_mixed_with_oxygen).

cotton:-	verify(used_to_make_cloths),
		verify(white_in_color),
		verify(its_soft),
                verify(grows_in_a_boll),
		verify(its_fluffy).

cattle:-	verify(its_a_live_animal),
		verify(it_gives_beef),
		verify(it_produces_milk),
		verify(its_a_domesticated_animal).

cocoa:-	verify(used_to_produce_chocolate),
		verify(grows_in_cocoa_pods),
		verify(highest_grower_is_ghana),
		verify(also_called_cacao_bean).

milk:-	verify(produces_cheese),
		verify(used_to_produce_ghee),
		verify(used_to_produce_butter),
                verify(used_to_produce_yoghurt),
		verify(used_to_produce_ice_cream).

palmoil:-	verify(used_for_cooking),
		verify(used_for_making_soap),
		verify(it_comes_from_oil_palm_trees),
		verify(its_an_edible_vegetable_oil).

wheat:-	verify(used_to_make_baking_flour),
		verify(it_is_a_grain),
		verify(its_a_grass_widely_cultivated_for_its_seeds),
		verify(its_a_cereal_grain_widely_used_as_staple_food).

sugar:-	verify(produced_from_sugarcane),
		verify(used_in_confectionaries),
		verify(used_to_add_sweet_taste_to_products),
		verify(are_in_the_form_of_small_crystalls).

bananas:-	verify(bight_yellow_when_ripe),
		verify(has_no_seeds),
		verify(can_be_cooked_or_ripened),
                verify(most_widely_eaten_and_grown_tropical_fruits),
		verify(grow_mainly_in_the_tropics).

pyrethrum:-	verify(used_to_make_insectisides),
		verify(contains_pyrethrin_in_its_flowers),
		verify(used_to_manufacture_environmentally_friendly_pesticide),
		verify(has_white_flowers).

palladium:-	verify(shiny_silvery_metal),
		verify(used_in_ground_water_treatment),
		verify(used_in_jewellery),
		verify(stronger_but_heavier_than_titanium).

millet:-	verify(its_small_seeded_grains),
		verify(mostly_brown_in_color),
		verify(grows_like_maize),
		verify(its_drought_resistant).

barley:-	verify(used_to_make_beer),
		verify(used_to_make_animal_feeds),
		verify(used_as_hay),
		verify(added_to_wheat_flour_to_make_baking_flour).

vegetables:-	verify(used_in_salads),
		verify(green_in_color),
		verify(consumed_by_humans_and_animals),
		verify(includes_crops_like_kales_and_cabbage).

flaxseeds:-	verify(added_to_baking_flour_for_texture),
		verify(used_to_manufacture_cooking_oil),
		verify(are_small_black_seeds),
		verify(contains_proteins_and_aids_in_digestion).

machinery:-	verify(used_in_spraying_of_plants),
		verify(used_in_harvesting),
		verify(used_to_construct_roads),
		verify(used_in_movement_of_cargo).

nuclearchemicals:-	verify(used_in_nuclear_reactors),
		verify(used_to_produce_electricity),
		verify(used_to_manufacture_nuclear_weapons),
		verify(used_to_power_millitary_submarines).

fertilizer:-	verify(contains_nutrients),
		verify(adds_nutrients_to_the_soil),
		verify(mainly_manufactured_in_russia),
		verify(contain_synthentic_nutrients).

preciousstones:-	verify(used_in_ornaments),
		verify(used_for_beautification),
		verify(consists_of_rubby),
		verify(they_are_crystalline).

grapes:-	verify(making_of_wine),
		verify(a_fruit),
		verify(dark_blue_in_color),
		verify(grows_in_the_tropics).

sunflower:-	verify(used_manufacture_cooking_oil),
		verify(used_to_manufacture_soap),
		verify(it_has_bright_yellow_flowers),
		verify(its_flower_tracks_the_sun).

chlorine:-	verify(used_in_water_treatment),
		verify(used_to_make_sodium_chloride),
		verify(used_as_a_bleach),
		verify(used_as_a_solvent).

flourspar:-	verify(used_to_make_flouride),
		verify(used_to_make_toothpaste),
		verify(one_of_its_products_is_flourite),
		verify(used_to_manufacture_insulating_form).

mercury:- verify(a_liquid_metal_at_room_temperature),
           verify(silver_bright_colored), 
           verify(its_a_poisonous_metal),
           verify(used_in_thermometer_tubes).



        


/* how to ask questions */
ask(Question) :-
    write('Does the mineral have the following characteristics: '),
    write(Question),
    write('? '),
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