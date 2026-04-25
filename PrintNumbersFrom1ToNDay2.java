import java.util.*;
public class PrintNumbersFrom1ToNDay2 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = j.nextInt();
        roggers(num);
    }
    static void roggers(int a){
        for(int b = 1 ; b <= a ; b++){
            System.out.print(b + " ");
        }
    }
}