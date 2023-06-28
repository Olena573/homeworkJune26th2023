import javax.management.ObjectName;

public class A {
    //Here is a class A;
    public static String ObjectName;

    public void printing() {
        System.out.println("This is a method of class A," + '\n' +
                "This is a String value of class A: " + ObjectName);
    }

    public A(String ObjectName) {
        //Here is a constructor which works with data of the class A
        this.ObjectName = ObjectName;
    }

    public String getObjectName() {
        return ObjectName;
    }

    public void setObjectName(String ObjectName) throws Exception {
        if (ObjectName == null) {
            try {
                throw new Exception("Who knows, How this object is called.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.ObjectName = ObjectName;
    }



    public static class B {
        //here is a subclass B of class A;
        public String SomeWords = "The Object has ";
        public static String ObjectType;
        public B (String ObjectType) {
            //Here is a constructor which works with data of the class B
            this.ObjectType = ObjectType;
        }

        public String getObjectType() {
            return ObjectType;
        }
        //I write exceptions for the case;
        public void setObjectType(String ObjectName) throws Exception {
            if (ObjectType == null) {
                try {
                    throw new Exception("Who knows, How this object is called.");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            this.ObjectType = ObjectType;
        }


        public void print() {
            System.out.println("This is a method of class B, " + '\n' +
                    SomeWords + ObjectType);
        }

    }
}


