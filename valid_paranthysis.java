import java.util.Scanner;
public class valid_paranthysis {

    public static boolean isValid(String s) {
    char[] chars = s.toCharArray();
    int left = 0;
    int right = 0;
    
    for (char c : chars) {

        if (c == '(') left++;
        else if(c == ')'){
            right++;}
        
        if (c == '[') left++;
        else if(c == ']') {
            right++;}
        
        if (c == '{') left++;
        else if(c == '}'){
            right++;} 
        }
    
    return left == right;
}


public static void main(String[] args) {

    try(Scanner s = new Scanner((System.in))){
    System.out.println("Enter a ");
    String st1 = s.nextLine();
    System.out.println(isValid(st1));
    }
    
    
}
    
}

