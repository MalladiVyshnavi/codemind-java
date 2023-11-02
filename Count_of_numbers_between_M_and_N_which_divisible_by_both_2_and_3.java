import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=m;i<=n;i++)
        {
          if(i%2==0 && i%3==0)
          {
              count++;
          }
        }
        System.out.println(count);
       
    }
}