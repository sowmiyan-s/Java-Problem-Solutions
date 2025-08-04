import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Year : ");
            int year = s.nextInt();
            
            if (year % 4 == 0){
                System.out.println("Leap Year ");
            }

            else{
                System.out.println("Not Leap Year");
            }
        }
    
}
    
}
