package advanced1.ct220219.phone;

public class Contact {

    //Fields
    private String name;
    private String phoneNumber;

    //Methods
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Setter
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
