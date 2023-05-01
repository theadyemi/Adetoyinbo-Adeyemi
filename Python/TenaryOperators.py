score = int(input("Enter your score: "))
if score <= 40:
    print ("You fail this course")
else:
    print("You passed, congratulations")

result = "You fail this course" if score >= 40 else "You passed, congratulations!"