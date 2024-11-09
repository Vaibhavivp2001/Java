import java.util.*;
abstract class ArrayOperation{
	int x[];
	abstract void PerformOperation(int x[]);
}
class sort extends ArrayOperation {
	void PerformOperation(int x[]) {
	for(int i=0;i<x.length-1;i++) {
		for(int j=i+1;j<x.length;j++) {
			if(x[i]>x[j]) {
				int t=x[i];
				x[i]=x[j];
				x[j]=t;
			}
		}
	}
	for(int i=0;i<x.length;i++) {
		System.out.print(x[i]+" ");
	}
}
}
class Insertion extends ArrayOperation{
	int index,value;
	void setValue(int index,int value) {
		this.index=index;
		this.value=value;
	}
	void PerformOperation(int x[]) {
		int size=x.length-2;
		for(int i=size;i>=index;i--) {
			x[i+1]=x[i];
		}
		x[index]=value;
		size=size+1;
	for(int i=0;i<size+1;i++) {
		System.out.print(x[i]+" ");
	}
	}
}
class deletion extends ArrayOperation{
	int index;
	void setIndex(int index) {
		this.index=index;
	}
	void PerformOperation(int x[]) {
		for(int i=index;i<x.length-1;i++) {
			x[i]=x[i+1];
		}
		int size=x.length-1;
		for(int i=0;i<size;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
class Rev extends ArrayOperation{
	void PerformOperation(int x[]) {
		int j=x.length-1;
		int mid=x.length/2;
		for(int i=0;i<mid;i++) {
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
			j--;
		}
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
public class Interface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the array ");
		int []a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int ch;
		do {
		System.out.println("\n1.Sort");
		System.out.println("\n2.Insertion");
		System.out.println("\n3.Deeletion");
		System.out.println("\n4.reverse");
		System.out.println("\n\nEnter a choice ");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			sort s=new sort();
			s.PerformOperation(a);
			break;
		case 2:
			Insertion i=new Insertion();
			i.setValue(2, 100);
			i.PerformOperation(a);
			break;
		case 3:
			deletion d= new deletion();
			d.setIndex(2);
			d.PerformOperation(a);;
			break;
		case 4:
			Rev r=new Rev();
			r.PerformOperation(a);
			break;
		}
              }
                while(ch!=0);
		sc.close();
	}

}
