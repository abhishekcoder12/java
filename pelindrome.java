import java.util.Scanner;
public class pelindrome {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner so=new Scanner(System.in);
        System.out.println("enter your num");
        int a=so.nextInt();
        int r,rev=0, i=a;
        while(a>0){
            r = a % 10;
            rev =(rev * 10)+ r ;
            a = a/10;

        }
        System.out.println(rev);

        if (rev == i) {
            System.out.println("its pelndrome num");
        }else{
            System.out.println("its not");
        }
    }
}