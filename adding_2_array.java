import java.util.Scanner;
public class adding_2_array {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Size of Array : ");
            int size = s.nextInt();
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            System.out.println("Enter Size Of Array 1 : ");
            for(int i=0;i<size;i++){
                arr1[i]= s.nextInt();
            }

            System.out.println("Enter Size Of Array 2 : ");
            for(int i=0;i<size;i++){
                arr2[i]= s.nextInt();
                arr2[i]+=arr1[i];
            }
            
            System.out.println("The Added Array Is : ");
            for(int value:arr2){
                System.out.print(value + " ");
            }

        }
        
    }
    
}
