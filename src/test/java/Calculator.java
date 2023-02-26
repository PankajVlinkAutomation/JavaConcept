import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
       operationCal();
    }
    public static void operationCal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number :-" );
        int i = sc.nextInt();
        System.out.println("Enter Second Number :-" );
        int j = sc.nextInt();
        System.out.println("Select operations [Sum/Product/Substraction] ");
        String operation = sc.next();
        if(operation.equalsIgnoreCase("Sum"))
        {
            sum(i,j);
        }
        else if (operation.equalsIgnoreCase("Product"))
        {
            product(i,j);
        }else if(operation.equalsIgnoreCase("Substraction"))
        {
            substraction(i,j);
        }
        else{
            System.out.println("Please select valid operation!!!");
        }
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void product(int a , int b){
        System.out.println(a*b);
    }
    public static void substraction(int a, int b){
        System.out.println(a-b);
    }

}
