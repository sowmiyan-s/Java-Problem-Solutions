import java.util.Scanner;
public class array_odd_even_sep {
    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){
            System.out.print("Enter Size of Array : ");
            int size = s.nextInt();
            int[] arr = new int[size];
            System.out.println(":Enter the elements :");
            for(int i =0 ; i<size;i++){
                arr[i]= s.nextInt();
            }


            int count =0;
            for(int i:arr){
                if(i%2==0){
                    count++;
                }
            }

            int[] even = new int[count];
            int[] odd = new int[size-count];

            int a =0;
            for(int i=0;i<size;i++){
                if(i%2==0){
                     if(a>count){
                        break;
                    }
                    even[a]= arr[i];
                    a++;
                }
            }

            int b =0;
            for(int i=0;i<size;i++){
                if(i%2!=0){
                    if(b>size-count){
                        break;
                    }
                    odd[b]= arr[i];
                    b++;
                }
            }


            System.out.print("Odd Array");
            for(int i:odd){
                System.out.print(i + " ");
            }
            System.out.println();
             System.out.print("Event Array");
            for(int i:even){
                System.out.print(i + " ");
            }








        }
    }
        
    }
    

