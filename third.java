
import java.util.Scanner;

class third{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
       Scanner so = new Scanner(System.in);
       System.out.print("enter your age :");
       int age=so.nextInt();
       System.out.println("your age is "+age);
     
       if(age>=18){
        System.out.println(" you are an adult");
       }else{
        System.out.println("you are not adult");
       }
    }
}