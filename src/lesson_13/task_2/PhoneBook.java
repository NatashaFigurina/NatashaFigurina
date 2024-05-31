package lesson_13.task_2;

import java.util.*;

public class PhoneBook {

    public PhoneBook() {
    }

    public HashSet<PersonData> book = new HashSet<>();

    public void add(String phone, String name) throws PhoneExists {
        PersonData personData = new PersonData(phone, name);
        if (book.contains(personData)) {
            throw new PhoneExists(String.format("Номер телефона %s уже есть в справочнике", phone));
        }
        book.add(personData);
    }

    public void toPrint(HashSet<PersonData> personsData) {
        if (personsData.isEmpty()) {
            System.out.println("Нет данных");
        }
        for (PersonData personData : personsData) {
            personData.toPrint();
        }
    }

    public HashSet<PersonData> get(String name) {
        HashSet<PersonData> persons = new HashSet<>();
        for (PersonData personData : book) {
            if (personData.name.equals(name)) {
                persons.add(personData);
            }
        }
        return persons;
    }
}
