import java.util.*;
public class fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int a = 0;
        int b = 1;
        for(int i=1;i<=count;i++){
        System.out.print(a + " ");
        int next = a+ b;
        a= b;
        b= next;
            

        }
        System.out.println();
        

    }
    
}
