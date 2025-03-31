
import java.util.Scanner;

public class array2d2 {
    
    


        /**
         * @param args
         */
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner so=new Scanner(System.in);
            System.out.print("enter the rows and columns");
            int r=so.nextInt();
            int c=so.nextInt();
            System.out.println("enter the array elements :");
    
    
            int[][] number =new int[r][c];
            for (int i=0 ; i<r;i++) {
                for(int j=0;j<c;j++){
                    
                    number[i][j]= so.nextInt();
                }
                
            }
           System.out.println("find number :");
           int v = so .nextInt();
            for (int i=0 ; i<r;i++) {
                for(int j=0;j<c;j++){
                    if(number[i][j] == v){
                        System.out.println("{"+i+","+j+"}");

                    }
                }
               
    
            }
        }
    }
