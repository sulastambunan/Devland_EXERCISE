package shape;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    public void haloColor() {
        System.out.println(super.color);
    }

    
    
}
