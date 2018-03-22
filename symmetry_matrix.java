import java.util.*;
class symmetry_matrix
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the array the array size:-  ");
      int m= sc.nextInt();
      if( m<2 || m>10)
      {
          System.out.println("invalid input");
        }
        
      else
      {
          int a[][] = new int[m][m];
          int i,j,f=0,sl=0,sr=0;
          for(i=0;i<m;i++)
          {
              for(j=0;j<m;j++)
              {
                  System.out.print("enter the array element=   ");
                  a[i][j] = sc.nextInt();
                }
            }
            
          System.out.println("original matrix=");
          for(i=0;i<m;i++)
          {
              for(j=0;j<m;j++)
              {
                  System.out.print(a[i][j]+ "     ");
                }
              System.out.println();
            }
            
        
           for(j=0;j<m;j++)
           {
             if( (a[0][j]==a[j][0]))//&& (a[j][1]==a[1][j]))
                   f++;
                }

       
        if(f==m)
           System.out.println("the given matrix is symmetric");
        else
           System.out.println(" the given matrix is not symmetric");
        
      
       for(i=0;i<m;i++)
        {
         for(j=0;j<m;j++)
         {
           if(i==j)
            sl = sl+a[i][j];
           
           if( (i+j)==(m-1))
             sr = sr +a[i][j];
          }
        }
      System.out.println(" The sum of left diagonal = " + sl);
      System.out.println(" The sum of right diagonal = " + sr);
    }
  }
}