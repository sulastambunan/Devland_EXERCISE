package shapeinheritance;

public interface CalculateShapeInterface {
    //gk ada implementasinya
    //yang boleh hanya public, static, final
    //private double Name; -> tidak boleh
    public void calculate();
    public void shape();
    public static final String Name = "Name";
    //final -> artinya String Name tidak bisa diubah ubah lagi 


    //APA PERBEDAAN PENGGUNAAN ABTRACT CLASS & INTERFACE CLASS
    //Jika ingin menggunakan atribut dari class abstract, dan methodnya -> maka gunakan abstract class
    //jika ingin hanya define method aja, maka gunakan interface

    // interface Animal {
    //     void makeSound();
    // }
    
    // class Dog implements Animal {
    //     @Override
    //     public void makeSound() {
    //         System.out.println("Dog barks!");
    //     }
    // }


//Abstract Class:

// Dapat memiliki metode konkret bersama dengan metode abstrak.
// Dapat memiliki variabel instance (non-final dan final).
// Mendukung konsep pewarisan (inheritance).
// Interface:

//Interface Class:
// Hanya dapat memiliki metode abstrak (tanpa implementasi) dan variabel konstan (final).
// Mendukung multiple inheritance (satu kelas dapat mengimplementasikan banyak interface).
// Digunakan untuk mendefinisikan kontrak yang harus diikuti oleh kelas-kelas yang mengimplementasikannya.

//abstract -> blm diimplementasi
//konkret -> sudah diimplementasi

// abstract class Shape {
//     // Metode abstrak tanpa implementasi
//     abstract double calculateArea();

//     // Metode konkret dengan implementasi
//     void display() {
//         System.out.println("This is a shape.");
//     }
// }



// interface Drawable {
//     void draw();
// }

// interface Resizable {
//     void resize();
// }

// class Shape implements Drawable, Resizable {
//     @Override
//     public void draw() {
//         System.out.println("Drawing the shape");
//     }

//     @Override
//     public void resize() {
//         System.out.println("Resizing the shape");
//     }
// }



    

    
    
}
