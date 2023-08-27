import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfTheArray = scanner.nextInt();

        Random random = new Random();
        int[] numberArray = new int[sizeOfTheArray];

        for(int i = 0; i< sizeOfTheArray; i++){
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