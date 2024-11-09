import java.util.*;

public class Looping19{
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        System.out.print("Enter a number: ");
        int no = xyz.nextInt();
        
        if (no >= 0 && no <= 9) {
            System.out.println("Number in words: " + words[no]);
        } else {
            System.out.println("Number out of range.");
        }
        
        
    }
}