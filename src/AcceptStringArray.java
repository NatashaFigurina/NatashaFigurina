import java.util.Arrays;
import java.util.Scanner;

public class AcceptStringArray {
    public String[][] addArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int line = sc.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int column = sc.nextInt();
        String[][] array = new String[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Введите элемент" + "[" + i + "]" + "[" + j + "]");
                array[i][j] = sc.next();
            }
        }
        sc.close();
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public int workArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int size = 4;
        if (array.length != size) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть %d*%d", size, size));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != size) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %d*%d", size, size));
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}

