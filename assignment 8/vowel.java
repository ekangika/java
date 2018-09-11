import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
String a,b="";
System.out.println("enter original string");
Scanner sc=new Scanner(System.in);
a=sc.nextLine();

b=a.replaceAll("[aeiouAEIOU]","");
System.out.println("String without vowels is   "+b);
}
}