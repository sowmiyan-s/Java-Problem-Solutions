import java.util.Scanner;
public class  sum_of_array {
    
    public static void main(String[] args) {


        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter The Length Of Array : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter The Elements : ");
            
            for(int i=0;i<size;i++){arr[i] = s.nextInt();}
             
            int sum =0;
            for(int i:arr){
                sum+=i;
            }
            System.out.printf("The Sum Of Array : %d",sum);
            

           

            
        }
        

    }
}
