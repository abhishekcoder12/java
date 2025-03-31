public class strings2 {
    
    public static void main(String[] args) {
        String name1 ="abhishek";
        String name2 ="abhishek";
        // name1 > name2 == +ve num
        // name1 == name2 == 0
        // name1 < name2 == -ve num
        if(name1.compareTo(name2) == 0){
            System.out.println("strings are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
