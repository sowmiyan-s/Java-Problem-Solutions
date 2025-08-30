import java.util.Scanner;
public class Watermelon {


    static boolean watermelon(int weight){
         if( weight%2==0  && weight>=6){return true;}
         else{return false;}}

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in);){

            while(true){
            
                
            System.out.print("| Enter WaterMelon Size : ");
            int weight = s.nextInt();
            System.out.println("| Dividable : "+ watermelon(weight));
           
        }
            

    }
    }
    
}
