import java.util.Scanner;
public class count_integer_2 {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            long num = s.nextLong();
            num = Math.abs(num);
            num =  (int) Math.log10(num)+1;
            System.out.println("The total integers are : " + num);

        }
        
    }
    
}
