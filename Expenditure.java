import java.util.Scanner;
public class Expenditure
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=30;
        if(x>=y*z)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}