package src.task_2;

public class Circle implements Share, Fillable, Borderable {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double isPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override

    public double isArea() {
        return Math.PI * radius * radius;
    }

    @Override

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printAll() {
        System.out.println("Круг: " + " периметр = " + isPerimeter() + "\n" +
                "площадь = " + isArea() + "\n" +
                "заливка: " + fillColor + " \n" + "контур: " + borderColor);
    }
}
