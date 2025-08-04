import java.util.*;
public class number_check {

    public static void main(String[] args) {
        /**
         *  Write a program to check if a number is positive, negative, or zero.

         */
        try(Scanner s = new Scanner(System.in)){
            int i = 0;
            while(i!=1){
            System.out.print("Enter a number : ");
            int n = s.nextInt();
            System.out.println("__________________");
            if(n<0){System.out.println("Negative");}
            if(n==0){System.out.println("Zero");}
            if(n>0){System.out.println("Positive");}
            System.out.println("__________________");
            }

        }

        
        
       


            
        }
    }
    

