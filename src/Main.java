package src;

public class Main {
    public static void main(String[] args) {
        AcceptStringArray stringArray = new AcceptStringArray();
        int summa;
        String[][] array = stringArray.addArray();
        try {
            summa = stringArray.workArray(array);
        } catch (MyArraySizeException e) {
            System.out.printf("Нарушена размерность массива! %s", e.getMessage());
            return;
        } catch (MyArrayDataException exc) {
            System.out.printf("Ошибка: %s%n", exc.getMessage());
            return;
        }
        System.out.println("Сумма элементов массива = " + summa);
    }
}
