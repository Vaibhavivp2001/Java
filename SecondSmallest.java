import java.util.*;
public class SecondSmallest{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in an array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				count++;
			}
			if(count==2) {
				System.out.println("The second smallest number is "+a[i]);
			}
		}
	}

}