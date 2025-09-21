import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        int count=0;
    try(Scanner ip=new Scanner(System.in)){
        int num=ip.nextInt();
        while(num!=0)
        {
            int digit=num%10;
            if(digit==8 || digit==7 || digit==2)
                count++;
            num=num/10;
        }
        if(count==7 || count==4)
            System.err.println("win");
        else
            System.err.println("lose");
    }
}
    
}