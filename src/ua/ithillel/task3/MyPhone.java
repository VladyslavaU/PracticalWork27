package ua.ithillel.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyPhone {
    private MyPhoneBook myPhoneBook = new MyPhoneBook();

    public MyPhone() {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
    }

    public void switchOn() {
        System.out.println("Loading PhoneBook records...");
        this.myPhoneBook.addPhoneNumber("B", "333");
        this.myPhoneBook.addPhoneNumber("A", "555");
        this.myPhoneBook.addPhoneNumber("D", "111");
        this.myPhoneBook.addPhoneNumber("C", "222");
        this.myPhoneBook.addPhoneNumber("E", "444");
        this.myPhoneBook.addPhoneNumber("Y", "555");
        this.myPhoneBook.addPhoneNumber("F", "666");
        this.myPhoneBook.addPhoneNumber("O", "777");
        this.myPhoneBook.addPhoneNumber("M", "888");
        this.myPhoneBook.addPhoneNumber("P", "999");
        this.myPhoneBook.addPhoneNumber("K", "000");
        System.out.println("Loading is complete");
    }

    public void call(int index) {
        if (index < this.myPhoneBook.getNumbers().size()) {
            System.out.println("Calling to " + this.myPhoneBook.getByIndex(index).getName());
        } else {
            System.out.println("There is no such contact");
        }
    }

    public static class MemoryCard {
        private ArrayList<MyPhoneBook.PhoneRecord> recordsOnMemoryCard = new ArrayList<>();

        public void copyToMemoryCard(MyPhoneBook.PhoneRecord record) {
            this.recordsOnMemoryCard.add(record);
        }

        public void copyAllRecordsToMemoryCard(MyPhoneBook myPhoneBook) {
            this.recordsOnMemoryCard.addAll(myPhoneBook.getAllRecords());
        }

        public void deleteRecordByIndex(int index) {
            this.recordsOnMemoryCard.remove(index);
        }

        public void clearMemory() {
            this.recordsOnMemoryCard.clear();
        }

        public ArrayList<MyPhoneBook.PhoneRecord> getRecordsFromMemoryCard() {
            return recordsOnMemoryCard;
        }


    }

    public static class MyPhoneBook {
        private ArrayList<PhoneRecord> phoneNumbers = new ArrayList<>();

        public void addPhoneNumber(String name, String phone) {
            this.phoneNumbers.add(new PhoneRecord(name, phone));
        }

        public void printPhoneBook() {
            for (PhoneRecord phoneRecord : phoneNumbers) {
                System.out.println(phoneRecord.toString());
            }
        }

        public PhoneRecord getByIndex(int index) {
            return this.phoneNumbers.get(index);
        }

        public ArrayList<PhoneRecord> getAllRecords() {
            return this.phoneNumbers;
        }

        public void sortByName() {
            this.phoneNumbers.sort(new Comparator<>() {

                @Override
                public int compare(PhoneRecord record1, PhoneRecord record2) {
                    return record1.getName().compareTo(record2.getName());
                }

            });
        }

        public ArrayList<PhoneRecord> getNumbers() {
            return this.phoneNumbers;
        }

        public void sortByPhoneNumber() {
            Collections.sort(this.phoneNumbers,
                    (record1, record2) -> record1.getPhone().compareTo(record2.getPhone()));

        }

        public static class PhoneRecord {
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getPhone() {
                return this.phone;
            }

            @Override
            public String toString() {
                return this.name + ": " + this.phone;
            }
        }
    }

}


