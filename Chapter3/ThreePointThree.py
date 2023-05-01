#The code prints arrows in opposite direction. It uses the modulus of result 1 to print to left direction
# It uses the modulus of 0 or whatever to print to right direction.
for row in range(10):
    for column in range(10):
        print('<' if row % 2 == 1 else '>', end='')
    print()