import java.util.Scanner;
public class collatz_sequence {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int n = s.nextInt();
            while (n!=1) {
            if(n%2==0){n = n/2;}
            else{n=(3*n)+1;}
        }
        System.out.println("The collats sequence is : " + n);
        }
    }
    
}
