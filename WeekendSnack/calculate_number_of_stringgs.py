def calculate_numbers(enter_list):
    count_male = 0
    count_females = 0
    for i in enter_list:
        if i.lower() == ("male"):
            count_male += 1
        if i.lower() == ("female"):
            count_females += 1
    print(f"[Male = {count_male}], [Female = {count_females}]")

my_list= ["Male", "Female", "Female", "Male", "Female", "Male", "Female", "Female"]
a = calculate_numbers(my_list)
print(a)


