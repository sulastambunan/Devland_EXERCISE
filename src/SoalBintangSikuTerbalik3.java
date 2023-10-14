public class SoalBintangSikuTerbalik3 {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi pola bintang

        for (int i = tinggi; i >= 1; i--) {
            // Loop untuk menambahkan spasi pada awal setiap baris
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            
            // Loop untuk menambahkan bintang pada setiap baris
            for (int k = 1; k <= tinggi - i + 1; k++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah setiap baris selesai dicetak
            System.out.println();
        }
    }
        
    
}
