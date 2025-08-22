import java.util.Scanner;
public class count_integer {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        int count = 0;
        n = (int) Math.abs(n);
        while(n!=0){
            n = n/10;
            count++;

        }
        System.out.println(count);
    }
    }
    
}
