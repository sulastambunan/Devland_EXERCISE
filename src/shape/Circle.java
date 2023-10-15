package shape;

public class Circle extends Shape {
    private double radius;
        //Jika Extends dari Shape, tolong implementasikan, method dari Shapenya
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }
    
    
}
