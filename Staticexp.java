import java.util.Scanner;
class Staticexp
{
  static void hello()
  {
    System.out.print("static ");
  }
  void world()
  {
    System.out.print("static block example!");
  }
  public static void main(String args[])
  {
     Staticexp a=new Staticexp();
     hello();
     a.world();
  }
}