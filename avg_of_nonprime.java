import java.util.Scanner;
public class avg_of_nonprime {
    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){
            
            System.out.print("Enter a Number :");
            int n = s.nextInt();
            int sum=0;

            for(int i=1;i<=n;i++){
                int count=2;

                for(int j=2;j<=n/2;j++){
                    if(i%j==0){count++;}
                    if(count==2){sum+=i;}
                }
            }

            System.out.println(sum);
            int count=2;

            for(int k=2;k<=sum/2;k++){
                if(sum%k==0){count++;}
            }

            if(count==2){System.out.println("Prime");}
            
            else{System.out.println("Not Prime");}

        }
    }
    
}
