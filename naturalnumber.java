import java.util.*;

public class naturalnumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner so=new Scanner(System.in);
        System.out.println("enter the nth number to find sum of natural number till nth number :");
        int n=so.nextInt();

        int sum=0;
        for(int i=1 ; i<=n;i++)
        {
            sum= sum + i;
        }
        System.out.println(sum);

    }
}
