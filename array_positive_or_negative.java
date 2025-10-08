import java.util.Scanner;
public class array_positive_or_negative {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Array Size : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for(int i =0;i<size;i++){
                int x = s.nextInt();
                arr[i] = x;
            }
            int positive=0;
            int negative = 0;
            for(int n:arr){
                if(n==0){continue;}
                if(n>0){positive++;}
                else{negative++;}
            }

            System.out.println("No Of Positive Numbers : "+ positive);
            System.out.println("No Of Negative Numbers : "+ negative);

        }
        
    }
    
}
