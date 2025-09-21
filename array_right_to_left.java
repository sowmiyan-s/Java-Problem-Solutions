import java.util.Scanner;
public class  array_right_to_left {
    
    public static void main(String[] args) {


        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter The Length Of Array : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter The Elements : ");
            
            for(int i=0;i<size;i++){
                arr[i] = s.nextInt();}


            System.out.println("Array Is (Right To Left)");
            for(int i=size-1;i>=0;i--){
                System.out.print(arr[i] + " ");}
            

           

            
        }
        

    }
}
