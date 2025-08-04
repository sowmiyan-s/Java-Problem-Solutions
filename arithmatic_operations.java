import java.util.*;
public class arithmatic_operations {

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter num1 number : ");
            int num1 = s.nextInt();
            System.out.print("Enter num2 number : ");
            int num2 = s.nextInt();
             System.out.println("___________________");
            System.out.println("- 1.Addition \n- 2.Subtraction \n- 3.Multiplication \n- 4.Division \n- 5.Modules");
             System.out.println("___________________");
            System.out.print("Enter your choice : ");  
            int choice= s.nextInt();
            System.out.println("___________________");
            System.out.print("ANSWER : ");
             
            switch (choice) {
                case 1:

                System.out.println(num1+num2);
                break;

                case 2:
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println(num1*num2);
                break;
                case 4:
                System.out.println(num1%num2);
                break;
                default:
                System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("___________________");
        }
        
    }
    
}
