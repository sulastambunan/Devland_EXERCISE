public class LogisSwitch {

    public static void main(String[] args) throws Exception{
       // Integer number = 5;
      // Integer status = 1; !!!!!!!!!!!!!! KENAPA STATUS DISINI GK BISA DIPANGGI PADA LINE 12
        //System.out.println(isFizzBuzzSwitch(3));
        System.out.println(isFizzBuzzSwitch(3));


    }
    private static String isFizzBuzzSwitch (int status) {
       // boolean isFizz = number % 3 == 0;
       //Integer status = 1; => !!!!!KENAPA DIA BISA KETIKA HARUS DISINI
       //Integer status = 1; 
       switch(status) {
            case 1: 
            return "Fizz";
            case 2:
            return "buzz";
            case 3:
            return "FizzBuzz";
        }
        return "buzziest";

    }
    
}
