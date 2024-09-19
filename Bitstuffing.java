import java.util.*;
import java.lang.*;
import java.io.*;
public class Bitstuffing
{
public static void main(String args[]) throws Exception
{
System.out.println("enter the binary message");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
String res=new String();
int count=0;
for(int i=0;i<str.length();i++)
{
System.out.println(str.charAt(i));
if(str.charAt(i)!='1'&&str.charAt(i)!='0')
{
System.out.println("enter the binary value");
return;
}
if(str.charAt(i)=='1')
{
count++;
res=res+str.charAt(i);
}
else
{
res=res+str.charAt(i);
count=0;
}
if(count==5)
{
res=res+"0";
count=0;
}
}
System.out.println("the original message:"+str);
System.out.println("the bitstuffing message:"+res);
res="011111110"+res+"01111110";
}
}
