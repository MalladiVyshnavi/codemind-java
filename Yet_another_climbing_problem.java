import java.util.Scanner;
public class Climbing
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int i;
       int n=sc.nextInt();
       for(i=0;i<n;i++)
       {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
           if(x%y==0)
           {
               System.out.println(x/y);
           }
           else
           {
               System.out.println((x%y)+(x/y));
           }
       }
    }
}