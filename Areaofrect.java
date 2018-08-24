import java.lang.*;
import java.util.*;
class Rectangle
{
  int l,b;
  public void getdata()
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the length");
    l=ss.nextInt();
    System.out.println("enter the breadth");
    b=ss.nextInt();
    ss.close();
  }
  public void calarea()
  {
    int total;
    total=l*b;
    System.out.println("total area of rectangle is :- "+total);
  }
}
class Areaofrect
{
  public static void main(String [] aa)
  {
    Rectangle rr=new Rectangle();
    rr.getdata();
    rr.calarea();
  }
}