import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import shapeinheritance.Circle;
import shapeinheritance.Rectangle;
import shapeinheritance.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circle circle = new Circle("Red", 5);
        System.out.println("Color Circle " + circle.getColor());
        System.out.println("Area Circle " + circle.area());
        //untuk Rectangle
        Rectangle rectangle = new Rectangle("GREEN", 20, 6);
        System.out.println("Color Rectangle " + rectangle.getColor());
        System.out.println("Area Rectangle " + rectangle.area());


        //BISA JUGA INSTINTIATE nya menggunakan shape
        Shape rectangle2 = new Rectangle("red", 10, 10);
        System.out.println(rectangle2.area());

        //jika menggunakan List
        //!!!!!!! biasanya kan isinya List<String> -> variabel yang akan menyimpan objek bertipe String
        //jawaban diatas, karna Shape adalah generic type parameter
        List<Shape> listOfShapes = Arrays.asList(circle, rectangle, rectangle2);
        //Arrays.asList -> bisa juga menggunakan ArrayList
        for (Shape shape : listOfShapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("Color " + shape.getColor());
            System.out.println("Area: " + shape.area());
            
        }
    }
}
