
def extract_username_from_email(email):
    if "@" in email:
        name = email.split("@")[0]
        return name
    else:
        return None
name = input("Enter your username: ")
def email(name):
    new_name = name[:-10]
    return new_name
print(f'Your name is: {email(name)}')

b = email("Olaosebikan@gmail.com")
a = extract_username_from_email('adeyemielfin@gmail.com')
print(a)
