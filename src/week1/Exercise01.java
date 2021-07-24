package week1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Get the input from user (keyboard) then find out whether:
        //the input number is in the array or not
        //if yes please count and print out how many
        int myArr[] = new int[]{1, 2, 4, 2, 5, 6, 2, 5};
        Scanner scanner = new Scanner(System.in);

        boolean isContinuing = true;
        int countTimeDisplay = 0;
        final String NUMBER_EXISTING_MSG = "You have input number %d exist in array and it displays %d time(s) %n";
        final String NUMBER_NOT_FOUND_MSG = "We don't have that number in the array%n";

        while (isContinuing) {
            System.out.println("Please input a number, 0 to exit the program");
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                isContinuing = false;
            }
            if (isContinuing) {
                for (int elementIndex = 0; elementIndex < myArr.length; elementIndex++) {
                    if (inputValue == myArr[elementIndex]) {
                        countTimeDisplay++;
                    }
                }
                if (countTimeDisplay > 0) {
                    System.out.printf(NUMBER_EXISTING_MSG, inputValue, countTimeDisplay);
                    countTimeDisplay = 0;
                } else
                    System.out.println(NUMBER_NOT_FOUND_MSG);

            }
        }
        System.out.println("Bye bye!");
    }
}
