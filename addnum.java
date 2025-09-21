import java.util.Scanner;

public class addnum {
    /**
     * add two numbers 
     */
    public static void main(String[] args) {
            try (Scanner s = new Scanner(System.in)) {
                int[] arr = {0,0};
                System.out.print("Enter num 1 : ");
                arr[0] = s.nextInt();
                System.out.print("Enter num 2 : ");
                arr[1] = s.nextInt();
                System.out.println("Total : "+ (arr[0]+ arr[1]));
            }
          
    }
    

    
}
