import java.lang.reflect.Array;
import java.util.*;

public class One {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//        for (String s: map.values()) {
//            System.out.println(s);
//        }
//        //forEach
//        map.forEach((integer, s) -> {
//            System.out.println(s);
//        });
//        System.out.println("+++++++++++++++++++++++++++");
//        List<Integer> list=new ArrayList<>();
//        list.add(11);
//        list.add(3);
//        list.add(8);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println(list);
//        System.out.println("___________________");
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(map);
//        linkedHashMap.forEach((integer, s) -> {
//            System.out.println(s);
//        });
//        for (String s:linkedHashMap.values()
//             ) {
//            System.out.println(s);
//        }

//        String str1="Sidhi";
//        String str="NIDHI";
//        System.out.println(str);
//        boolean b = str.equalsIgnoreCase(str1);
//        System.out.println(b);
//        int i1 = str.indexOf(4);
//        System.out.println(i1);
//        System.out.println("------compare--------");
//        int i2 = str.compareTo(str1);
//        System.out.println(i2);
//        System.out.println("---------replace----------");
//        String replace = str.replace('D', 'A');
//        System.out.println(replace);
//        System.out.println("------concat-------------");
//        String hello = str.concat("Hello");
//        System.out.println(hello);
//        System.out.println("-----------trim------");
//        String trim = str.trim();
//        System.out.println(trim);
//        System.out.println("++++++++++++++++++");
//        String[] is = str.split("I", 4);
//        for (int i=0;i< is.length;i++)
//        System.out.println(is[i]);
        int [] Age={12,10,23,20};
        for (Integer i:Age
        ) {
            System.out.println(i);
        }
       //sorting of Array:-
        Arrays.sort(Age);
        for (int j=0;j< Age.length;j++){
            System.out.println(Age[j]);
        }
        System.out.println("-------------------");
        for (Integer k:Age) {System.out.println(k);}
        System.out.println("-------------------");
        Integer [] Marks={100,97,56,123,99,73};
        Arrays.sort(Marks,Collections.reverseOrder());
        for (Integer l:Marks
             ) {
            System.out.println(l);
        }
        System.out.println("++++++++++++++++++++");
        Integer [] arr={19,25,12,90,6};
        for(int i =0 ;i< arr.length ; i++){
            for (int j =i+1; j<arr.length ; j++){
               int temp=0;
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);

        }
        System.out.println("===============Method Overloading=========");
        System.out.println( add1(2,3));
        System.out.println(add1(1,9.5,8.2));
        One o=new One();
        double v = o.add1(1, 2, 7);
        System.out.println(v);
        System.out.println("------------Abstract class and method+++++++++++++++");
        //Animal animal=new Animal(); We can initiate Abstract class

    }
    public static int add1(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static double add1(double a,double b,double c){
        double sum=(a+b+c);
        return sum;
    }
    public double add1(int a,int b,int c){
        double sum=(a+b+c);
        return sum;

    }

}

abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzzzz");
    }

}