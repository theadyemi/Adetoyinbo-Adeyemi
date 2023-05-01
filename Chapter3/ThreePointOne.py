passes = 0
failures = 0
inputs = 20
enter_number = int(i                                                   nput("Enter result (1 = pass, 2=fail): '"))
for real_inputs in range (inputs):
    if enter_number == 1 or 2:
        for types in range (inputs):
          if enter_number == 1:
            passes = passes + 1
        else:
            failures = failures + 1
    print ('Passed: ', passes)
    print ('Failed: ', failures)

else:
    enter_number = int(input("Enter result (1 = pass, 2=fail): '"))