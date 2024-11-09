import java.util.Scanner;

public class Looping24 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int no1 = xyz.nextInt();
        System.out.println("Enter second number: ");
        int no2 = xyz.nextInt();

        int hcf = 1;
        for (int i = 1; i <= no1 && i <= no2; ++i) {
            if (no1 % i == 0 && no2 % i == 0) {
                hcf = i;
            }
        }

        System.out.printf("The HCF of two no is %d",hcf);
   }
}