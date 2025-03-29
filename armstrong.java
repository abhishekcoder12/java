

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner ao=new Scanner(System.in);
        System.out.print("enter your number :");
        int a=ao.nextInt();
        int r,sum=0 ,i=a;
        while (a>0) {
            r=a%10;
            sum=(sum)+r*r*r;
            a=a/10;
            
        }
        System.out.println(sum);
        if(sum==i){
            System.out.println("its armstrong");
        }else{
            System.out.println("its not");
        }
    }
}
