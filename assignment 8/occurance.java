import java.util.Scanner;
class Occurence
{
public static void main(String args[])
{
String a,b;
Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
a=sc.nextLine();
System.out.println("Enter string to be found");
b=sc.nextLine();
int c;
c=-1;
c=a.lastIndexOf(b);
if(c>=0)
{
System.out.println("Yes this substring occurs in main string");
}
else
{
System.out.println("no this substring doesn't occurs in main string");
}
}
}