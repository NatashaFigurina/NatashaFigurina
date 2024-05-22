package lesson_6;

public class Main {
    public static void main(String[] args) {
        String newFullName = "Иванов Петр Петрович";
        String newPost = "Директор";
        String newEmail = "Ivanov@mail.ru";
        String newPhoneNumber = "538737378";
        int newSalary = 100000;
        int newAge = 45;

        Employee employee = new Employee(newFullName, newPost,  newEmail, newPhoneNumber, newSalary, newAge);
        employee.getInfo ();

        Employee [] personArray = new Employee [5];
        personArray [0] = new Employee("Сидоров Ян Ильич", "инженер", "sidorov@mail.ru", "5555555", 100000, 40);
        personArray [1] = new Employee("Иванов Ян Ильич", "инженер-строитель", "ivanov@mail.ru", "444444", 200000, 41);
        personArray [2] = new Employee("Петров Ян Ильич", "кассир", "petrov@mail.ru", "3333333", 300000, 42);
        personArray [3] = new Employee("Петров Иван Ильич", "продовец", "petrovivan@mail.ru", "2222222", 400000, 43);
        personArray [4] = new Employee("Федоров Иван Ильич", "продовец", "fedor@mail.ru", "1111111", 500000, 44);

        for (Employee person: personArray){
            person.getInfo();
        }

        Park attraction = new Park ();
        Park.Attraction attraction1 = attraction.new Attraction("карусель", "с 9:00 до 15:00", 5);
        Park.Attraction attraction2 = attraction.new Attraction("горки", "с 9:00 до 21:00", 10);
        attraction1.getInfo();
        attraction2.getInfo();

    }
}
