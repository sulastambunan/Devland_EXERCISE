public class TrianglePattern {
    public static void main(String[] args) throws Exception {
    int max_lines = 5;
    int angka = 1;
    // Part 1
       for (int i = 1; i<=max_lines; i++){
        for(int j = 1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println("");
       }
       for(int i = max_lines; i>0; i--){
        for(int j =1; j<=i-1; j++){
            System.out.print("* ");
        }
        System.out.println("");
       }

    // Part 2
    for (int i = 1; i <= max_lines; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(angka + " "); 
            angka++; 
        }
        System.out.println(); 
    }
}
}
