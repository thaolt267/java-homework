package week1;

import java.util.Scanner;

public class Exercise02_2 {
    public static void main(String[] args) {
//        Allow user to input up to 10 numbers from keyboard then print out the average number value.
//
//        If user input 0, exit the program.If user
//        If user inout over 10 numbers, tell user know and print out the average number then exit the program
        final int MAX_ARR_LENGTH = 10;
        int[] myArr = new int[MAX_ARR_LENGTH];
        Scanner scanner = new Scanner(System.in);

        int curentIndex = 0;
        double average = 0.0;
        boolean isContinuing = true;

        System.out.println("Please input up to 10 numbers, 0 to exit the program: ");

        while (isContinuing) {
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                isContinuing = false;

            }
            //Khi user muon tiep tuc nhap
            if (isContinuing) {
//                System.out.println("Please input the element index " + curentIndex + " of array");
                myArr[curentIndex] = inputValue; // Gan phan tu cua mang bang so moi nhap vao
                curentIndex++;

            }
            // Khi user nhap du 10 so
            if (curentIndex == MAX_ARR_LENGTH) {
                isContinuing = false;
                System.out.println("You've entered 10 numbers...");
            }

        }
        // Xu li tinh toan
        if (curentIndex > 0) {
            double sumArr = 0.0;
            for (int i = 0; i < myArr.length; i++) {
                sumArr += myArr[i];
            }
            average = sumArr / MAX_ARR_LENGTH;
            System.out.println("Sum of array is " + sumArr);
            System.out.printf("Average of array = %10.1f%n", average);
        } else {
            System.out.println("Bye Bye!");
        }


    }
}
