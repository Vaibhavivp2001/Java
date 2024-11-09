import java.util.Scanner;

class CompareStr
{
    private char[] a;
    private char[] b;

    public void setArray(char[] arr1, char[] arr2) {
        a = arr1;
        b = arr2;
    }

    public boolean compareString() {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz = new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int size = xyz.nextInt();
        xyz.nextLine(); 

        char[] ch = new char[size];
        System.out.println("Enter data in first array:");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = xyz.nextLine().charAt(0);
        }
System.out.println("Enter size of second array: ");
        int size1 = xyz.nextInt();
        xyz.nextLine(); 

        char[] ch1 = new char[size1];
        System.out.println("Enter data in second array:");
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = xyz.nextLine().charAt(0);
        }

        CompareStr cs = new CompareStr();
        cs.setArray(ch, ch1);
        boolean result = cs.compareString();
if (!result) {
            System.out.println("Strings are not equal");
        } else {
            System.out.println("Strings are equal");
        }
    }
	}