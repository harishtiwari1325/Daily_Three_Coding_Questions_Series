import java.util.*;
public class PatternDay2 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int num = j.nextInt();
        hulk(num);
    }
    static void hulk(int rows){
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}