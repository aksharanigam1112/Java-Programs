import java.util.*;
class rotation
{
 public static void main()
 {
     int arr[][] =  { {1,2,3,4},{7,8,6,9},{5,3,2,1},{11,12,5,6}};
     int n = arr.length;
     int i,k;
     int a[] = new int[n];
     System.out.println("the original matrix is");
     for(i=0;i<n;i++)
     {
         for(k=0;k<n;k++)
         {
             System.out.print(arr[i][k]+"\t");
            }
         System.out.println();
        }
        
     k= n-1;
     for(i=0;i<n;i++)
       a[i] = arr[0][i];
       
     for(i=0;i<(n-1);i++)
        arr[0][i] = arr[k--][0];
        
     k=n-1;
     
     for(i=n-1;i>0;i--)
         arr[i][0] = arr[n-1][k--];
     
     k=0;
     for(i=n-1;i>0;i--)
        arr[n-1][k++] = arr[i][n-1];
        
     for(i=0;i<n;i++)
        arr[i][n-1] = a[i];
     System.out.println("rotated matrix is=");   
     for(i=0;i<n;i++)
     {
         for(k=0;k<n;k++)
         {
             System.out.print(arr[i][k]+ "\t");
            }
         System.out.println();
        }
    }
}
         