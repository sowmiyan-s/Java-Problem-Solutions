import java.util.Scanner;
public class array_orr_even_order {


    public static boolean order(int[] arr){
    for(int val=0;val<arr.length-1;val+=2){
        if(arr[val]%2==0 || arr[val+1]%2==1){return false;}}
        return true;}


    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){
        System.out.print("Enter The Size Of Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter The Elements Of Array : ");
        for(int i =0;i<size;i++){arr[i]= s.nextInt();}

        if(order(arr))
        System.out.println("The array is in Odd-Even order.");
        else
        System.out.println("The array is not in Odd-Even order.");

        
    }
}


    
}
