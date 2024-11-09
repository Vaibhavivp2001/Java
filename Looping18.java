import java.util.*;

public class Looping18 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long no = xyz.nextLong();
         no = Math.abs(no);
         int[] frequency = new int[10];
          while (no > 0) {
          int digit = (int) (no % 10); 
          frequency[digit]++; 
          no=no/ 10; 
        }
        
        System.out.println("Frequency of digits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
	}
}