package W3PracticeQuestion;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    static List<String> listOperations;
    static Scanner scanner=new Scanner(System.in);

    public long add(long a,long b){

        return a+b;
    }

    public long product(long a,long b){
        return a*b;
    }

    public long divide(long a,long b){
        if(a>=b) {
            return a / b;
        }
        return 0;
    }

    public long minus(long a, long b){
        if(a>=b) {
            return a - b;
        }
        return 0;
    }
    public double trignoFunction(double a){
       return Math.sin(a);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println("Enter Ist Number = ");
        long a = scanner.nextLong();
        System.out.println("Enter 2nd Number = ");
        long b = scanner.nextLong();
        System.out.println("Select operation from following options:-");
        new LinkedList<>(List.of("sum","product","divide","minus","Sin"));
        System.out.println(listOperations);
        final int i = scanner.nextInt();
        switch (listOperations.get(i).toLowerCase()) {
            case "sum" -> System.out.println(calc.add(a, b));
            case "product" -> System.out.println("Pro is => " + calc.product(a, b));
            case "divide" -> System.out.println("Div is => " + calc.divide(a, b));
            case "minus" -> System.out.println("Min is => " + calc.minus(a, b));
            case "sin"-> System.out.println(calc.trignoFunction(30));
            default -> System.out.println("Invalid input");
        }
    }
}
