import java.util.*;
public class array_median {
    public static void main(String[] args) {
        

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Array Size : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            for(int i =0;i<size;i++){
                int x = s.nextInt();
                arr[i] = x;
            }
               
            

            Arrays.sort(arr);
            System.out.println("____________________________");
            System.out.print("Sorted Array : ");
            for(int i =0;i<size;i++){
                
                System.out.print(arr[i] + " ");;
            }
            System.out.println("\n____________________________");
            System.out.print("\nMedian : ");
            
            size = (size-1)/2;
            System.out.print(arr[size]);
             System.out.println("\n____________________________");
        }
    }
    
}
