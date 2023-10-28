import java.util.Scanner;
public class Contest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*1+b*2>=x)
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("Not Qualify");
        }
    }
}