package practice.javaMasterClass;

import java.util.Scanner;

public class ArrayChallenge {

    private int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j+1 < array.length - i; j++) {
                if (array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private int[] selectionSortDesc(int[] array){
        System.out.println("Sorting has started...");
        for (int i = 0; i < array.length; i++) {
            int largerNumber = array[i];
            int indexOfLargerNumber = 0;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] > largerNumber){
                    largerNumber = array[j];
                    indexOfLargerNumber = j;
                }
            }
            if (largerNumber != array[i]){
                int swapIndexValue = array[i];
                array[i] = largerNumber;
                array[indexOfLargerNumber] = swapIndexValue;
            }
        }
        System.out.println("Sorting has completed.");
        return array;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i+1 != array.length)
                System.out.print(", ");
        }
    }

    private static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of array");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.printf("enter %s numbers: ", arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {45,76,7,5,4,45,7,3,90};
        //int[] nums = getIntegers();
        new ArrayChallenge().bubbleSort(nums);
        ArrayChallenge.printArray((nums));
    }
}
