import java.util.*;
  public class Pattern{
    public static void main(String x[]){
                for(int i=1;i<=9;i++) {
			for(int j=1;j<=8;j++) {
				if(j>=6-i && j<=9-i && i<=5) {
					System.out.print("*");
				}
				else if(j>=i-4 && j<=i-1 && i>=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
   }
}