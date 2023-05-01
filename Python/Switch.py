# language=input("Enter preferred language: ")
# match language:
#     case "java":
#         print("You're a hardcore programmer")
#     case "javascript":
#         print("You're a full stack developer")
#     case "python":
#         print("You're an amazing programmer")
#     case _:
#         print("If you are learning programming for the first time,learn python")


language=input("Enter preferred language: ")
if language == "java":
    print("You're a hardcore programmer")
elif language == "javascript":
    print("You're a full stack developer")
elif language == "python":
    print("You're an amazing programmer")
else:
    print("If you are learning programming for the first time, learn python")
