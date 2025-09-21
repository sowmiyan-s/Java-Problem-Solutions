import java.util.Scanner;
public class frequency_count_of_array {

   public static void main(String[] args) {
    
     try(Scanner s = new Scanner(System.in)){
           
        System.out.print("Enter The Length Of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        int[] counter = new int[size];
        System.out.println("Enter The Elements : ");
        for(int i=0;i<size;i++){arr[i] = s.nextInt();}
        
        for(int i=0;i<size;i++){

            if(counter[i]==-99){
                continue;
            }

            counter[i]=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    counter[i]++;
                    counter[j]=-99;

                }
                System.out.println(arr[i] + " occurs " + counter[j]);
            }
            


        }


        

    }
    
   }
}
