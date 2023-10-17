package measurementEncapsulation;

public class Measurement {
    private double value;
    //Karna kita udh punya tipe data Unit yg isinya KM,HM, DLL maka disini kita manggil enum tersebut
    private Unit unit;

    public Measurement (double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public Unit getUnit () {
        return this.unit;
    }

    public double getValue() {
        return this.value;
    }
}


//codingan diatas namanya encapsulation
//mengumpulkan data, method dan semua behavior dlm 1 class
//line 17,13 (getValue, getUnit) merupakan getter, dari atribut private value dan unit
//harap diingat, untuk mengutamakan atribut menjadi private
//Encapsulation -> Punya getter Name & Setter Name

// public class Person () {
//     private String Name;

//     public Person (String Name) {
//         this.Name = Name;
//     } 

//     public getName(){
//         return this.Name;
//     }

//     public void setName(String newName){
//        this.Name = newName;
//     }
// }
