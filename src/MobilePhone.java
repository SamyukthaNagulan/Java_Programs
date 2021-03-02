import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    static Menu m=new Menu();
    public static ArrayList<Contact> listOfContacts;
    public static void main(String args[]) {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Enter your number: ");
            String number = reader.readLine();
            System.out.println("Enter your Id: ");


            boolean n = false;
//        System.out.println("Enter");
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        boolean n = false;
//        String name = sc.nextLine();
//        String number = sc.nextLine();
            while (!n) {
                System.out.println("Which function would you like to perform\n1)Add the Contact\n2)Remove the contact\n3)Search the contact\n4)Update the contact\n5)List all the contacts\n6)Quit");
                int c = Integer.parseInt(reader.readLine());
                switch (c) {
                    case 1:
                        m.addNewContact(listOfContacts, name, number);
                        break;
                    case 2:
                        m.removeContact(listOfContacts, name, number);
                        break;
                    case 3:
                        m.search(listOfContacts, name);
                        break;
                    case 4:
                        m.updateContact(listOfContacts, name, number);
                        break;
                    case 5:
                        m.listAllContacts(listOfContacts);
                        break;
                    case 0:
                        m.quit();
                        n = false;
                        break;
                }
            }
        }
        catch(Exception e)
        {

        }
    }

}
