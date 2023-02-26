import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview {

    //Convert Array to String:-
    public static void main(String[] args) {

        int [] arr1=new int[]{12,2,34,21,56,35};
        System.out.println(Arrays.toString(arr1));

        boolean [] arr2=new boolean[]{true,false,true};
        System.out.println(Arrays.toString(arr2));

        String [] arr3=new String[]{"Ram","Radha","Sita"};
        System.out.println(Arrays.toString(arr3));

        double[] arr4=new double[]{1.2,32.5,5.2};
        System.out.println(Arrays.toString(arr4));

        //String Builder:-
        StringBuilder sb=new StringBuilder("Hello World");
        System.out.println(sb);
        System.out.println("=======================");

        char[] chars=new char[]{'a','b','c'};
        sb.append(chars);
        System.out.println(sb);
        System.out.println("===========================");

        StringBuilder sb1 = new StringBuilder("My Name is - ");
        char[] chars1=new char[]{'d','u','r','g','e','s','h'};
        sb1.append(chars1);
        System.out.println(sb1);
        System.out.println("=================================");

        String students="hello,world,welcome";
        System.out.println(students.toString());
        String concatString = students.concat(",Earth");
        System.out.print(concatString);
        System.out.println();
        System.out.println("========================");
        List<String> stringList=new ArrayList<>();
        stringList.add("100");
        stringList.add("99");
        stringList.add("102");
        stringList.add("85");
        stringList.add("78");
        stringList.add("53");
        System.out.println(stringList);
       // List<String> sortedList = stringList.stream().map(a->a)
        //System.out.println(sortedList);

    }

}
