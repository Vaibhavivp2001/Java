import java.util.Scanner;

public class Looping35 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int no, temp, sum = 0, f, rem;
        System.out.println("Enter the range:");
        no = xyz.nextInt();
        for (int i = 1; i <= no; i++) {
            sum = 0;
            temp = i; 
            while (temp > 0) {
                rem = temp % 10;
                f = 1;
                for (int j = 1; j <= rem; j++) { 
                    f *= j;
                }
                sum = sum + f;
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.printf("\t%d", i);
            }
        }
    }
}