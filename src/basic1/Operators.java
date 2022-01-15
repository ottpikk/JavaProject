package basic1;

public class Operators {

    public static void main(String[] args) {

        //ASSIGNMENT OPERATORS
        int a = 10;
        a += 10;
        a -= 5;
        a *= 2;
        a /= 10;
        System.out.println(a);

        //BASIC ARITHMETIC OPERATORS

        int num1 = 10;
        int num2 = 20;
        int num3 = num1 + num2;
        System.out.println(num3);

        num3 = num2 - num1 - 5;   // 5
        num3 = num2 * (num1 - 8); // 40
        num3 = num2 / num1;       //2
        num3 = 14 % 4;

        System.out.println(num3);

        //INCREMENTATION OPERATORS

        int someVariable = 100;
        //add
        someVariable += 1;
        someVariable = someVariable + 1;
        someVariable++;

        //subtract
        someVariable -= 1;
        someVariable = someVariable - 1;
        someVariable--;
        System.out.println(someVariable);

        int value1 = 10;
        value1++;
        System.out.println(value1);

        //RELATIONAL OPERATORS

        //Equality == - checks that both arguments are equal.
        int c = 10;
        int b = 10;
        boolean var1 = false;
        boolean var2 = false;
        System.out.println(var1 == var2);

        //Inequality != - checks if the two arguments are different.

        System.out.println(c != b);

        //Greater than > and greater than or equal to >= - checks whether
        // the first argument is greater than the second and greater or equal respectively.

        System.out.println(c >= b);

        //Less than < and less than or equal to <= - the opposite of the above.

        System.out.println(b <= c);

        //LOGICAL OPERATORS

        //The && - conjunction accepts two arguments of the boolean type and also
        // returns the boolean type. This can be translated as a sentence that the
        // conjunction is true if, and only if, both its arguments are true (logical product).

        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.println(boolValue1 && boolValue2);

        // || - alternative, which is a logical sum. It is true if at least one of its arguments is true.
        System.out.println(boolValue1 || boolValue2);

        // ! - negation, or contradiction. It can be translated as "it's not true that".
        System.out.println( !boolValue1 || boolValue2 );






    }
}
