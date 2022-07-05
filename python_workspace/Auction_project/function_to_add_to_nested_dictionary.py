travel_log =[
    {
        "country":"France",
        "visits":12,
        "cities":["paris" , "lille" , "dijon"]
    },
    {
        "country":"Germany",
        "visits":5,
        "cities":["Berlin","hamburg","Bayern"]
    }
]
def add_new_country(country_name,no_visits,list_cities):
    new_country = {}
    new_country["country"] = country_name
    new_country["visits"]= no_visits
    new_country["cities"]=list_cities

    travel_log.append(new_country)

add_new_country("England",2,["manchester","villa","arsenal"])
print(travel_log)

