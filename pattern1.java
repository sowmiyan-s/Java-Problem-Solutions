import java.util.Scanner;
public class pattern1 {


    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){

        int n = s.nextInt();
        int val =1;
        for(int i=1;i<=n;i++){


                if(i%2==0){
                    for(int k=n-1;k>=0;k--){
                        System.out.printf("%7d ", k + (val));}
                    val+=n;}
                else {
                    
                    for(int j=1;j<=n;j++){System.out.printf("%7d ", (val++));}     } 

                    System.out.println();
            }
            
        }

    }}
    

