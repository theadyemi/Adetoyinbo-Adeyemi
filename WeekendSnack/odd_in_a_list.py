def odd_in_list(lst):
    for odd in lst:
        if odd % 2 == 1:
            print(odd)

my_list = [1, 7, 3, 22, 54, 88, 32]
a = odd_in_list(my_list)
