import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        String binary = "";
        
        
        while (n > 0) {
            int remainder = n % 2;          
            binary = remainder + binary;    
            n = n / 2;                     
        }

        System.out.println("Binary: " + binary);
    }
}
