public class pattern9 {
    
    public static void main(String[] args) {
        
        int n=5;

        for(int c = 1;c<=n;c++){
            for (int r=1;r<=c;r++) {
                int k =c+r;
                if( k % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
}
