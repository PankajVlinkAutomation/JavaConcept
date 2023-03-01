package Array;

public class JaggedArray {
    public static void main(String[] args) {
        JaggedArray obj = new JaggedArray();
        obj.printRandomJaggedArray();
        System.out.println("-------------------");
        obj.printJaggedArrayWithGivenArray();
        System.out.println("---------------------");
        obj.twoDimensionalArray();
        System.out.println("----------------");
        obj.oneDimensionalArray();
        //System.out.println();
        System.out.println("------------");

    }

    public void printRandomJaggedArray() {

        //Jagged Array:-
        int[][] nums = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[5];

        //Assign random value to array:-
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int random = (int) (Math.random() * 10);
                nums[i][j] = random;
            }
        }

        for (int n[] : nums
        ) {
            for (int m : n
            ) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public void printJaggedArrayWithGivenArray() {
        //jagged Array:-
        int[][] nums = new int[4][];
        nums[0] = new int[]{2, 4, 1, 6};
        nums[1] = new int[]{5, 0, 1, 9, 7};
        nums[2] = new int[]{7, 1, 0, 9, 5, 8};
        nums[3] = new int[]{3, 2, 5, 4, 8, 9, 0};


        for (int n[] : nums
        ) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }

    public void twoDimensionalArray() {
        //2-Dimensional Array:-
        int[][] nums = new int[3][4];

        //Assigning Random value to element of Array:-
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int random = (int) (Math.random() * 10);
                nums[i][j] = random;
            }
        }


        //Print the Array:-By using Enhanced for loop
        System.out.println("Print 2-D array by Enhanced loop");
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //Print the Array :-By using for loop

        System.out.println("Print 2-D Array By for Loop:-");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void oneDimensionalArray() {
        //One dimensional Array:-
        int[] num = new int[5];

        System.out.println("Print 1-D Array:-");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
        }
        for (int n : num) {

            System.out.print(n + " ");
        }
        System.out.println();
    }
}