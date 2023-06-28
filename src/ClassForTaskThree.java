import java.lang.Math; // importing java.lang package


public class ClassForTaskThree {
    //Here is a class for the task 3. It contains enum which works with simple mathematical actiona.
    public static void main(String[] args) {

        System.out.println(Calc.ADD.action(12, 22));
        System.out.println(Calc.SUBSTRACT.action(452, 22));
        System.out.println(Calc.MULTIPLY.action(452, 2));
        System.out.println(Calc.DIVIDE.action(45, 5));
        System.out.println(Calc.EXPONENTIATION.action(4, 3));

    }
        enum Calc {
            ADD {
                @Override
                public int action(int a, int b) {
                    return a + b;
                }
            },
            SUBSTRACT {
                @Override
                public int action(int a, int b) {
                    return a - b;
                }
            },
            MULTIPLY {
                @Override
                public int action(int a, int b) {
                    return a * b;
                }
            },
            DIVIDE {
                @Override
                public int action(int a, int b) {
                    return a / b;
                }
            },
            EXPONENTIATION {
                @Override
                public int action(int a, int b) {
                    return (int) Math.pow(a, b);
                }
            };

            public abstract int action(int a, int b);

        }
    }

