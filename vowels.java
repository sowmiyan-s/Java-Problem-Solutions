import java.util.*;
public class vowels {

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){
        String s = "AEIOUaeiou";
        System.out.print("Enter a char : ");
        char[] i = sc.nextLine().toCharArray();
        int a = 0;
        for( char j: s.toCharArray() ){

            if(i[0]==j){

                System.out.println("A VOWEL");
                a++;

            }
          
        }
        if(a!=1)
        System.out.println("Not A VOWEL");}

        }
    }
    

