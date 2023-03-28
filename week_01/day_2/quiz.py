my_number = 7

user_value = int(input("Please guess a number: "))

while user_value != my_number:
    if user_value > my_number:
        user_value = int(input("Too high! Please guess again: "))
    if user_value < my_number:
        user_value = int(input("Too low! Please guess again: "))

print("You got it!")

