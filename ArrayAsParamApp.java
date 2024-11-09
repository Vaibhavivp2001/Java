class ArrayAsParam{
 void setArray(int a[])
{
  System.out.println("Base Address in Function "+System.identityHashCode(a));
 }
}
public class ArrayAsParamApp{
 public static void main(String x[]){
int m[]=new int[]{10,20,30,40,50};
ArrayAsParam ap=new ArrayAsParam();
System.out.println("Base Address at function calling point "+System.identityHashCode(m));
ap.setArray(m);
 }
}
 