import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int h=t/60;
        int m=t%60;
        System.out.println(h + " Hour(s) " + m + " Minute(s)");
    }
}