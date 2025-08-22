import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class jewels_stones {

/* LEETCODE : 771. Jewels and Stones
 * You're given strings jewels representing the types of stones that are jewels,and stones representing the stones you have. 
 * Each character in stones is a type of stone you have. 
 * You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * Example : 
 * Input: jewels = "aA", stones = "aAAbbbb"
   Output: 3
 */
    

 public static void main(String[] args) {

    try(Scanner s = new Scanner(System.in)){

        System.out.print("Enter the jewels : ");
        String jewels = s.nextLine();
        System.out.print("Enter the Stones : ");
        String stones = s.nextLine();
        int count=0;
        Set<Character> set =  new HashSet<>();

        for(char c :jewels.toCharArray()){
            set.add(c);
        }

        for(char c:stones.toCharArray()){
            if(set.contains(c)){
                count++;

            }
        }
        
        System.out.println("Available Stones are : "+ count);
    }
    
 }


}
