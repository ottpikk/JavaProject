package advanced1.cT220206;

class OuterClass{
    public int num = 10;

    class InnerClass{
        public int num = 5;
    }
}


public class NestedClass {
    public static void main(String[] args) {

    OuterClass outerClass = new OuterClass();
    System.out.println(outerClass.num);

    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    System.out.println(innerClass.num);

    }



}
