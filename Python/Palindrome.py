x = input("Enter a name \n")
xlower=x.lower()
y = xlower

swap = xlower[::-1]
if swap == y: print(x + " is a Palindrome")
if swap != y: print(x + " is not a Palindrome ")
