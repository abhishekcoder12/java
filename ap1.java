

public class ap1 {
    public static void main(String[] args) {
        
        int n=5;
        for(int i = 1;i<=n ;i++){
            for(int l = 1 ; l<=i ;l++){
                System.out.print("*");
            }
            for(int m = 1; m<= n-i; m++){
                System.out.print(" ");
            }
            for(int e = 1; e<= n-i; e++){
                System.out.print(" ");
            }
            for(int r =1; r<=i;r++){
                System.out.print("*");
            }
          System.out.println();  
        }
        for(int di=n;di>=1; di--){
            for(int dl = 1 ; dl<=di ;dl++){
                System.out.print("*");
            }
            for(int dm = 1; dm<= n-di; dm++){
                System.out.print(" ");
            }
            for(int de = 1; de<= n-di; de++){
                System.out.print(" ");
            }
            for(int dr =1; dr<=di;dr++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
