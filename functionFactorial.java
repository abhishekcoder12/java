import java.util.Scanner;
public class functionFactorial {
    
    public static void factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("invalid");
            
        }else{
        for(int i= n;i>=1;i--){
           fact=fact *i;

        }
       System.out.println(fact);
     }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        int n =so.nextInt();
        

        factorial(n);
        
    }
}
