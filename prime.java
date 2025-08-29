import java.util.Scanner;
public class prime {

    static boolean IsPrime(int num){
        int count = 2;
        for(int i=2;i<=num/2;i++){
            if(i%2==0){count++;}}

            if(count==2 && num!=1)
            return true;
            else
            return false;

    }  


    
    public static void main(String[] args) {


        try(Scanner s = new Scanner(System.in)){
            
            System.out.print("Enter a number : ");
            int num = s.nextInt();
            boolean ans = IsPrime(num);
            if (ans)
            System.out.println("It is a Prime Number");
            else
            System.out.println("It is not a Prime Number");

        }
        
    }
    
}
