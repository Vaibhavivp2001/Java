import java.util.Scanner;
class SortArray {
	char ch[];

	void setCharArray(char c[]) {
		ch = c;
	}
    void sort() {
		char temp;
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < ch[i]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
// Print the sorted array
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "\t");
		}
	}
}
public class SortArrayString {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
		char str[] = new char[5];
		System.out.println("Enter Data in character Array:");

		for (int i = 0; i < str.length; i++) {
			str[i] = xyz.nextLine().charAt(0);
		} 
		SortArray obj = new SortArray();
		obj.setCharArray(str);
		obj.sort();
	}

}