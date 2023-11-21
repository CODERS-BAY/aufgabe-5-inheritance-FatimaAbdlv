package figures;

public class Circle extends Figure {
    private final double radius;


    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}


