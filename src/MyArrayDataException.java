package src;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int line, int column) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", line, column));
    }
}
