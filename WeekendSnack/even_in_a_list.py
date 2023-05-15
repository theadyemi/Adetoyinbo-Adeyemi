def even_in_list(lst):
    for even in lst:
        if even % 2 == 0:
            print(even)

my_list = [1, 7, 3, 22, 54, 88, 32]
a = even_in_list(my_list)
