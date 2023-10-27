import java.util.Scanner;
public class MeasuringObject
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(w==x || w==y || w==z || w==x+y || w==y+z || w==z+x || w==x+y+z)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        
    }
}