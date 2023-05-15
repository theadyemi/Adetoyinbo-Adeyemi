def palindrome(string):
        xlower = string.lower()
        y = xlower

        swap = xlower[::-1]
        if swap == y: print(string + " is a Palindrome")
        if swap != y: print(string + " is not a Palindrome ")

myname = 'Omo'
a = palindrome(myname)
