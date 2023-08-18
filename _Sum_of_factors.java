import java.util.Scanner;
public class Fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,sum=0;
        a=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
            sum=sum+i;
            }
        }
        System.out.printf("%d",sum);
    }
}