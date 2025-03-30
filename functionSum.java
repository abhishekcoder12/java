import java.util.Scanner;

public class functionSum {
    public static int sum(int a, int b){
        
       int  sum= a + b ; 
      
        return sum;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int a =so.nextInt();
        int b =so.nextInt();

        int totalsum =sum(a,b);
        System.out.println(totalsum);
    }
}
