package Array;

import java.util.Scanner;

public class ArrayByInput {
    public static void main(String [] arg) {

        int [][] array=new int[3][4];
        for(int i=0;i< array.length;i++){
            System.out.println("Enter value of elements of Array:-");
            for (int j=0; j<array[i].length;j++){
                Scanner scanner=new Scanner(System.in);

                final int i1 = scanner.nextInt();
                array[i][j]=i1;
            }
        }

        for (int a[]: array
             ) {
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }

    }
}
