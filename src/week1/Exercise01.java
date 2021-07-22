package week1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Get the input from user (keyboard) then find out whether:
        //the input number is in the array or not
        //if yes please count and print out how many
        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        int myArr[] = new int[]{1, 2, 4,2, 5, 6, 2, 5};

        while (scanner.hasNext()){
            int inputValue = scanner.nextInt();
            if(inputValue==0) {
                System.out.println("Bye!");
                System.exit(1);
            }
            int count = 0;
            for(int elementIndex = 0; elementIndex < myArr.length; elementIndex++){
                if(inputValue==myArr[elementIndex]){
                    count++;
                }
            }
            if(count>0){
                System.out.println("Ban vua nhap 1 so trong mang");
                System.out.println("So nay xuat hien "+count+ " lan");
            } else {
                System.out.println("So ban vua nhap khong co trong mang");
            }

        }
    }
}
