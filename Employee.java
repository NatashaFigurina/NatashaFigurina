public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int wage;
    private int age;

    public Employee (String _fio, String _position,  String _email, String _phoneNumber, int _wage, int _age) {
        this.fio = _fio;
        this.position = _position;
        this.email = _email;
        this.wage = _wage;
        this.phoneNumber = _phoneNumber;
        this.age = _age;
    }

    public void getInfo () {
        System.out.println("ФИО: " + fio + "\n"  + "должность: " + position + "\n"
                + "почта: " + email +"\n" + "номер телефона: " + phoneNumber + "\n"
                + "заработная плата: " + wage +"\n" + "возраст:" + age + "\n");
    }
}
