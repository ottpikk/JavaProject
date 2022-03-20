package Advanced2.BookLibrary.factory;

import Advanced2.BookLibrary.model.Person;

public class PersonFactory {

    public Person createPerson(long id, int age, String name){
        Person person = new Person();
        person.setId(id);
        person.setAge(age);
        person.setName(name);
        return person;
    }
}
