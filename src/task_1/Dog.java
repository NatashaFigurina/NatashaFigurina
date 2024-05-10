package src.task_1;

public class Dog extends Animal {
    public static int countObject;
    public Dog (String type,String name) {
        super(type,name);
        this.countObject++;

    }

    public void isSwimDog(int num) {
        if (num >= 10) {
            System.out.println(type + " " + name + " " + "проплыл" + " " + num + "м");
        }
        else {
            System.out.println( "Дaльше не могу плыть!" );
        }
    }

    public void isRunDog(int num) {
        if (num > 500) {
            System.out.println(type + " " + name + " " + "не может бежать больше 500 метров");
        }
        else {
            System.out.println(type+ " " + name + " " + "пробежал" + " " + num + "м");
        }
    }
}
