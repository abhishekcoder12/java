class string_builder{

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        for (int i = 0; i < sb.length()/2; i++) {
            int f=i;
            int b=sb.length()-1-i;
            char front= sb.charAt(f);
            char back =sb. charAt(b);
           sb.setCharAt(f, back);
           sb.setCharAt(b, front);
        }
        System.out.println(sb);
    }
}