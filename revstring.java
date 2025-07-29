public class revstring {
    public static void main(String[] args) {
        String a= "abcd";
        String b = "";
        System.out.println("Before Reverse : "+ a);
        for(char i:a.toCharArray()){b = i+b;}
        System.out.println("After Reverse : "+b);
    }
    
}
