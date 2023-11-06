import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        double total=p+c+b+m+s;
        double per=(total/5);
        if(per>=90)
        {
            System.out.println("Grade A");
        }
        else if(per>=80)
        {
            System.out.println("Grade B");
        }
        else if(per>=70)
        {
            System.out.println("Grade C");
        }
        else if(per>=60)
        {
            System.out.println("Grade D");
        }
        else if(per>=40)
        {
            System.out.println("Grade E");
        }
        else if(per<40)
        {
            System.out.println("Grade F");
        }
    }
}