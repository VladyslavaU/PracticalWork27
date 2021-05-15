package ua.ithillel.task4;

public class MyTestClass {
    private static final String STATIC_OUTER_STRING = "static String, outer class";
    private final String OUTER_STRING = "outer class String";

    public void test() {
        System.out.println(OUTER_STRING);
    }

    public void testLocalClass() {
        System.out.println(OUTER_STRING);
        class MyLocal {
            public void testLocal() {
                String localString = "Local class String";
                System.out.println("Printing outer String from local class: " + OUTER_STRING);
                System.out.println("Printing local String from local class: " + localString);
            }
        }
        MyLocal myLocal = new MyLocal();
        myLocal.testLocal();


    }

    public static class MyStaticNested {
        static String staticNested = "nested class String";

        public void test() {
            System.out.println("Printing static String from outer class: " + STATIC_OUTER_STRING);
            System.out.println("Printing String from nested class: " + staticNested);
        }
    }


    public class MyInner {
        public void test() {
            String innerString = "Inner class String";
            System.out.println("Printing String from outer class: " + OUTER_STRING);
            System.out.println("Printing String from inner class: " + innerString);
        }
    }
}
