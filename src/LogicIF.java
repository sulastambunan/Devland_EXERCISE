public class LogicIF {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    //---------------1-----------------
        //Cara untuk membuat sebuah variable -> data type && Nama Variable
    //data type
       //primitif
       //int, double, char, float, boolean
       //Non-Primitif (udh di provide sama java by default) => punya behaviour
       //integer, Double, String, Float, Boolean
    //nama variable
    
     Integer number = 17;
     //String resuString = isFizzBuzz(number);
     //System.out.println(resuString);
     fizzBuzz(number);
    //---------------2-----------------
     //IF Menerima tipe data true/false boolean
     //---------------contoh1-----------------
        // if (number > 10) {
        //     System.out.println("Number is bigger than 10");
        // }
        // System.out.println(number + " = " + "is smaller than 10");
   

    //-------------3-------------------
        //IF DIATAS BISA DI EKSTRAK berbentuk variable
    //DIBUAT SECARA MANUAL
    //boolean isNumberBiggerThan10 = number >= 10;
    //OTOMATIS dilakukan dari viscod, "number > 10" diblok -> klik kanan - Refactor - ecxtract to local variables
    //---------------4-----------------
   // boolean isNumberBiggerThan10 = number < 15;
   //---------------5-----------------
    //OPERATOR tambahan OR || AND &&
    //boolean isNumberSmallerThan15 = number < 8
    // boolean isEvenNumber = number % 2 == 0;
    //     if ((isNumberBiggerThan10 || isNumberSmallerThan15) && isEvenNumber) {
    //         System.out.println("Number is bigger than 10 or is smaller than 15 or it's genap");
    //     }
    //     System.out.println("it's number");


    //---------------6-----------------
    //Terniany Operator
    boolean isnumberInteger =  number instanceof Integer ? true : false; 
    System.out.println(isnumberInteger);
    }


    //HINDARI PENGGUNAAN ELSE, KARNA SULIT DIBACA JIKA KEBANYAKAN. Maka gunakan "Guard Clause"
    // public static String isEvenNumber2(int number) {
    //     boolean isEvenNumber2 = number % 2 == 0;
    //         if(isEvenNumber2) {
    //             return "The number is Even";
    //         }
    //         return "The number is not";
    // }



    //FIZZ BUZZ
    //Jika angka habis dibagi 3  -> Fizz
    //Jika angka habis dibagi 5 -> Buzz
    //Jika angka habis dibagi 15 -> FizzBuzz
    public static String isFizzBuzz(int number){
        // boolean isFizz = number % 3 == 0;
        // boolean isBuzz = number % 5 == 0;
        // boolean isFizzBuzz = number % 15 == 0;
        // if(isFizz){
        //     return "itu adalah Fizz";
        // }
        // if(isBuzz){
        //     return "itu adalah Buzz";
        // }
        // if(isFizzBuzz){
        //     return "itu adalah FizzBuzz";
        // }
        return String.valueOf(number); 
        
        //return String.valueOf(number); => !!!!!!!!!!!!!!!!!!!!!! Ketika menggunakan if, kenapa selalu ada return di luar if??
    }
    
    public static void fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = number % 15 == 0;
        if(isFizz){
            System.out.println("itu adalah Fizz");
        }
        if(isBuzz){
            System.out.println("itu adalah Buzz");
        }
        if(isFizzBuzz){
            System.out.println("itu adalah FizzBuzz");
        }
        System.out.println(String.valueOf(number));
        //return String.valueOf(number); 
        
        //return String.valueOf(number); => !!!!!!!!!!!!!!!!!!!!!! Ketika menggunakan if, kenapa selalu ada return di luar if??
    }
}
