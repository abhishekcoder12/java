
import java.util.Scanner;

class switchcase{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner so=new Scanner(System.in);
        System.out.print("options :");
        int a=so.nextInt();

        switch (a){
            case 1 -> System.out.println("hello");
            case 2 -> System.out.println("namaste");
            case 3 -> System.out.println("bonjour");
            default -> System.out.println("invalid option");
        }

    }
}