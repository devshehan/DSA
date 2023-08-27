import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberArray = new int[10];

        for(int i = 0; i< 10; i++){
            numberArray[i] = random.nextInt(100);
        }
        System.out.println("Before Sorted: " + Arrays.toString(numberArray));
        bubbleSort(numberArray);
        System.out.println("After Sorted: " + Arrays.toString(numberArray));

    }

    private static void bubbleSort(int[] arr){
        int arrSize = arr.length-1;
        for(int i = 0; i< arrSize; ++i){
            for(int j = 0; j < arrSize-i ; ++j){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}