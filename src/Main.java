public class Main {

    public static void main(String[] args) {
        printThreeWords();
        printThreeWords2();
        checkSumSign();
        printColor();
        compareNumbers();
        boolean compareAmount = isComparisonOfAmount(1,5);
        identificationNumber (-40);
        boolean compare = isNegative(101);
        System.out.println(compare);
        printString(-4,  "Неllo word");
        printString2(-4,  "Неllo word");
        boolean answer =  leapYear(2015);
        int [] arr =  replacingElementValues();
        int [] arr1 =  replacingElementValues2();
        int [] array = arrayInitialization ();
        int [] array1 = multiplyingElementOfArray();
        int [][] array2 = diagonalInitialization();
        int[] array3 =  completionArray( 7,  1);

    }

    // Задача 1
    public static void printThreeWords() {
        String word1 = "Orange";
        String word2 = "Banana";
        String word3 = "Apple";

        System.out.println(word1 + "\n" + word2 + "\n" + word3);
    }

    // Задача 1
    public static void printThreeWords2() {
        String[] words = {"Orange", "Banana", "Apple"};

        for (String word : words) System.out.println(word);
    }

    // Задача 2
    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    // Задача 3
    public static void printColor() {
        int value = 0;
        String color;

        if (value <= 0) color = "Красный";
        else if (value > 0 && value <= 100) color = "Желтый";
        else color = "Зеленый";

        System.out.println(color);
    }

    // Задача 4
    public static void compareNumbers() {
        int a = 100;
        int b = 5;

        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    // Задача 5
    public static boolean isComparisonOfAmount(int a, int b) {
        return a + b <= 10 && a + b >= 20;
    }

    // Задача 6
    public static void identificationNumber(int a) {

        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    // Задача 7
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // Задача 8
    public static void printString(int a, String srt){
        if (a >=0) System.out.println (srt.repeat(a));

    }

    // Задача 8
    public static void printString2(int a, String srt){
        for (int i = 0; i < a; i++) System.out.print(srt);
    }

    // Задача 9
    public static boolean leapYear(int year) {
        if (year % 400 == 0 ) {
            return true;
        }
        if ( year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    // Задача 10
    public static int [] replacingElementValues() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else if (arr[i] == 0) arr[i] = 1;
        }
        return arr;
    }

    // Задача 10
    public static int [] replacingElementValues2(){
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            switch (arr [i]) {
                case 0: arr [i] = 1; break;
                case 1: arr [i] = 0;
            }
        }
        return arr;
    }

    // Задача 11
    public static int[] arrayInitialization(){
        int [] array = new int [100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Задача 12
    public static int[] multiplyingElementOfArray(){
        int [] array = {1, 5, 3, 2 ,11 ,4 ,5 ,2 ,4 ,8 ,9 ,1};
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 6) array [i] *= 2;
        }
        return array;
    }

    // Задача 13
    public static int[][] diagonalInitialization() {
        int[][] array = new int[5][5];
        int num = 1;
        int i;

        for (i = 0; i < array.length; i++) {
            array[i][i] = num;
            array[i][array.length - 1- i ] = num;
        }
        return array;
    }

    // Задача 14
    public static int[] completionArray(int len, int initialValue){
        int [] array = new int[len];
        for (int i = 0; i < len; i++)   array [i] = initialValue;
        return array;

    }
}
