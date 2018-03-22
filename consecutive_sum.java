import java.util.*;
class consecutive_sum
{
     public static void main()
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a no. = ");
         int n = sc.nextInt();
         int nn[][];
         if(n%2!=0)
            nn = new int[(n+1)/2][(n+1)/2];
         else
            nn = new int[(n)/2][(n)/2];
            
         int i , j=0 ,k=1,sum=0;
         
         for(i=0;i<nn.length;i++)
         {
             k=i+1;
             
             for(j=0;j<nn.length-i;j++)
             {
                 nn[i][j] = k++;
                }
             
            }
            
           
         
         for(i=0;i<nn.length-1;i++)
         {
             sum=0;
             for(j=0;j<nn.length;j++)
             {
                sum+=nn[i][j];
                if(sum==n)
                {
                    for(k=0;k<=j;k++)
                        System.out.print(nn[i][k]+" , ");
                    break;
                }
            }
            System.out.println();
       }
    }
}