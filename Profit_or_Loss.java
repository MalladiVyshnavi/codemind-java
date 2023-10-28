import java.util.Scanner;
public class ProfitLoss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        if(cp<sp)
        {
            System.out.println("Profit");
        }
        else if(cp>sp)
        {
            System.out.println("Loss");
        }
        else
        {
            System.out.println("No Profit and No Loss");
        }
    }
}