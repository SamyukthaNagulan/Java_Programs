import java.util.ArrayList;

public class Menu {
    ArrayList<Contact> listOfContacts;
    public void addNewContact(ArrayList<Contact> listOfContacts,String name,String number)
    {
        System.out.println("Contact added");

       // listOfContacts.add(new Contact(name,number));
    }
    public void updateContact(ArrayList<Contact> listOfContacts,String name,String number)
    {
        System.out.println("Contact Updated");
    }
    public void removeContact(ArrayList<Contact> listOfContacts,String name,String number)
    {
        System.out.println("Contact removed");
        listOfContacts.remove(new Contact(name,number));
    }
    public void search(ArrayList<Contact> listOfContacts,String name)
    {

    }
    public void listAllContacts(ArrayList<Contact> listOfContacts )
    {

    }
    public void quit()
    {

    }
}
