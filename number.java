import java.util.*;
import java.io.*;
class number
{public static void main(String ags[])
{
number num=new Scanner(System.in);
if(1<=num<=100000)
{
System.out.println("is in range");
if(num>0)
System.out.println("positive");
else if(num==0)
System.out.println("Zero");
else
System.out.println("negative");
}
else
System.out.println("not in range");
}
}
