package week1;

public class Exercise03 {
    public static void main(String[] args) {
//        Please sort an integer array from minimum to maximum value
//
//        input {1, 3, 2, 5, 4 }
//        output { 1,2,3,4,5 }

        int myArr[] = new int[]{1, 3, 2, 5, 4};
        int temp=0;
//      Lay phan tu thu nhat cua mang so sanh voi cac phan tu con lai, rui lap lai vo cac phan tu tiep theo
        for( int i =0; i<myArr.length; i++){
            for(int j= i+1; j< myArr.length; j++ ){
                if(myArr[j]<myArr[i]){
                    temp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = temp;

                }
            }
        }
        System.out.println("New array after sorting : ");
        for(int i : myArr){
            System.out.printf("%d ",i);
        }


    }
}
