import java.util.*;
public class ArrayDelete{
	public static void main(String[] args) {
		int []a=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("\nENter elements in an array ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("\nEnter index Number ");
		int index=sc.nextInt();
		int size=a.length;
		for(int i=index;i<size-1;i++) {
			a[i]=a[i+1];
		}
		size--;
		System.out.println("\nAfter deletion ");
		for(int i=0;i<size;i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}
