import java.util.Scanner;
public class Car {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        double x1,x2,y1,y2;
        x1=sc.nextDouble();
        x2=sc.nextDouble();
        y1=sc.nextDouble();
        y2=sc.nextDouble();
        if((y1/x1)>(y2/x2))
        {
            System.out.println("1");
        }
        else if((y1/x1)==(y2/x2))
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("-1");
        }
        }
    }
    
}
