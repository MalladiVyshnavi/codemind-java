import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s1=sc.next();
           int a=Integer.parseInt(s1,8);
           System.out.println(Integer.toBinaryString(a));
        }
    }
}