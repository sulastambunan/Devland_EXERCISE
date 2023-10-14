import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class LogicForLoop {
    public static void main (String[] args) throws Exception {
        //------------For---------------
        //Manual for Loop
        //  Mulai dari angka 0 -> Range berapa kali kita ingin meloop -> ex: Kita ingin run sebanyak 5 kali, artinya setelah kita run, maka dia nambahin index = sampai ngecek batasan index <=6
        String name = "Sulas";
        //String[] nameInArrayLength = name.split(""); !!!!!!!!! ini kenapa penulisannya seperti ini?
        //index++ = index + 1
        //index+2 = index + 2
        String[] nameInArrayLength = name.split("");
        // for(int index = 0; index < nameInArrayLength.length; index++) {
        //     System.out.println(nameInArrayLength[index]);
            //System.out.print(nameInArrayLength[index]); !!!!!! Apa beda println dengan print



            //------------For Menggunakan key value---------------
             // Map<Integer, String> mapString = new HashMap<>(); -> !!!!!! Ini Initiate yg gimana maksudnya
            // Map<Integer, String> mapString = new HashMap<>();
            // mapString.put(1, nameInArrayLength[0]);
            // mapString.put(2, nameInArrayLength[1]);
            // mapString.put(3, nameInArrayLength[2]);
            // for (int index = 0; index < mapString.entrySet().size(); index++) { -> !!!!!! Ini Initiate yg gimana maksudnya
            //     System.out.println(nameInArrayLength[index]);
            // }
            //------------For Menggunakan list---------------
            List<String> list = Arrays.asList(nameInArrayLength);
            for (String string : list) {
                System.out.println(string);
            }
            //------------For Each---------------
            //For Each
            //Paramaeternya hanya 2 -> Kiri :  Kanan =>   Setiap isi dari Array nya : Array
            //FOREACH -> (satuan : array/list/colection), colection-> list, Arraylist, LinkedList
            // for (Entry<Integer, String> string : mapString.entrySet()) {
            //     System.out.println(string.getValue(0));
                
            // }

            //------------NOTES---------------
            //FOREACH -> Lebih enak digunakan ketitka, nge loop over an object. ex: map, list
            

            //------------For Each untuk Array 2Dimesion---------------
            
            int[][] Number2 = {{1,2,3,4}, {5,6,7,8}};
            for (int[] firstDimmension : Number2) {
                System.out.println(firstDimmension); //!!!!!! Ini kenapa outputnya memori
            }

            //!!!!!! kenapa harus dibuat seperti ini?? for dalam for untuk sout
            // for (int[] firstDimmension : Number2) {
            //     for (int number : firstDimmension) {
            //         System.out.println(number); 
            //     }
            // }
         
        
    }
    
}
