import java.util.Scanner;
public class sum_of_integer {

    public static void main(String[] args) {
        try( Scanner s = new Scanner(System.in);){
        System.out.print("Enter a Number : ");
        int num= s.nextInt(); 
        int r=0,count=0;
        while(num!=0){
            r = num%10;
            num = num/10;
            count+=r;
        }
        System.out.println("The Sum is : "+count);
    }
        
    }
}