package ua.ithillel.task12;

public class Runner {

    public void run() {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("B", "333");
        myPhoneBook.addPhoneNumber("A", "555");
        myPhoneBook.addPhoneNumber("D", "111");
        myPhoneBook.addPhoneNumber("C", "222");
        myPhoneBook.addPhoneNumber("Y", "444");
        myPhoneBook.printPhoneBook();

        System.out.println("Print sorted by name");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();

        System.out.println("Print sorted by phone");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();
    }
}

