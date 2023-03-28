empty_dictionary = {}
other_empty_dictionary = dict()

car = {
    "make": "Ford",
    "model": "Fiesta",
    "engine_size": 1300,
    "colour": "Red",
    "engine": {
        "make": "Toyota",
        "model": "A2365"
    },
    "passengers":[]
}

print(car["model"])

print(car.get("fuel_type", "No fuel type specified"))

has_a_fuel_type = "fuel_type" in car
print(has_a_fuel_type)

car["colour"] = "green"
print(car["colour"])
car["length"] = str(2) + "m"

print(car)

del car["engine_size"]
print(car)

print(car.keys())
print(list(car))
print(car.values())

engine_make = car["engine"]["make"]
print(engine_make)