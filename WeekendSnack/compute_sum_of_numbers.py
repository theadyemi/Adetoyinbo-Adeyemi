#For Loop

def for_loop(list):
    sum = 0
    for num  in list:
        sum += num
    return sum

my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
a = for_loop(my_list)
print(f'Sum of total is: {a}')

def while_loop(list):
    counter = 0
    sum = 0
    while counter < len(list):
        sum += list[counter]
        counter+=1
    return sum

b = while_loop(my_list)
print(f'Sum of total using While Loop is: {b}')


def do_while(list):
    total_sum = 0
    counter = 0
    is_empty = len(list) == 0

    while True:
        if is_empty:
            break

        total_sum += list[counter]
        counter += 1

        if counter >= len(list):
            break

    return total_sum

c = do_while(my_list)
print(f'Summ of total using Do While Loop is: {c}')