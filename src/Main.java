import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        boolean compareAmount = isComparisonOfAmount(7,5);
        identificationNumber (-40);
        boolean compare = isNegative(101);
        System.out.println(compare);
        printString(2,  "Неllo word");
        boolean answer =  leapYear(2024);
        int [] arr =  replacingElementValues();
        int [] array = arrayInitialization ();
        int [] array1 = multiplyingElementOfArray();
        int [][] array2 = diagonalInitialization();
        int[] array3 =  completionArray( 7,  1);
    }


    // Задача 1
    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};

        for (String word : words) System.out.println(word);
    }

    // Задача 2
    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задача 3
    public static void printColor() {
        int value = 5;
        String color;

        if (value <= 0){
            color = "Красный";
        }
        else if(value > 0 && value <= 100) {
            color = "Желтый";
        }
        else {
            color = "Зеленый";
        }

        System.out.println(color);
    }

    // Задача 4
    public static void compareNumbers() {
        int a = 100;
        int b = 5;

        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    // Задача 5
    public static boolean isComparisonOfAmount(int a, int b) {

        if (a + b >= 10 & a + b <= 20){
            System.out.println("Условие выполняется");
            return true;
        }
        else {
            System.out.println("Условие не выполняется");
            return false;
        }
    }


    // Задача 6
    public static void identificationNumber(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    // Задача 7
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // Задача 8
    public static void printString(int a, String srt){
        if (a >=0) {
            System.out.println (srt.repeat(a));
        }
    }

    // Задача 9
    public static boolean leapYear(int year) {
        boolean is_leap = (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
        if (is_leap) {
            System.out.println ("leap year");
        } else {
            System.out.println ("not a leap year");
        }
        return is_leap;
    }

    // Задача 10
    public static int [] replacingElementValues() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    // Задача 11
    public static int[] arrayInitialization(){
        int [] array = new int [100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.println (array[i]);
        }
        return array;
    }

    // Задача 12
    public static int[] multiplyingElementOfArray(){
        int [] array = {1, 5, 3, 2 ,11 ,4 ,5 ,2 ,4 ,8 ,9 ,1};
        System.out.println (Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 6){
                array [i] *= 2;
            }
        }
        System.out.println (Arrays.toString(array));
        return array;

    }

    // Задача 13
    public static int[][] diagonalInitialization() {
        int[][] array = new int[5][5];
        int num = 1;
        int i;
        System.out.println (Arrays.deepToString (array));
        for (i = 0; i < array.length; i++) {
            array[i][i] = num;
            array[i][array.length - 1- i ] = num;
        }
        System.out.println (Arrays.deepToString (array));
        return array;

    }

    // Задача 14
    public static int[] completionArray(int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array [i] = initialValue;
        }
        System.out.println (Arrays.toString(array));
        return array;

    }
}