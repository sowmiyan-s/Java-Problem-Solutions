import java.util.Scanner;
public class array_odd_or_even {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Array Size : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for(int i =0;i<size;i++){
                int x = s.nextInt();
                arr[i] = x;
            }
            int odd=0;
            int even = 0;
            for(int n:arr){
                if(n==0){continue;}
                if(n%2==0){even++;}
                else{odd++;}
            }

            System.out.println("No Of Odd Numbers : "+ odd);
            System.out.println("No Of Even Numbers : "+ even);





        }
        
    }
    
}
