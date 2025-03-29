
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner so=new Scanner(System.in);
        System.out.println("enter the number for table you wanna create :");
        int n=so.nextInt();

       
        for(int i=1;i<=10;i++){
            System.out.println(i*n);

        }
    }
}
