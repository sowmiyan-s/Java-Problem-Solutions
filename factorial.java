import java.util.*;
public class factorial {

    public static void main(String[] args) {
        System.out.println("------------------");
        try(Scanner s = new Scanner(System.in) ){
            System.out.print("Enter a  number : ");
            int n = s.nextInt();
            int fact = 1;
            for(int i=1;i<=n;i++){
                fact = fact * i;

            }
            System.out.println("------------------");
            System.out.println("The factorial of " + n +" is : "+ fact);
            System.out.println("------------------");


        }
        
    }
    
}
