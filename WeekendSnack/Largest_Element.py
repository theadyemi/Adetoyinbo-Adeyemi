
def largest_element(lst):
    largest = lst[0]  # Assume the first element is the largest

    for num in lst:
        if num > largest:
            largest = num

    return largest


my_list = [2, 33, 7, 300, 5]

a = largest_element(list)
print (a)