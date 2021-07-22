package week1;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
//        Allow user to input up to 10 numbers from keyboard then print out the average number value.
//
//        If user input 0, exit the program.If user
//        If user inout over 10 numbers, tell user know and print out the average number then exit the program
        final int MAX_ARR_LENGTH = 10;
        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int[] myArr = new int[MAX_ARR_LENGTH];
        double average = 0.00d;
        double sumArr = 0.00d;

        while (scanner.hasNext()) {
            //Input 0 to exit the program
            System.out.println("Input 0 to exit the program: ");
            if (scanner.nextInt() == 0) {
                System.out.println("Bye!");
                System.exit(1);
            }
            for (int i = 0; i < myArr.length; i++) {
                System.out.println("Please input the element index " +i+ " of array");
                myArr[i] = scanner.nextInt();
                sumArr += myArr[i];

            }
            average = sumArr / MAX_ARR_LENGTH;
            System.out.println("Sum of array is " + sumArr);
            System.out.printf("Average of array = %10.2f",average);

        }


    }
}
