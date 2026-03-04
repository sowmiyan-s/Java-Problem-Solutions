public class subsequence {


    public static void main(String[] args) {
        
        String str = "Hello World";

        CharSequence s = str.subSequence(0,5);
        System.out.println(s);
        System.out.println(str.getClass().getName());


        
    }
    
}
