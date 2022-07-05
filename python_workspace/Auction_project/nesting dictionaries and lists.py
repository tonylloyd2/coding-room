from ast import For


capitals = {
    "Kenya":"Nairobi",
    "Germany":"berlin"
}
# nesting list in Dictionary
travel_log = {

    "Kenya":["Bungoma"," Migori"," Sondu"],
    "Germany":["Dortmund ","Leverkusen","Wolsburg",]
}
# nesting a dictionary in a dictionary
travel_log2 = {

    "Kenya": {"cities_visited" : ["Bungoma"," Migori"," Sondu"] , "total_visits" : [34,445,8 ]},
    "Germany": {"cities_visited" : ["Dortmund ","Leverkusen","Wolsburg",]}
}

# for key in capitals:
    # print(key +": "+ capitals[key])
for key in travel_log2:
    print(f"{key} : {travel_log2[key]}")

# nesting  dictionary in a list
travel_log2 = [

    {
        "Kenya": {
            "cities_visited" : ["Bungoma"," Migori"," Sondu"] , 
            "total_visits" : [34,445,8 ]}
    },
    {
        "Germany": {
            "cities_visited" : ["Dortmund ","Leverkusen","Wolsburg",]} 
    }
]