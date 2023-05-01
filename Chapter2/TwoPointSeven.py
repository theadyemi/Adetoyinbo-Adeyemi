jonah_friends = 4
marbles = 22

share_marbles = marbles/jonah_friends
marbles_remainder = marbles%jonah_friends
if marbles%jonah_friends == 0:
    print("Marbles can be shared equally")
elif marbles%jonah_friends == 1 or 2 or 3:
    print("Marbles cannot be shared Equally")

