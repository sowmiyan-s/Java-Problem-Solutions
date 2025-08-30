import java.util.Scanner;
public class decimal_to_binary {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in);){
        System.out.print("Enter a Deciaml Number : ");
        int num = s.nextInt();
        int r=0;
        String str = "";
        while(num!=0){
            r = num%2;
            str = r + str;
            num = num/2;
        }
        
        System.out.println("The Binary Number is : " + str);
    }
    }
    
}
