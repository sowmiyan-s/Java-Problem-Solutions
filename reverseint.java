import java.util.*;
public class reverseint {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int rev=0;
        System.out.println("Before Reverse : "+ num);
        while (num!=0) {
            rev = rev * 10 + num%10;
            num = num/10;
        }
      System.out.println("Reversed Number : "+ rev);
        }
}
}