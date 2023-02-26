package W3PracticeQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class ListSet {
    public static void main(String[] args) {
        //Set:-
        Set<Integer> set=new HashSet<>(Set.of(2,5,3,9,0));
        set.add(6);
        set.add(96);
        set.add(90);
        set.add(1);
        set.remove(96);
        set.add(2);//Set does not allow duplicate.
        System.out.println("Size of Set ="+set.size());
        //We can not get element individually like in List.
        System.out.println("Set "+set);
        System.out.println("Set to Array-"+Arrays.toString(set.toArray()));
        //sorting of Set By collections:-
        set.stream().sorted().forEach(p-> System.out.println(set));
        System.out.println("==========");

        //List:-
        List<Integer> list=new ArrayList<>(List.of(2,5,3,9,0));
        list.add(6);
        list.add(96);
        list.add(90);
        list.add(1);
        list.remove(6);
        list.add(2);//List allows duplicate.
        System.out.println("Size of List ="+list.size());
        for (Integer integer : list.stream().sorted().toList()) {
            System.out.print("|"+integer);
        }
        //We can get individual element in List.
        System.out.println("Get Element of List ="+list.get(1));
        System.out.println("List "+list);
        System.out.println("List to Array-"+Arrays.toString(list.toArray()));
        list.stream().sorted().forEach(p-> System.out.println(list));


    }
}
