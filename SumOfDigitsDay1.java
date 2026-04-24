import java.util.*;
public class SumOfDigitsDay1 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = j.nextInt();
        int result = roggers(num);
        System.out.println("The Original Number is: " + num);
        System.out.println("The Sum Of the digits of: " + num + " is: " + result);
    }
    static int roggers(int a){
        int sum = 0;
        while(a > 0){
            int b = a % 10;
            sum += b;
            a = a / 10;
        }
        return sum;
    }
}