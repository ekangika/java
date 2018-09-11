import java.util.Scanner;
class Main
{
public static void main(String args[])
{
String a;
Scanner sc =new Scanner(System.in);
System.out.println("enter the value of a");
a=sc.nextLine();
int b;
b=a.length();
for(int i=0;i<b;i++)
{
System.out.println("Substring ("+i+")"+a.substring(i));
}
}
}