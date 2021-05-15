package ua.ithillel.task4;

public class Runner {

    public void run() {
        MyTestClass myTestClass = new MyTestClass();
        System.out.println("Test myTestClass:");
        myTestClass.test();
        System.out.println("--------------------------------");
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        System.out.println("Test myStaticNested");
        myStaticNested.test();
        System.out.println("---------------------------------");
        System.out.println("Test MyInner");
        MyTestClass.MyInner myInner = myTestClass.new MyInner();
        myInner.test();
        System.out.println("-----------------------------------");
        System.out.println("Test MyLocal");
        myTestClass.testLocalClass();
    }
}
