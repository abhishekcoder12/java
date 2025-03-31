public class strings1 {
    
    public static void main(String[] args) {
        // concatenation
        String name ="abhishek";
        String lastname ="ballure";
        String fullname = name+" "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        for(int i = 0 ; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
