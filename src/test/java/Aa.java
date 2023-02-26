
import java.util.*;

public class Aa {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(23);
        streamPro(arrayList);
        streamPro2(Arrays.asList(12,2,31,3));
        Set<Integer> set=new HashSet<>(arrayList);
        streamPro3(set);

    }
    public static void streamPro(ArrayList<Integer> arr){
        List<Integer> collect = arr.stream().sorted().toList();
        System.out.println(collect);
    }
    public static void streamPro2(List<Integer> list){
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println(list1);
    }
    public static void streamPro3(Set<Integer> set){
        List<Integer> set1 = set.stream().sorted().toList();
        System.out.println(set1);
    }

}




