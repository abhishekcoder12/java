
import java.util.Scanner;

class four {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        System.out.print("press 1 to say hello , press 2 to say namaste , press 3 to say bonjour : ");
        int a =so.nextInt();

        if (a == 1){
            System.out.println("hello");
        } else if(a==2){
            System.out.println("namaste");
        }else if(a==3){
            System.out.println("bonjour");
        }else{
            System.out.println("invalid option");
        }


        
    }
}