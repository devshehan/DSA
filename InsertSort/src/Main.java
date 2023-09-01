import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeOfTheArray = scanner.nextInt();
        scanner.close();

        Random random = new Random();

        int[] array = new int[sizeOfTheArray];
        for(int i = 0; i<sizeOfTheArray; ++i){
            array[i] = random.nextInt(100);
        }

        System.out.println("Before the insertion sort: "+ Arrays.toString(array));
        // call the insertion sort
        insertionSort(array);
        System.out.println("After the insertion sort: " + Arrays.toString(array));
    }

    private static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; ++i){
            int temp = arr[i];
            int j = i -1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] =  arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}











