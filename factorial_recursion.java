import java.util.*;
public class factorial_recursion {
 
    public static int fact(int n){
        
        if(n==1){return 1;}
        else{return n*fact(n-1);}

       

    }

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter A Number : ");
            int n = s.nextInt();
            System.out.print("The factorial of " + n + " is : ");
            System.out.print(fact(n));

        }


        
    }
}
