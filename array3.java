
import java.util.Scanner;

public class array3 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the number of the array you wanna create : ");
        int n=scan.nextInt();
       
        int numbers[]=new int[n];
        for(int i =0;i<n;i++){
            int v=scan.nextInt();
            numbers[i]=v;

            

        }
        System.out.print("enter the digit you wanna find in array :");
        int x= scan.nextInt();
        for (int j= 0; j < n; j++) {
            if(numbers[j]==x){
                System.out.println("array index where number is "+x+" is :"+j);
            }
            
        }
        

    }
}
