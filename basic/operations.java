
import java.util.Arrays;
import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner cs = new Scanner (System.in);

        int[] a = {5,10,15,20,25};
        int[] b = {30,35,40,45,50};
        int ok = b.length;

      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println(ok);
      cs.close();
    }

}
