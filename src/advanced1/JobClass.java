package advanced1;

class Member{
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected int salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void generalInfo(){
        System.out.println( "Name: " +  name +"\n" +
                            "Age: " +   age + "\n" +
                            "Phone: "+  phoneNumber + "\n" +
                            "Address: "+address + "\n");
    }
}

class Employee extends Member{
    protected String specialization;
}

class Manager extends Member{
    protected String department;
}


public class JobClass {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.name = "John";
        employee.age = 45;
        employee.phoneNumber = "+372 562 59874 5";
        employee.address = "fdjfd 45";
        employee.salary = 2000;
        employee.specialization = "welder";
        employee.generalInfo();
        employee.printSalary();


        manager.name = "Timothy";
        manager.age = 48;
        manager.phoneNumber = "+372 454 455";
        manager.address = "Green 45";
        manager.salary = 3000;
        manager.department = "sales";
        manager.generalInfo();
        manager.printSalary();


    }
}
