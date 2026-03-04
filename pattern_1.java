import java.util.Scanner;
public class pattern_1 {


    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){

        int n = s.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                    System.out.print(j+ " ");                
            }
            System.out.println();
        }

    }
        

    }
    
}
