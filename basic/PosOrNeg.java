
import java.util.Scanner;

public class PosOrNeg {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num =cs.nextInt();

    if (num>0)
    System.out.println("positive");
    else if(num<0)
    System.out.println("negative");
    else
    System.out.println("Zero");
    cs.close();
    }
}