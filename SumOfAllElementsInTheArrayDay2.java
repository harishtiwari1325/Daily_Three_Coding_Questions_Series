import java.util.*;
public class SumOfAllElementsInTheArrayDay2 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter The Array Size: ");
        int size = j.nextInt();
        int[] arr = new int[size];
        // taking tge input from the user
        System.out.println("Enter The Array Elements: ");
        for(int t = 0 ; t < arr.length ; t++){
            arr[t] = j.nextInt();
        }
        // printing the Original Array
        System.out.println("The Original Array is: ");
        System.out.println(Arrays.toString(arr));
        int result = tony(arr);
        System.out.println("The Sum of All Elements In The Array is: " + result);
    }
    static int tony(int... a){
        int sum = 0;
        for(int b = 0 ; b < a.length ; b++){
            sum += a[b];
        }
        return sum;
    }
}