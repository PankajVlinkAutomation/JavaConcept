package W3PracticeQuestion;

import java.util.*;

public class SundayPractice {

    public static void main(String [] arg){
        System.out.println("Difference between List and Set:-");
        //In collections, we have to pass only boxed type data type[Integer,Character] not primitive type data like int ,char.
        //Under List Interface we can pass "duplicate element" in collection and random access of element value & modify elements.
        //ArrayList and LinkedList Under LIST-Interface:-[ordered family/allow duplicates//random access of element//]
        List<Integer> arrayList=new ArrayList<>(List.of(12, 2, 34, 22, 56, 12));//not Thread safe
        List<Integer> linkedList=new LinkedList<>(List.of(12, 2, 34, 22, 56, 12));//Thread Safe
        System.out.println("ArrayList:- "+arrayList);
        System.out.println("LinkedList:- "+linkedList);

        //HashSet and TreeSet Under SET-Interface;-[not allow duplicate//can't get desired element]
        //Under Set Interface we can not pass duplicate element in collection & random access of element value.
        Set<Integer> hashSet=new HashSet<>(Set.of(12, 2, 34, 22, 56));//having no sorting
        Set<Integer> treeSet=new TreeSet<>(Set.of(12, 2, 34, 22, 56));//Having sorted elements,ordered
        System.out.println("HashSet:- "+hashSet);
        System.out.println("TreeSet:- "+treeSet);

        //Vector:-[]
        final Vector<Integer> integers = new Vector<>(List.of(12, 11, 13, 17, 5,5));//same as ArrayList and it is synchronized.
        System.out.println(integers);



    }
}
