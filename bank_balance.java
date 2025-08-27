import java.util.Scanner;
public class bank_balance {


/*
 * PROBLEM: You have 1000 or an amount A in your bank account.
 * You buy a product X in the store for amount B.
 * For every 10 spent, you get an additional 20 in your account.
 * What is the bank balance after buying product X?
 */

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Bank Balance : ");
            int account = s.nextInt();
            System.out.print("Enter Product's Price : ");
            int price = s.nextInt();

            if(price>account){System.out.print("Insufficient Balance");}
            else{
                account-=price;
                account += (price/10)*20;
                System.out.println("TOTAL BALANCE : "+ account);
            }


            }


        }
        
    }
