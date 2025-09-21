import java.util.Scanner;
public class amstrong {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int digits = temp%10;
            System.err.println(digits);
            sum += Math.pow(digits, String.valueOf(n).length());
            temp /=10;
            System.err.println(temp);
            System.err.println(sum);
        }

        System.out.println(n==sum);
    }

    }
}
   

