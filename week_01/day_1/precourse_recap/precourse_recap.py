my_name = "Zoe"
age = 28
course_weeks_left = 16
print("My name is " + my_name + ", I am " + str(age) + " years old, and I have " + str(course_weeks_left) + " weeks left until I am a coder!")

current_week = 1
current_day_of_week = 1
total_course_weeks = 16
total_course_days_of_week = 5

def weeks_to_go():
    weeks_left = total_course_weeks - current_week
    days_left = total_course_days_of_week - current_day_of_week
    print(f"Only {weeks_left} weeks and {days_left} days to go!")

def motivate_me():
    print("We got this! Doing great!!")

weeks_to_go()
motivate_me()