import java.util.Scanner;
public class Grades
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h,s,v;
        h=sc.nextInt();
        s=sc.nextInt();
        v=sc.nextInt();
        if(h>50 && s>60 && v>100)
    {
        System.out.print("10");
    }
    else if(h>50 && s>60 && v<100)
    {
         System.out.print("9");
    }
    else if(s>60 && v>100)
    {
         System.out.print("8");
    }
    else if(h>50 && v>100)
    {
        System.out.print("7");
    }
    else if(h>50 || s>60 || v>100)
    {
         System.out.print("6");
    }
    else
    {
         System.out.print("5");
    }
    }
}