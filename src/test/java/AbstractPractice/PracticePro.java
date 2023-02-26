package AbstractPractice;

import java.util.*;
public class PracticePro {
    public static Integer [] array={12,2,34,67,8,0};

    public static void main(String[] args) {
        for (int i : array) {
            System.out.println("Original array = "+i);
        }

        Arrays.sort(array);
        for (Integer i:array
             ) {
            System.out.println("Array in ascending order = "+i);
        }
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer i:array
             ) {
            System.out.println("Array in descending order = "+i);
        }
        List<String> name=new ArrayList<>();
        name.add("aa");name.add("bb");name.add("ff");name.add("ee");
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

        //sorting of String:-
        String str="HelloWorld";
        char[] chars= str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        for (char i:chars
             ) {
            System.out.print(i);
        }
        System.out.println("----------");
        String s = Arrays.toString(chars);
        System.out.println(s);
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(array));
        linkedList.forEach((i)->{
            System.out.println(i);
        });
        linkedList.forEach(System.out::println);

        for (Integer i:linkedList
             ) {
            System.out.println(i);
        }
        System.out.println("----HASHMAP----");
        HashMap<String ,Integer> hashMap=new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("d",4);
        hashMap.put("b",2);
        hashMap.put("c",3);
        //sorting of hashmap key:-
        hashMap.forEach((p,q)->{
            System.out.println(p);
        });
        //sorting of Hashmap Value:-
        hashMap.forEach((p,q)-> System.out.println(q));
        //sorting of Hashmap Value:(By ForEach loop)-
        for (Integer s1: hashMap.values()
             ) {
            System.out.println(s1);
        }
        //sorting of Hashmap Value:(By ForEach loop)-
        for (String s2: hashMap.keySet()
        ) {
            System.out.println(s2);
        }
        //sorting of array by using loop:-
        int [] arr={12,2,34,5,9};
        for (int i=1;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                int temp=0;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
