public class App {
    public static void main(String[] args) throws Exception {
        //Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(20, 10);
        Rectangle thirdRectangle = new Rectangle(9, 10);
        Rectangle fourRectangle = Rectangle.createSquare(7, 80);
        System.out.println(thirdRectangle.area());
        System.out.println("Rectangle Width = " + fourRectangle.getWidth() + " Length = " + fourRectangle.getLength() );
        

        //UNTUK Circle
        Circle circleArea = new Circle(2);
        System.out.println("Luas lingkaran = " + circleArea.areaCircle());
    }
}

        // Rectangle square = Rectangle.createSquare(0);        
        // Rectangle secondRectangle = new Rectangle(0, 0);
        // Rectangle thirdRectangle = new Rectangle(0, 0);
        // double area = thirdRectangle.area();
        // thirdRectangle.createSquare(area);

        
        // System.out.println(area);
        // System.out.println(square);
        // System.out.println(secondRectangle);
        // System.out.println(thirdRectangle);
        //KONSTRUKTOR -> Harus menggunakan new
        //kalo method -> gk menggunakan new
