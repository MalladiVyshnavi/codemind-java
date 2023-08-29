import java.util.Scanner;
public class Series
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        float sum=0;
        while(i<=n)
        {
            sum+=(1.0/i);
            i++;
        }
        System.out.printf("%.2f",sum);
    }
}