import java.util.*;
public class sumMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sumEvenRows=0;
        int sumOddRows=0;
        for(int i=0;i<n;i++)
        {
            int rowSum=0;
            for(int j=0;j<m;j++)
            {
                rowSum+=arr[i][j];
            }
            if(i%2==0)
            {
                sumEvenRows+=rowSum;
            }
            else
            {
                sumOddRows+=rowSum;
            }
        }
        System.out.print(sumEvenRows+" ");
        System.out.print(sumOddRows);
    }
}