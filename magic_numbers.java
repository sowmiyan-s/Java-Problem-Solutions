import java.util.Scanner;
public class magic_numbers {


    // Checks if the given integer contains exactly 3 or 5 digits that are either 4 or 7.
    // If so, it is considered a magic number; otherwise, it is not.
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int n = s.nextInt();
      
            int count=0, r;
            while(n!=0){
                r = n%10;
                n = n/10;
                if(r==4 || r==7){
                    count++;
                }

            }
            if(count==3 || count==5){
                System.out.println("It is a magic number");
                

            }
            
            else{
                System.out.println("It is not a magic number");
            }

        }
    }
    
}
