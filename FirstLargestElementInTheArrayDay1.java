import java.util.*;
public class FirstLargestElementInTheArrayDay1 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int size = j.nextInt();
        int[] arr = new int[size];
        // taking the input from the user
        System.out.println("Enter the Array Elements: ");
        for(int t = 0 ; t < arr.length ; t++){
            arr[t] = j.nextInt();
        }
        // printing the Original Array
        System.out.println("The Original Array is: ");
        System.out.println(Arrays.toString(arr));
        thor(arr);
    }
    static void thor(int[] a){
        int firstLargest = Integer.MIN_VALUE;
        int index = 0;
        for(int b = 0 ; b < a.length ; b++){
            if(a[b] > firstLargest){
                firstLargest = a[b];
                index = b;
            }
        }
        System.out.println("The First Largest Element In The Array is: " + firstLargest);
        System.out.println("The Index of The First Largest Element is: " + index);
    }
}