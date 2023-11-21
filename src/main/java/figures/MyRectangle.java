package figures;

public class MyRectangle extends Rectangle {
    private final String color;

    public MyRectangle(String color, String name, double length, double width) {
        super(name, length, width);
        this.color = color;
    }

    public String getDescription() {
        return (String.format("My %s figures.%s has %.2f and %.2f", color, getName(), calculatePerimeter(), calculateArea()));


    }
}