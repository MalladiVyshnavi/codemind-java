import java.util.Scanner;
public class Star
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,j;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}