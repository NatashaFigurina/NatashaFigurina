package lesson_13.task_2;

public class PersonData {
    protected String name;
    protected String phone;

    public PersonData(String phone, String name) {
        this.name = name;
        this.phone = phone;
    }

    public void toPrint() {
        System.out.printf("Фамилия: %s, номер телефона: %s\n", name, phone);
    }

    @Override
    public int hashCode() {
        return phone.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PersonData personData = (PersonData) o;
        return phone.equals(personData.phone);
    }
}

