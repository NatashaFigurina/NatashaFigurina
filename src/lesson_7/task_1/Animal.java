package lesson_7.task_1;

public class Animal {
    public String name;
    protected String type;
    public static int countObjectAnimal;




    public Animal (){
        countObjectAnimal++;
    }

    public Animal(String type, String name){
        this.name = name;
        this.type = type;
    }

    public void isSwim (int num){
        System.out.println (type +" " + name +" " +"проплыл" + " " + num + "м");
    }


    public void isRun (int num){
        System.out.println (type +" " + name +" " +"пробежал" + " " + num + "м");
    }
}