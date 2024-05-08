package src;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String _fullName, String _post,  String _email, String _phoneNumber, int _salary, int _age) {
        this.fullName = _fullName;
        this.post = _post;
        this.email = _email;
        this.salary = _salary;
        this.phoneNumber = _phoneNumber;
        this.age = _age;
    }

    public void getInfo () {
        System.out.println("ФИО: " + fullName + "\n"  + "должность: " + post + "\n"
                + "почта: " + email +"\n" + "номер телефона: " + phoneNumber + "\n"
                + "заработная плата: " + salary +"\n" + "возраст:" + age + "\n");
    }
}
