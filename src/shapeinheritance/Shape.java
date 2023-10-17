package shapeinheritance;

public abstract class Shape {
    //bisa punya atirbut
    //bisa punya abstract method
    //bisa punya concrete method

    String color;

    public Shape (String color) {
        this.color = color;
    }

    //Abstract Method
    public abstract double area();

    //Concrete Method -> Yang dimana sebuah method mempunyai implementasinya
    public String getColor () {
        return this.color;
    }

    
}
