public class pattern8{
     
    public static void main(String[] args) {
        int n =5;
        int num =1;

        for(int c = 1;c<=n;c++){
            for (int r=1;r<=c;r++) {
                
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    
    }
}
