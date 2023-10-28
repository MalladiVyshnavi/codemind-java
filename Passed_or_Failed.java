import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        int s=sc.nextInt();
        if(e>34 && m>34 && p>34 && c>34 && s>34)
        {
            System.out.println("PASSED");
        }
        else
        {
            System.out.println("FAILED");
        }
    }
}