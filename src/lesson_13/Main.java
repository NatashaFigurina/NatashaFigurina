package lesson_13;

import lesson_13.task_1.Words;
import lesson_13.task_2.PhoneBook;
import lesson_13.task_2.PhoneExists;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        Words words = new Words();
        System.out.println("Введенные слова: " + words.wordsList);
        words.fildingSingularWord();
        words.isWordCount();
    }

    public static void task2() {
        PhoneBook book = new PhoneBook();
        try {
            book.add("8-029-855-90-34", "Иванов");
            book.add("8-029-855-90-35", "Исаков");
            book.add("8-029-855-90-36", "Исаков");
            book.add("8-029-855-90-37", "Петров");
            book.add("8-029-855-90-38", "Смирнов");
            book.add("8-029-855-90-39", "Смирнов");
            book.add("8-029-855-90-33", "Смирнов");
            book.add("8-029-855-90-33", "Кротов");
        } catch (PhoneExists e) {
            System.out.println(e.getMessage());
        }
        book.toPrint(book.book);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String desiredName = scanner.nextLine();

        book.toPrint(book.get(desiredName));
    }
}



