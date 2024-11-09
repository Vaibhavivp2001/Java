import java.io.*;
import java.util.*;
public class FileHandlingQ1{
  public static void main(String x[]) throws Exception
  {
  File f=new File("C:\Program Files\Java\jdk-22\bin\FileHandling.txt");
  FileWriter fw=new FileWriter(f);
   Scanner sc=new Scanner(System.in);
   System.out.print("\nEnter the string:");
   String str=sc.nextLine();
    fw.write(str);
    fw.close();
    System.out.println("File Save Successfully.........");
   }
 }
