import java.util.*;
public class ArrayApp {
	public static void main(String[] args) {
		int []a=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("\nENter elements in an array ");
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
		System.out.println("\nAfter asceding order ");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d ", a[i]);
		}
		int count=1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=a[i-1]) {
				count++;
			}
			if(count==2) {
				System.out.println("\nThe second larget element is "+a[i-1]);
				break;
			}
		}
	}
}