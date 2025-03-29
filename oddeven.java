
import java.util.Scanner;

class oddeven{
    @SuppressWarnings("resource")
    public static void main(String [] args){
        
        Scanner so =new Scanner(System.in);
        System.out.print("enter the number to check whether it is odd or even :");
        int n=so.nextInt();

        if(n%2 == 0){
            System.out.println(n+" is even number ");
        }else{
            System.out.println(n+"is odd number ");
        }

    }
}