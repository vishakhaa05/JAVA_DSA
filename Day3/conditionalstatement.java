package Day3;
import java.util.Scanner;
public class conditionalstatement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("Eligible to vote"); 
    } else {
        System.out.println("Not eligible to vote");
    }
    }
}