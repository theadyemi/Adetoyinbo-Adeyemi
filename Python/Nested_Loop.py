found = False
names = ["sultan", "david", "mariam", "lateef"]
for name in names:
    if name.startswith("l"):
        print("Found")
        found = True
        break
else:
   print("Not Found")