import java.util.Scanner;
public class selection_sort {
    
    public static void main(String[] args) {


        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter The Length Of Array : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter The Elements : ");
            
            for(int i=0;i<size;i++){arr[i] = s.nextInt();}

            for(int i:arr){System.out.print(i + " ");}
            

            
            for(int i =0;i<size;i++){
                for(int j =i+1;j<size;j++){

                    if(arr[i]>arr[j]){
                        arr[i] = arr[i] + arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];


                        

                    }


                }
            }
            System.out.println(" \nSorted Array Is : ");
            for(int i:arr){System.out.print(i + " ");}

            
        }
        

    }
}
