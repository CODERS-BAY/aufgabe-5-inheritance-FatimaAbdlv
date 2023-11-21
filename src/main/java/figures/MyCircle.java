package figures;

public class MyCircle extends Circle {
    private final String color;


    public MyCircle(String color, String name, double radius) {
        super(name, radius);
        this.color = color;
    }


    public String getDescription() {
        return (String.format("My %s figures.%s has %.2f and %.2f", color, getName(), calculatePerimeter(), calculateArea()));

    }

}


