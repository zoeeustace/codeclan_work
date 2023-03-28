# SET animal = INPUT "what aniomal are you?"
# IF animal is "chicken"
#   THEN PRINT "This is my favourite animal!"
# ELSE IF animal is "dog"
#   THEN PRINT "I love dogs!"
# ELSE
#   THEN PRINT "I prefer chickens..."
# END

animal = input("What animal are you? ")

if animal == "chicken":
    print("This is my favourite animal!")

elif animal == "dog":
    print("I love dogs!")
else:
    print("I prefer chickens...")

result = "pass" if animal == "chicken" else "fail"
