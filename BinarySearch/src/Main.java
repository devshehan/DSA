import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Binary Search -> O(log n)

        int[] array = new int[100];

        for(int i =0; i< 100; i ++){
            array[i] = i;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int target = scanner.nextInt();
        scanner.close();

//        int index = Arrays.binarySearch(array,34);
        int index = binarySearch(array,target);             // input from the user

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length -1;

        while(low <= high){
            int middle = low + ( high - low ) / 2;
            int value = array[middle];

            if(value < target){
                low = middle + 1;
            }else if(value > target){
                high = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}