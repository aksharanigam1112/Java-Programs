import java.util.*;
class sort_diagonals
{
  public static void main()
  {
      Scanner sc = new Scanner (System.in);
      System.out.print(" enter array size =");
      int n = sc.nextInt();
      int arr[][] = new int[n][n];
      int i ,swap , size , p , j , temp,r;
      for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.print( " Enter "  + (i+1) +","+ (j+1) + " th value = " );
               arr[i][j] = sc.nextInt();
            }
        }
      System.out.println("Given array");
      for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.print(arr[i][j]+"     ");
            }
           System.out.println(); 
        }
        
      for(i=0;i<n-1;i++)
      {
          swap = arr[i][i];
          size = i;
          for(j=i+1;j<n;j++)
          {
              if( swap > arr[j][j])
              {
                  swap = arr[j][j];
                  size = j;
                }
            }
          if( size!=i)
          {
              temp = arr[i][i];
              arr[i][i] = arr[size][size];
              arr[size][size] = temp;
            }
        }
      System.out.println(" Leading diagonal is sorted");
      for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.print(arr[i][j]+"    ");
            }
           System.out.println(); 
        }
        
      p=1;
      for( i=0;i<n-1;i++)
      {
          r=0;
          swap = arr[i][n-1-i];
          size = i;
          for(j=i+1;j<n;j++)
          {
              if( p+r==(n-1))
              {
                  if( swap > arr[p][r])
                  {
                      swap = arr[p][r];
                      size = r;
                    }
                }
              r++;  
            }
          if( size !=i)
          {
              temp = arr[i][n-1-i];
              arr[i][n-1-i] = swap;
              swap = temp;
            }
          p++;
        }
        
      System.out.println(" Right diagonal is sorted");
      for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.print(arr[i][j]+"     ");
            }
           System.out.println(); 
        } 
    }
}
      