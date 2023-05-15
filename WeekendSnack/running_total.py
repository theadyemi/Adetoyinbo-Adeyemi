def running_total(lst):
    total = 0
    result = []
    for num in lst:
        total += num
        result.append(total)
    print(f'Here is the list you entered: {lst}')
    print(f'Here is the running total: {result}')
    return total

list = [2, 7, 8, 9, 10]
a = running_total(list)
print(f'Here is the total: {a}')
