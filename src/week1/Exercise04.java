package week1;

public class Exercise04 {
    public static void main(String[] args) {
//        Please revert a given array
//
//        input { 1, 2, 3, 4, 5 }
//        output { 5,4,3,2,1 }

        int myArr[] = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[myArr.length];
        int temp = 0;

        // Dao nguoc mang cu
        for (int i = 0; i < myArr.length/2; i++) {
            temp = myArr[i];
            myArr[i] = myArr[myArr.length - i - 1];
            myArr[myArr.length - i - 1] = temp;
        }
        System.out.println("New array after reverting : ");
        for (int i : myArr) {
            System.out.printf("%d ", i);
        }

        // Bo mang cu vo mang moi theo thu tụ nguoc lai mang cu
        for (int i = 0; i < myArr.length; i++) {
            newArr[myArr.length - i - 1] = myArr[i];
        }
        System.out.println("New array after reverting : ");
        for (int i : newArr) {
            System.out.printf("%d ", i);
        }

    }
}
