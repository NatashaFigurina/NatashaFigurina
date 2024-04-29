
public class Main {
    public static void main(String[] args) {
        String newFio = "Иванов Петр Петрович";
        String newPosition = "Директор";
        String newEmail = "Ivanov@mail.ru";
        String newPhoneNumber = "538737378";
        int newWage = 100000;
        int newAge = 45;

        Employee employee = new Employee(newFio, newPosition,  newEmail, newPhoneNumber, newWage, newAge);
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
        Park.AttractionInfo attractionOne = attraction.new AttractionInfo();
        attractionOne.getInfo();

    }
}
