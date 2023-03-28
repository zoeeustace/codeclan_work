# def greet(name, time_of_day):
#     return "Good " + time_of_day + " " + name

# name_1 = "Zoe"
# time_of_day_1 = "morning"

# name_2 = "Steve"
# time_of_day_2 = "evening"

# greeting = greet(name_1, time_of_day_1)
# greeting2 = greet(name_2, time_of_day_2)
# print(greeting)
# print(greeting2)

# def greet():
#     words = "Hey"
#     return words

# print(greet())

# def greet_two():
#     return words
# print(greet_two())

# chickens2 = [
#   { "name": "Margaret", "age": 2, "eggs": 0 },
#   { "name": "Hetty", "age": 1, "eggs": 2 },
#   { "name": "Henrietta", "age": 3, "eggs": 1 },
#   { "name": "Audrey", "age": 2, "eggs": 0 },
#   { "name": "Mabel", "age": 5, "eggs": 1 },
# ]

# total_eggs = 0
# for chicken in chickens:
#     total_eggs += chicken["eggs"]
#     chicken["eggs"] = 0

# above counts the total eggs and removes the eggs from each chicken

# print(f"{total_eggs} eggs collected")

# def count_eggs(list):
#     total_eggs = 0
#     for chicken in list:
#         total_eggs += chicken["eggs"]
#         chicken["eggs"] = 0

#     return f"{total_eggs} eggs collected"

# print(count_eggs(chickens2))

# def find_chicken_by_name(list, chicken_name):
#     for chicken in list:
#         if chicken["name"] == chicken_name:
#             return chicken
        
#     return None

# def find_chicken_by_name(list, chicken_name):
#     found_chicken = None
#     for chicken in list:
#         if chicken["name"] == chicken_name:
#             found_chicken = chicken
        
#     return found_chicken  


# print(find_chicken_by_name(chickens2, "Mabel"))     


users = [
  { "user_id": 1, "first_name": "Guido", "last_name": "van Rossum" },
  { "user_id": 2, "first_name": "Katherine", "last_name": "Johnson" },
  { "user_id": 3, "first_name": "Dorothy", "last_name": "Vaughan" },
  { "user_id": 4, "first_name": "Hen", "last_name": "Solo" },
  { "user_id": 5, "first_name": "Mary", "last_name": "Jackson" },
]

def find_user_by_id(list, id):
    found_user = None
    for user in list:
        if user["user_id"] == id:
            found_user = user
    return found_user

print(find_user_by_id(users, 4))   






