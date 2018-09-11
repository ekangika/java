import java.util.Scanner;
class Main
{
public static void main(String args[])
{
String a,b = "";
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of string");
a=sc.nextLine();
int c;
c=a.length();
for(int i=c-1;i>0;i--)
{
b=b+a.charAt(i);
}
System.out.println("reverse of a string "+b);
}
}