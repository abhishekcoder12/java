
import java.util.Scanner;

public class function1 {
    public static void PrintMyName(String name){
        System.out.println(name);
       
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner so=new Scanner(System.in);
        System.out.print("enter your name :");
        String name=so.nextLine();

        PrintMyName("your name is :"+name);
    }
}
