public class Recursive {
    public static void main (String[] args) throws Exception {
            //------------Buat function Recursive(Method yang manggil method itu sendiri)---------------
            //case: 
            int number = 5;
            int result = factorial(number); 
            System.out.println(result);
    }

    private static int factorial (int number){
        if(number == 0) {
            return 1;
        }
        return number * factorial(number-1);
    // Rekursi adalah teknik dalam pemrograman di mana suatu fungsi memanggil dirinya sendiri dengan argumen yang berbeda hingga mencapai kondisi dasar (base case) di mana fungsi berhenti memanggil dirinya sendiri dan mulai mengembalikan nilai.
    //Fungsi factorial(0) memeriksa bahwa number adalah 0 (base case), dan mengembalikan 1.
    //Nilai-nilai ini kemudian terkembalikan kembali melalui semua pemanggilan fungsi rekursif, menghasilkan hasil akhir 120.
    }
    
}
