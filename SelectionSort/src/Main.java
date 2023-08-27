import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfTheArray = scanner.nextInt();
        scanner.close();

        Random random = new Random();

        // create the array
        int[] array = new int[sizeOfTheArray];
        for(int i = 0; i< sizeOfTheArray; ++i){
            array[i] = random.nextInt(20);
        }

        System.out.println("Before the sort: " + Arrays.toString(array));
        // call the sorting function
        selectionSort(array);
        System.out.println("After the sort: " + Arrays.toString(array));
    }

    // selection sort;
    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            int minIndex = i;
            for(int j = i + 1; j < arr.length-1; ++j){
                if(arr[j] < arr[minIndex]){
                    minIndex  = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}