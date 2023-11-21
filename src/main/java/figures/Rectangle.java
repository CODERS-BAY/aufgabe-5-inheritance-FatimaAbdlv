package figures;

public class Rectangle extends Figure {
    private final double length;
    private final double width;


    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }


}
