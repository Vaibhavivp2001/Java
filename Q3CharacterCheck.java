import java.util.*;
class CheckChar{
	private char ch;
	public void setChar(char ch)
	{
		this.ch=ch;
	}
	
	public boolean checkChar()
	{
		if((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			return true;
		}
		else
		return false;
	}
}

public class Q3CharacterCheck{

	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		
		CheckChar c=new CheckChar();
		
		c.setChar(s.next().charAt(0));
		System.out.println(c.checkChar());
		
	}
}