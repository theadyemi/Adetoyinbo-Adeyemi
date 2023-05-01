investor = (input('Please enter an amount you want to invest \n'))
number_of_years = (input('Please enter number of years \n'))
cast_amount = int(investor)
cast_years = int(number_of_years)

storage = cast_amount

for roi in range(cast_years):
    x = storage * (5 / 100)
    storage2 = storage + x
    storage = storage2
    print(f" Your interest rate for year {roi +1} is {x:.2f}, your new balance is {storage2:.2f}")



#Convert to a function
def investment()


