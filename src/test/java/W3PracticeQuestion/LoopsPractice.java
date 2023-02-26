package W3PracticeQuestion;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

interface III{
    void display();
    void action();
}

public class LoopsPractice {

    public static void main(String[] a) {
        for (int i = 1; i <= 5; i++)//for loop
            System.out.println("Hello");
        Scanner sc=new Scanner(System.in);//Input By User
        System.out.println("Enter number- ");
        int n=sc.nextInt();
        //Switch loop:-
        switch(n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thruesday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter invalid number");
        }
        //Interface methods calling(We cant make obj of interface:-
        III obj=new III(){
            //Anonymous class/Inner class
          public void display(){
              System.out.println("Interface methods -display ");
          }
          public void action(){
              System.out.println("Interface methods -Actions");
          }
        };
        obj.action();//call methods by object:-
        obj.display();

        //List of character Type
        List<Character> characterList=new ArrayList<>(List.of('e','i','a','u','o'));
        characterList.add('L');
       // Collections.sort(characterList);//Sorting by Collections:-
        System.out.println(characterList);
        //WE can sort ArrayList/List by Collection And Java Stream:-
        //Sorting by Java Stream:-
         List<Character> collect = characterList.stream().sorted().collect(Collectors.toList());
        System.out.println("List "+collect);

        //Set:-
        Set<Character> characterSet=new HashSet<>(Set.of('e','i','a','u','o'));
        System.out.println("Set "+characterSet);
        characterSet.add('P');
        System.out.println(characterSet);

    }
}
