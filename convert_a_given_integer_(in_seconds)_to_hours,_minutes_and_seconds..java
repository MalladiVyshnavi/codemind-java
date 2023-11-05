import java.util.Scanner;
public class Time
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int h=s/3600;
        int m=(s%3600)/60;
        s=s%60;
        System.out.println("H" + ":" + "M" + ":" + "S" + "-" + h + ":" + m + ":" + s);
    }
}