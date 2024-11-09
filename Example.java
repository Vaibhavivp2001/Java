import java.util.*;
 public class Example{
  public static void main(String x[]){
  int arr[][]={{95,97,95,98},{100,102,103,101},{66,68,69,66}};
  int value=0;
  for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr[i].length;j++){
if(i<=j){
System.out.printf("%c",(char)(arr[i][j]));
}
}
}
}
}