package lesson_7.task_2;

public class Triangles implements Share, Fillable, Borderable {
    private double s1;
    private double s2;
    private double s3;
    private double height;
    private String fillColor;
    private String borderColor;

    public Triangles(double s1, double s2, double s3, double height) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.height = height;
    }

    @Override

    public double isPerimeter() {
        return s1 + s2 + s3;
    }

    @Override

    public double isArea() {
        return 0.5 * height * s1;
    }

    @Override

    public void setFillColor(String color) {
        this.fillColor = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printAll() {
        System.out.println("Tреугольник: " + " периметр = " + isPerimeter() + "\n" +
                "площадь = " + isArea() + "\n" +
                "заливка: " + fillColor + " \n" + "контур: " + borderColor);
    }
}
