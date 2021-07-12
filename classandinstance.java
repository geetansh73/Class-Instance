import java.io.*;
import java.util.*;

public class Solution {
    int age;
Solution(int initialAge)
{
    if (initialAge>=0)
    {
age=initialAge;
}
else
{
age=0;
System.out.println("Age is not valid, setting age to 0.");
}
}
void yearPasses()
{
age=age+3;
amIOld();
}
void amIOld()
{
if (age<13)
{
System.out.println("You are young.");
}
else if(age>=13&&age<18)
{
System.out.println("You are a teenager.");
}
else
{
System.out.println("You are old.");
}
}
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t>0)
   {
    int initialAge=sc.nextInt();
       Solution obj=new Solution(initialAge);
       obj.amIOld();
       obj.yearPasses();
       if (t>1)
       {
       System.out.println();
       }
    t--;
    
   }
    }
}
