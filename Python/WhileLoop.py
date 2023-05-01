principal_amount = int(input("Enter the amount you want to invest: "))
years = int(input("Enter the number of years: "))
rate = 0.05
count = 1

while count <= years:
    roi = principal_amount * rate  # Rate is gotten for 5% and that is 5/100
    future_value = principal_amount + roi
    principal_amount =future_value
    print(f"Year {count} return on investment is {roi:.2f}. Your principal is now {future_value:.2f} ")
    count += 1