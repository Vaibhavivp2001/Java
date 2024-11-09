import java.util.*;
public class RotateApp {
	Integer[] arr;
	int position;
	public void rotate(Integer[] arr, int size) {
		this.arr = arr;
		position = size;
	}
	void display() {
		for (int i = (position),j = (arr.length-1); i < j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0,j = (position - 1) ; i < j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0,j = (arr.length - 1); i < j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(" %d",arr[i]);
		}
	}
}
public class Rotate {
		public static void main(String[] args) {
			System.out.printf("enter the size of the array:\t");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			Integer arr[] = new Integer[size];
			System.out.println("enter the elements into the array:");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Rotate r = new Rotate();
			System.out.printf("enter the postion of the array to rotate the array:\t");
			size = sc.nextInt();
			r.rotate(arr,size);
			r.display();
		}
}