package PhoneBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook myPhonebook = new PhoneBook();
    @Test
    public void testThatPhoneBookIsEmpty(){
        myPhonebook.isEmpty();
        assertEquals(true, myPhonebook.isEmpty());
    }
    @Test
    public void addContactToPhonebook(){
        myPhonebook.addContact("Adetoyinbo Adeyemi", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
        assertEquals(2, myPhonebook.getContacts());
    }

    @Test
    public void testThatMoreContactsCanBeAdded(){
        myPhonebook.addContact("Adetoyinbo Adeyemi", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.removeContact("Tiju");
        assertEquals(2, myPhonebook.getContacts());

    }

    @Test
    public void testThatPhoneBookCanSearch(){
        myPhonebook.addContact("Adetoyinbo Adeyemi", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.searchContact("Olamide");
//        assertEquals();


    }

    @Test
    public void checkPhoneBook(){
        myPhonebook.addContact("Adetoyinbo Adeyemi", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.contactList();
        assertEquals(myPhonebook.phoneBookList, myPhonebook.phoneBookList);
    }

    @Test
    public void blockContact(){
        myPhonebook.addContact("Adetoyinbo Adeyemi", "adeyemielfin@gmail.com", "08023415794");
        myPhonebook.addContact("Olaonipekun Ajanaku", "adeyemielfin@gmail.com", "08023415794");
//        myPhonebook.blockContact();


    }
}

