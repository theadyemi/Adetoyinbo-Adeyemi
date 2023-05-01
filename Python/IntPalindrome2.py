s = 0
for i in range(5):
  try:
      s += int(raw_input('Enter a number: '))
  except ValueError:
      print ('Invalid input. Counting as a zero.')
