package lesson_7;

import lesson_7.task_1.Animal;
import lesson_7.task_1.Dog;
import lesson_7.task_1.Cat;
import lesson_7.task_1.Bowl;
import lesson_7.task_2.Circle;
import lesson_7.task_2.Rectangle;
import lesson_7.task_2.Triangles;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws task_1.WrongVolumeFoodException {
        task1();
        task2();
    }

    public static void task1() throws task_1.WrongVolumeFoodException {
        animalsCalculate();
        feedCats();
    }
    public static void animalsCalculate() {
        new Animal();

        System.out.println("Создано объектов животных: " + Animal.countObjectAnimal);

        Cat cat = new Cat("кот", "СНОУ", false, 10);
        System.out.println("Создано объектов котов: " + Cat.countObject);

        cat.isSwimCat(-1);
        cat.isRunCat(150);

        Dog drug = new Dog("собака", "Дружок");
        Dog barbos = new Dog("собака", "Барбос");
        System.out.println("Создано объектов собак: " + Dog.countObject);

        drug.isSwimDog(10);
        drug.isRunDog(5);
        barbos.isSwimDog(35);
        barbos.isRunDog(501);
    }

    public static void feedCats() throws task_1.WrongVolumeFoodException {
        Cat[] allCats = new Cat[4];
        System.out.println("\nСоздаем котов, которых будем кормить");
        allCats[0] = new Cat("кот", "Барсик", false, 5);
        allCats[1] = new Cat("кот", "Снежок", false, 10);
        allCats[2] = new Cat("кот", "Мурзик", false, 15);
        allCats[3] = new Cat("кот", "Черныш", false, 30);
        System.out.println("Текущее количество котов: " + Cat.countObject);
        int action;

        System.out.println("\nСоздайте миску и насыпьте в нее корма");
        int volume;
        int food;

        Bowl bowl;
        while (true) {
            System.out.println("Задайте объем миски:");
            volume = sc.nextInt();
            System.out.println("Задайте количество корма:");
            food = sc.nextInt();
            try {
                bowl = new Bowl(volume, food);
                break;
            } catch (task_1.WrongVolumeFoodException e) {
                System.out.println(e.getMessage());
            }
        }


        bowl.infoBowl();
        for (Cat allCat : allCats) {
            if (!allCat.satiety && allCat.portion < bowl.food) {
                allCat.eat(bowl);
                allCat.satiety = true;
                System.out.println("Котик " + allCat.name + " покушал!");
            } else {
                System.out.println("Котик " + allCat.name + " не поел!");
            }
        }
        bowl.infoBowl();
        System.out.println("Сколько грамм вкусного корма добавить в миску?");
        action = sc.nextInt();
        bowl.increaseFood(action);
        bowl.infoBowl();
    }

    public static void task2() {
        Circle circle = new Circle(5);
        circle.isPerimeter();
        circle.isArea();
        circle.setFillColor(" red");
        circle.setBorderColor(" black");
        circle.printAll();

        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.isPerimeter();
        rectangle.isArea();
        rectangle.setFillColor(" yellow");
        rectangle.setBorderColor("green");
        rectangle.printAll();

        Triangles triangles = new Triangles(2.2, 2, 5, 7);
        triangles.isPerimeter();
        triangles.isArea();
        triangles.setFillColor("white");
        triangles.setBorderColor(" brown");
        triangles.printAll();
    }

}