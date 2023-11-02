import java.util.Scanner;
public class Interest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int area=6*a*a;
        int volume=a*a*a;
        System.out.print("Surface area " + "= " + area + " and " + "Volume " + "= " + volume);
    }
}