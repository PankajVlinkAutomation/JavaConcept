import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first entry of side");
        int i = sc.nextInt();
        System.out.println("Enter Second entry of side");
        int i1 = sc.nextInt();
        RectangleTriangle(i,i1);
        Rectangle(i,i1);
        Square(i);
    }
    public static void RectangleTriangle(int perpendicular,int base){
        System.out.println("Area of Triangle is => "+(.5*perpendicular*base));
        System.out.println("Perimeter of Triangle is => "+(3*base));
    }
    public static void Rectangle(int length,int width){
        System.out.println("Area of rectangle is => "+(length*width));
        int i = length + width;
        System.out.println("Perimeter of Rectangle is => " +(2*i));
    }
    public static void Square(int side){
        System.out.println("Area of square is => "+(Math.sqrt(side)));
        double sqrt = Math.sqrt(side);
        System.out.println("Perimeter of Triangle is => "+(2*sqrt));
    }
}
