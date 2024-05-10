package src.task_2;

public class Rectangle implements Share, Fillable, Borderable {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override

    public double isPerimeter() {
        return 2 * (width + height);
    }

    @Override

    public double isArea() {
        return width * height;
    }

    @Override

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printAll() {
        System.out.println("Прямоугольник: " + " периметр = " + isPerimeter() + "\n" +
                "площадь = " + isArea() + "\n" +
                "заливка: " + fillColor + " \n" + "контур: " + borderColor);
    }
}
