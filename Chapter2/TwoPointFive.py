one_box = 6
number_of_eggs = 28
boxes = number_of_eggs//6
remainder = number_of_eggs%6
filler = one_box - remainder
print(f"""With 28 eggs, the eggs will fill {boxes} crates
with a remainder of {remainder}. He'll need {filler} more eggs
to complete another crate""")

