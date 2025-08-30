import java.util.Scanner;
public class elephant_travelling {

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in);){
        System.out.print("Enter The Friends Distance : ");
        int distance = s.nextInt();
        int steps =0;
        steps = (distance/5);
        if((distance%5)!=0){
            steps++;
        }

        System.out.println(steps);
    }
    }
    
}
