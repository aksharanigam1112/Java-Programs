import java.util.*;
class wondrous_square
{
  public static void main()
  {
      Scanner SC = new Scanner(System.in);
      System.out.print("enter the array size = ");
      int n = SC.nextInt();
      int i,sr=0,sc=0,j,f=0,ctr=0,k=0;
      int arr[][]=new int[n][n];
      
      for(i=0;i<n;i++)                          //input
      {
          for(j=0;j<n;j++)
          {
              System.out.print("enter "+i+","+j+" element:- ");
              arr[i][j] = SC.nextInt();
            }
        }
      
      for(i=0;i<n;i++)                          //check wondrous
      {
         for(j=0;j<n;j++)
         {
              if(arr[i][j]>=1 && arr[i][j]<=(n*n))
                 f++;
            }
        }
      k = (int)(0.5*n*((n*n)+1));    
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              sc = sc +arr[i][j];
              sr = sr +arr[j][i];
            }
          if( sc==sr && sc==k)
             ctr++;
       }
        
      if(ctr==n && f==n*n)
        System.out.println("YES IT IS WONDROUS");
      else
        System.out.println("NOT WONDROUS");
    
        
      int a[] = new int[n*n];
      int r[] = new int[n*n];
      int c[] = new int[n*n];
      
      
      sr=0;
      for(i=0;i<n;i++)                             //prime
      {
          for(j=0;j<n;j++)
          {    
              f=0;
              for(k=1;k<=arr[i][j];k++)
              {
                  if(arr[i][j]%k==0)
                     f++;
                    }
              if(f==2)
              {
                  a[sr] = arr[i][j];
                  //System.out.println("a[sr] = " +a[sr]);
                  r[sr] = i;
                  //System.out.println("r[sr] = "+r[sr]);
                  c[sr] = j;
                  //System.out.println("c[sr] = "+c[sr]);
                  sr++;
                  
                }
            }
        }
      ctr = sr;
      
      for(i=1;i<ctr;i++)                            //bubble sort
      {
        for(j=0;j<ctr-i;j++)
         {
             if(a[j]>a[j+1])
             {
                 sc = a[j];
                 a[j] = a[j+1];
                 a[j+1] = sc ;
                 sr = r[j];
                 r[j] = r[j+1];
                 r[j+1]= sr;
                 sr = c[j];
                 c[j]=c[j+1];
                 c[j+1] = sr;
                }
             //System.out.println( a[j] + r[j] +c[j]);
            }
        }
        
      System.out.println( " PRIME ROW INDEX COLUMN INDEX");
      for(i=0;i<=ctr;i++)                                    //printing
      {
          System.out.println(" " +a[i]+"\t"+r[i]+"\t"+c[i]);
        }
      
    }
}