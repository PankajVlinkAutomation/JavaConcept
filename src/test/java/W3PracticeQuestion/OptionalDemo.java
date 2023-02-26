package W3PracticeQuestion;

import java.util.*;
public class OptionalDemo {

    public static void main(String[] args) {
        String str=null;
        String hello = Optional.ofNullable(str).orElse("hello");
        System.out.println();
        System.out.println(hello);

        Integer [] marks={8,2,4,1};
        List<Integer> list = Arrays.asList(marks);
        for (Integer integer : list.stream().map(p -> p * 2).toList()) {
            System.out.print(integer+"|");
        }

        List<Integer> list1 = List.of(12, 2, 1, 67, 23);
        for (Integer i : list1.stream().filter(a -> a % 2 == 1).sorted().map(a -> a * 2).toList()) {
            System.out.print(i+"||");
            System.out.println();
        }
        List<Integer> list2 = new ArrayList<>(List.of(12, 11, 13, 14));
       list2.stream().sorted().map(a->a-2).toList().forEach(p-> System.out.print(p+"||"));

        System.out.println("-------------");

        List<Integer> arrayList = new ArrayList<>(List.of(2, 1, 3, 7, 5, 4));
        arrayList.stream().map(a->a*2).sorted().toList().forEach(p-> System.out.print(p+" | "));
        System.out.println("----------------");

        Set<Integer> set = Set.of(12, 1, 3, 9, 4);
        //Set is immutable so we can't perform operation like add, remove and create...
        System.out.println("Set ->"+set);

       // set.add(33);[unsupportedOperationException]
        System.out.println(set);

        List<Integer> list3 = new ArrayList<>(List.of(12, 1, 3, 9, 9, 4));
        //Basically List is interface, and it is mutable because you perform operation like add,remove and create..
        //To become List Interface immutable , we use Collections.unmodifiableList() methods:-
//        List<Integer> list4 = Collections.unmodifiableList(list3);
//        list4.add(23);
//        System.out.println(list4);
        System.out.println("List->"+list3);
        list3.add(44);
        System.out.println(list3);

        System.out.println("--------------------");
        Set<Integer> setTree = new TreeSet<>(Set.of(2, 1, 3, 9, 6));
        System.out.println(setTree);
        setTree.add(22);
        System.out.println("TreeSet ->"+setTree);
        System.out.println("---------------------");


    }
}
