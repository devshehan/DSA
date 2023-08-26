import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int[] numberArray = {1, 9, 23, 9, 34, 5, 3, 2 , 9};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the value: ");
        int value = scanner.nextInt();
        scanner.close();


        int index = linearSearch(numberArray, value);

        if(index != -1){
            System.out.println("found at: " + index);
        }else{
            System.out.println("could not found...!");
        }

    }

    private static int linearSearch(int[] array, int value){

        for(int i = 0; i< array.length-1; i++){
            if(array[i] == value){
                return i+1;
            }
        }
        return -1;
    }

}