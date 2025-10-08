import java.util.Scanner;
public class string_palindrome {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a String : ");
            String str = s.nextLine();
            String[] a = str.split("");
            String reverse ="";
            for(String i:a){
                reverse = i + reverse;}
            System.out.println("----------------");
            System.out.println(str.equals(reverse));
            
        }
        
    }
    
}
