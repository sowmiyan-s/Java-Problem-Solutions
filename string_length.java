import java.util.Scanner;
public class string_length {

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter a  string : ");
            String str1 = s.nextLine();
            System.out.print("Enter a  string : ");
            String str2 = s.nextLine();
            int x = str1.length() + str2.length();
            int name1_len = str1.length();
            int name2_len = str2.length();
            name1_len*=name1_len;
            name2_len*=name2_len;
            x= x/(str1.length()+str2.length());

            for(int i=0;i<name1_len;i++){
                System.out.print(str1.charAt(i)+ " ");}
                System.out.println();

            for(int i=0;i<name2_len;i++){
                System.out.print(str1.charAt(i)+ " ");}

            if(x%2==1){
                System.out.println("Pair is Matched");
            }
            else
            System.out.println("Pair is Not Matched");


        }
    }
    
}
