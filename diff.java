
import java.util.Scanner;


public class diff {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so =new Scanner(System.in);
        System.out.print("enter first number :");
        int a=so.nextInt();
        System.out.println("enter second number :");
        int b=so.nextInt();

        if(a> b){
            System.out.println(a+" is greater then "+b);
        }else if(a<b){
            System.out.println(a+" is lesser then "+b);
        }else{
            System.out.println(a+" or "+b+" are equal");
        }

    }

    
}