
import java.util.Scanner;

public class array2 {
    
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
        System.out.println("here is the element of your array : ");
        for (int j = 0; j < n; j++) {

            System.out.println("{"+numbers[j]+"}");
            
        }

    }
}
