public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //cara bikin method di java -> buat akses modifier - tipe data - nama methodnya
    public double area() {
        return this.width * this.length;
    }


    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    //create method untuk ngebalikin rectangle yang nerima 1 parameter side
    public static Rectangle createSquare (double side, double sisi){
        return new Rectangle(side, sisi);
    }

    
}
