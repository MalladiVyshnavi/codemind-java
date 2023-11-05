import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}