import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%2==0 && i%3==0)
            {
                c=c+1;
            }
        }
        System.out.printf("%d ",c);
    }
}