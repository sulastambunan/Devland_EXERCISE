public class App {
    public static void main(String[] args) throws Exception {
             //Cara untuk membuat sebuah variable
         //data type
            //primitif
            //int, double, char, float
            //Non-Primitif (udh di provide sama java by default) => punya behaviour
            //integer, Double, String, Float
         //nama variable
         String name = "sulas";
         System.out.println(name);
         Product product = new Product();
         Product Product2 = new Product("");
         Person person = new Person();
         Person namePerson = new Person("Andi");
         Person nameAgePerson = new Person("Erin", 12);

         //manggil 
         namePerson.read();
         namePerson.study();
         //cara manggil 
         //langsung akses class person
         Person.study();
         
    }


}
