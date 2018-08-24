import java.util.Scanner;
class Complex
{
int real,imaginary;
Complex(int real,int imaginary)
{
this.real=real;
this.imaginary=imaginary;
}
void Display()
{
System.out.println(real + "+" + imaginary + "i");
}
}


class ComplexShow
{
public static void main(String args[])
{
int r,i,ans;
System.out.println("Enter the real Number");
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
System.out.println("Enter the imaginary Number");
i=sc.nextInt();
Complex C;
C=new Complex(r,i);
C.Display();
}
}