package BiblioAdvanced;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String firstName ="";
    private String lastName ="";
    private Calendar birthday = new GregorianCalendar(1900,1,1);

    public Person (String firstName, String lastName, Calendar birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public String fullName(){
        return firstName +" "+ lastName;
    }

    public int age (Calendar today){
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }

}
