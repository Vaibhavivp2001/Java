class MatTest{
void setArr(int []...x)
{
  for(int i=0;i<x.length;i++)
  {
    for(int j=0;j<x[i].length;j++)
   {
     System.out.printf("%d\t",x[i][j]);
    } 
    System.out.println("\n");
  }
 }
}
public class MatTestApp{
  public static void main(String ...x){
  MatTest mt=new MatTest();
  mt.setArr(new int[]{1,2,3},new int[]{4,5,6},new int[]{7,8,9});
  }
}