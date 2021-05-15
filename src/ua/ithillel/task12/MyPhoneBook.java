package ua.ithillel.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyPhoneBook {
    private ArrayList<PhoneRecord> phoneNumbers = new ArrayList<>();

    public void addPhoneNumber(String name, String phone) {
        this.phoneNumbers.add(new PhoneRecord(name, phone));
    }

    public void printPhoneBook() {
        for (PhoneRecord phoneRecord : phoneNumbers) {
            System.out.println(phoneRecord.toString());
        }
    }

    public void sortByName() {
        this.phoneNumbers.sort(new Comparator<>() {
            @Override
            public int compare(PhoneRecord record1, PhoneRecord record2) {
                return record1.getName().compareTo(record2.getName());
            }

        });
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






