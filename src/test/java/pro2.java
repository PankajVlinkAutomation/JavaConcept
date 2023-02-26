import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pro2 {
    public static void main(String[] args) {
        Integer [] array= {12,1,2,90,54,65};
        for (Integer i:array
             ) {
            System.out.println(i);
        }
        System.out.println("-----------------");
        for(int j=0;j< array.length;j++){
            System.out.println(array[j]);
        }
        System.out.println("--------Array in Reverse Order-----------");
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer a:array
             ) {
            System.out.println("Reverse order "+a);
        }
        System.out.println("---------Array in Ascending order------------");
        List<Integer> list = Arrays.stream(array).toList();
        
        for (Integer b:array
             ) {
            System.out.println("Ascending order "+b);
        }
        System.out.println("---------------------------------------------");
    }
}
