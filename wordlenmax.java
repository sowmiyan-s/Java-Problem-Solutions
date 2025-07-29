import java.util.Scanner;

public class wordlenmax {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)){
        System.out.print("Enter word 1 : ");
        String word1 = s.next();
        System.out.print("Enter word 2 : ");
        String word2 = s.next();
        int max = 0;
        String MAXWORD = "";
        if(word1.length()< word2.length()){
             max = word2.length();
             MAXWORD = word2;
        }
        else{
             max = word1.length();
             MAXWORD = word1;}
        if(word1.length() == word2.length())System.out.println("Both words have same length");
        System.out.println("Word with max length is  " + MAXWORD + " with length " + max);
    }

    }
}
