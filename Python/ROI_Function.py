# Convert to a function
def investment (principal_amount, years):
    rate = 0.05
    for year in range(1, years + 1):
        roi = principal_amount * rate  # Rate is gotten for 5% and that is 5/100
        future_value = principal_amount + roi
        principal_amount = future_value
        print(f"Year {year} return on investment is {roi:.2f}. Your principal is now {future_value:.2f} ")


amount = int(input("Enter the amount you want to invest: "))
years_call = int(input("Enter the number of years: "))
investment(amount, years_call)