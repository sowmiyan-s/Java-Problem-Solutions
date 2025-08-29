import java.util.Scanner;
public class neon_number {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in);){
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        int sqr = num*num;
        int remainder = 0 , count = 0;
        while(sqr!=0){

            remainder = sqr%10;
            sqr = sqr/10;
            count+=remainder;
        }
        if(num == count){System.out.println("It is a Neon Number");}
        else{System.out.println("It is Not a Neon Number");}
    }
}
    
}
