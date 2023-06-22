package PhoneBook;

public class Contacts {


    private String firstName;
    private String name;
    private String lastName;
    private String email;
    private String telephoneNumber;
    public Contacts (String name, String email, String telephoneNumber){
        this.name= name;
        this.email = email;
        this.telephoneNumber = telephoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return String.format(""" 
                Name: %s
                Telephone Number: %s
                Email: %s
                """, name, telephoneNumber, email);
    }

}
