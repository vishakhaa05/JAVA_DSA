package Day3;
import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
