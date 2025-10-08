import java.util.Scanner;
public class string_to_array {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a String : ");
            String str = s.nextLine();
            String[] a = str.split(" ");
            str ="";
            for(String val:a){
                str = val + " " + str;}
            System.out.println("_____________");
            System.out.println(str.toUpperCase());
        }
        
    }
    
}
