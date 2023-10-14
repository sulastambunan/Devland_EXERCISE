public class SoalBintangSikuTerbalik2 {

        public static void main(String[] args) throws Exception {
        int number = 5;
        for(int i = number; i>0; i--){
            for(int j = 1; j<=number-1; j++){
                System.out.print("!");
                for(int k = 1; k<=i; k++){
                    System.out.print("*");
                }
            }

            System.out.println("");
            
            }
            
        }
        
}
