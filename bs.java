import java.util.*;
class bs
{
  int arr[][] = new int [3][3];
  public void get()
  {
      Scanner sc = new Scanner(System.in);
      
      int i,j,t;
      for(i=0;i<3;i++)
      {  
          for( j=0;j<3;j++)
          {
              System.out.println("enter array element = ");
              arr[i][j] = sc.nextInt();
            }
        }
      
    }
    
  public void bbss()
  {
      int i,j,k,t;
      for( i=0;i<3;i++)
      {
          for(j=0;j<2;j++)
          {
              for(k=j+1;k<3;k++)
              if( arr[i][j] > arr[i][k])
              {
                  t=arr[i][j];
                  arr[i][j] = arr[i][k];
                  arr[i][k] = t;
                }
            }
        }
    }
    
    public void disp()
    {
        for( int m = 0 ; m<3 ; m++)
      {
          for(int n =0 ;n<3;n++)
           {
             System.out.print(arr[m][n]+"\t");
           }
           System.out.println();
        }
    }
    

    public static void main()
    {
        bs obj = new bs();
        obj.get();
        System.out.println("original matrix");
        obj.disp();
        obj.bbss();   
        System.out.println("\nafter sorting matrix");
        obj.disp();
        
        }
        
    }

                  
          