def mulitiplication_table(multiply, multiplier):
    for multiply in range(1, multiply+1):
        for multiplier in range(1, multiplier+1):
            print(end="  "f"{multiply: >3} x {multiplier} = {multiply * multiplier:>3}   ")
        print(f"\n")

mult = int(input("Enter multiplier \n"))
multipli = int(input("Enter multiplied \n"))
(mulitiplication_table(mult, multipli))