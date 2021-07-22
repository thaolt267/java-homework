package week1;

public class Exercise04 {
    public static void main(String[] args) {
//        Please revert a given array
//
//        input { 1, 2, 3, 4, 5 }
//        output { 5,4,3,2,1 }

        int myArr[] = new int[]{1, 2, 3, 4, 5};
        int temp=0;

        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[j] > myArr[i]) {
                    temp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = temp;

                }
            }
        }
        System.out.println("New array after reverting : ");
        for(int i : myArr){
            System.out.printf("%d ",i);
        }
    }
}
