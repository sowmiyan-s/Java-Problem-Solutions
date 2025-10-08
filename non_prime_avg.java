import java.util.Scanner;
public class non_prime_avg {

    static boolean isprime(int n){
        if(n==2){return true;}
        if(n==1){return false;}
        for(int i=2;i<=n/2;i++){
            if(n%i==0){return false;}
        }
        return true;
    }


    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.println("_______________________________________________");
            System.out.print("Enter a Number : ");
            int n = s.nextInt();
            int count = 0;
            int sum = 0;
            for(int i=1;i<=n;i++){
                if(isprime(i)){
                    sum+=i;
                    count++;
                }
            }
            System.out.println("_______________________________________________");
            System.out.printf("Number of Prime Numbers Between 0 To %d : %d",n,count);
             System.out.println("\n_______________________________________________");
            System.out.println("\nAverage of All Prime Numbers : "+sum/count);
             System.out.println("_______________________________________________");
            System.out.print("The Average  is : ");
            if(isprime(sum/count)){System.out.println("PRIME");}
            else{System.out.println("NOT PRIME");}
             System.out.println("_______________________________________________");
             

        }
        
    }
    
}
