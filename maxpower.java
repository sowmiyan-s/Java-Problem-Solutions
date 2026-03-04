import java.util.Scanner;
public class maxpower {

    public static int abc(int a, int b , int n){
        int pow = 2;
        for(int t=1;t<n;t++){pow = pow*2;}

        int max_val =0;
        for(int c =1;c<pow;c++){
        int temp = (a^c) * (b^c);
        if(temp>max_val){
            max_val = temp;
        }
    }

    return max_val;} 


    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter value a : ");
            int a = s.nextInt();

            System.out.print("Enter value b : ");
            int b = s.nextInt();

            System.out.print("Enter value c : ");
            int c = s.nextInt();

            System.out.println( "Thee maximun product is : "+abc(a,b,c));
        }

        
        

    }
    
}
