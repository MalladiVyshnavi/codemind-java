import java.util.Scanner;
public class Matrix
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
;            }
        }
        int evenSum=0;
        int oddSum=0;
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]%2==0)
                {
                    evenSum+=arr[i][j];
                }
                else
                {
                    oddSum+=arr[i][j];
                }
;            }
        }
        System.out.print(evenSum +" ");
        System.out.print(oddSum+" ");
        
    }
}