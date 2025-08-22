import java.util.Scanner;
public class multiplication_table {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter a Number : ");
            int num = s.nextInt();
            System.out.println("-------------------");
            System.out.println(" \s\s TABLES");
            System.out.println("-------------------");
            for(int i=1;i<11;i++){
                System.out.println(i + " X " + num + " = " + i*num);
            }
            System.out.println("-------------------");

        }

        
    }
    
}
