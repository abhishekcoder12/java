import java.util.Scanner;

public class functionmul {
    public static int mul(int a, int b){
        
       int  mul= a * b ; 
      
        return mul;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int a =so.nextInt();
        int b =so.nextInt();

        int totalmul =mul(a,b);
        System.out.println(totalmul);
    }
}
