package AdvancedPractice;

public class MyClass {
    private String name;

    public MyClass(String name){
        this.name = name;
    }

    public void MyMethod(){
        System.out.println("A MyClass object was created with value: " +name);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (!(obj instanceof MyClass))
            return false;
        return name.equals(((MyClass)obj).name);
    }
}
