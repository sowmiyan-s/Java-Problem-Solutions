import java.util.Scanner;
public class sumofn {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
        
        System.out.print("Enter number :");
        int n = s.nextInt();
        int sum = 0;
        for(int i= 0 ; i<=n ; i++ ){sum+=i;}
        System.out.println("Sum of " + n + " is : " + sum);

        }
    }

}
    

