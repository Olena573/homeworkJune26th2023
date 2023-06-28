// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.

            //Here is a task 1. Class A with subclass B belongs to it.

        A a1 = new A ("Some Object");
        //a1 is an object of class A;
        A.B b1 = new A.B ("a particular subtype");
        //b1 is an object of class B, which belongs to class A;
        a1.printing();
        a1.getObjectName();
        b1.getObjectType();
        b1.print();
        //Here we used some methods of the class B.


    }
}