import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in);){
        System.out.print("Enter a Number : ");
        long num = s.nextLong();
        long copy= num;
        long remainder = 0,reverse=0;
        while(num!=0){
            remainder = num%10;
            num = num/10;
            reverse = (reverse*10)+remainder;
        }

        if(copy == reverse){
            System.out.println("The Number is Palimdrome Number");
        }
        else{ System.out.println("The Number is Not Palindrome Number");}
    }
}
    
}
