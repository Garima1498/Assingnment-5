
import java.util.Scanner;
class Arrayswap
{
  public static void main(String [] args)
  {
    Scanner d=new Scanner(System.in);
    System.out.println("enter the size");
    int a,i,j,temp=0;
    a=d.nextInt();
    int b[] =new int [a];
    for(i=0;i<a;i++)
    {
   b[i]=d.nextInt();
    }
    System.out.println("Entered elements: ");
    for(i=0;i<a;i++)
    { 
      System.out.println(b[i]);
    }
    System.out.println("");
    for(i=0;i<=1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    for(i=a-3;i<a-1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    System.out.println("Output: ");
    for(i=0;i<a;i++)
    {
      System.out.println(b[i]);
    }
  }
}