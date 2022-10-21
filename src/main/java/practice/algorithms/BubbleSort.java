package practice.algorithms;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        boolean swapOn = false;
        while(true){
            swapOn = false;
            for(int i = 0; i < n - 1; i++){
                int active = arr[i];
                int next = arr[i+1];
                int temp = next;
                if(active > next){
                    arr[i+1] = active;
                    arr[i] = temp;
                    swapOn = true;
                }
            }
            if(swapOn == false){
                break;
            }
        }

        BubbleSort.printArray(arr);
    }
}

//{ Driver Code Starts.

public class BubbleSort
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        //taking input using Scanner class
//        Scanner sc = new Scanner(System.in);
//
//        //taking total testcases
//        int t = sc.nextInt();
//        while(t>0)
//        {
//            //taking total elements
//            int n = sc.nextInt();
//
//            //creating a new array of length n
//            int arr[] = new int[n];
//
//            //inserting elements to the array
//            for(int i=0;i<n;i++)
//            {
//                arr[i] = sc.nextInt();
//            }
//            //8
            //24 18 38 43 14 40 1 54


            //calling bubbleSort() method
            int[] arr = {24, 18, 38, 43, 14, 40, 1, 54};
            new Solution().bubbleSort(arr,arr.length);

            //calling printArray() method
            printArray(arr);

            //t--;
        }
    }
// } Driver Code Ends