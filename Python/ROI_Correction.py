principal_amount = int(input("Enter the amount you want to invest: "))
years = int(input("Enter the number of years: "))
rate = 0.05
for year in range(1, years + 1):
    roi = principal_amount * rate  # Rate is gotten for 5% and that is 5/100
    future_value = principal_amount + roi
    principal_amount=future_value
    print(f"Year {year} return on investment is {roi:.2f}. Your principal is now {future_value:.2f} ")

    # In line 5 we did a magic. To loop in python, you use simple english. for this in this.
    # Since we are dealing with integers, we use range To count from 1 to 10, you will add 1 to the input or to
    # what you want to collect, then use slicing, start at 1 with this syntax (1, input + 1).
    # Slicing has happened before in string (1:10:5) which is start, stop, and setp. but in Int, you separate with commas.

