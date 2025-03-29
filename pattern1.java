
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner so=new Scanner(System.in);
        System.out.println("enter your pattern:");
        @SuppressWarnings("unused")
        String p=so.next();

        for(int c = 1;c<5;c++){
            for (int r=1;r<=5;r++) {
                System.out.print(p);
            }
            System.out.println("\n");
        }
    }
}
