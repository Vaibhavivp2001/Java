import java.util.*;
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();//abc12bc2
		char ch[]=s.toCharArray();
		int num=0,sum=0,flag=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				//num=num*10+(ch[i]-'0');//num=0*10+49-48;
				sum=sum+ch[i]-'0';
			}
				
		}
		System.out.println("\nThe sum of numbers present in string is "+sum);
		sc.close();
	}
}