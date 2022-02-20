package advanced1.ct220219.phone;

//TODO
//addNewContact
//findContact
//updateContact

import java.util.ArrayList;

public class MobilePhone {
    //Fields
    private String myNumber;
    private ArrayList<Contact> myContacts;

    //Methods

    //Constructor
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();  //initialise empty list
    }

    //addNewContact
    public boolean addNewContact(Contact contact){

        if (findContact(contact.getName()) >= 0){
            System.out.println("This contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    //Find contact by contactName
    private int findContact(String contactName){
        for (int i=0; i< myContacts.size(); i++){
            Contact temporaryContact = myContacts.get(i);
            if (temporaryContact.getName().equals(contactName)){
                return i;  // check if contains and if yes, then which position
            }
        }
        return -1;
    }

    //Find contact by contact
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    //Update Contact
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.printf("%s was not found\n", oldContact.getName());
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " +newContact.getName()+ " already exists. Update was not successful");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        System.out.printf("%s was placed with %s\n", oldContact.getName(), newContact.getName());
        return true;
    }

    //Print list of all contacts
    public void printContacts(){
        System.out.println("Contact list");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) +". "+ myContacts.get(i).getName() +" ->"+ myContacts.get(i).getPhoneNumber() );
        }
    }

    //query contact
    public Contact queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    //Remove contact
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + "was not found");
            return false;
        }
        myContacts.remove(position);
        System.out.println(contact.getName()+ "was removed");
        return true;
    }
}
