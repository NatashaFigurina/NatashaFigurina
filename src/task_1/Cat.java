package src.task_1;

public class Cat extends Animal {

    public static int countObject;
    public boolean satiety;
    public int portion;


    public Cat(String type,String name, boolean satiety, int portion) {
        super(type,name);
        this.countObject++;
        this.satiety = satiety;
        this.portion = portion;
    }


    public void isSwimCat(int num) {
        if (num >= 0) {
            System.out.println(type + " " + name + " " + "не умеет плавать");
        }
        else {
            System.out.println( "Дистанция заплыва для кота" + " " + name + " " + "не может быть отрицательной (" + num + ")");
        }
    }

    public void isRunCat(int num) {
        if (num > 200) {
            System.out.println(type + " " + name + " " + "не может бежать больше 200 метров");
        }
        else {
            System.out.println(type + " " + name + " " + "пробежал" + " " + num + "м");
        }
    }
    public void eat(Bowl p) {
        p.decreaseFood(portion);
    }

}