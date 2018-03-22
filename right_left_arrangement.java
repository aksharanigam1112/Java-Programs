import java.util.*;
class right_left_arrangement
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print( " enter the array size such that it is less than 50 :-  ");
      int n = sc.nextInt();
      int a[] = new int [n];
      int i,j,temp=0,k=0;
      
      for( i=0 ; i<n ;i++)
      {
          System.out.print(" enter integer no " + (i+1)+ " :\t");
          a[i] = sc.nextInt();
        }
        
      System.out.println("given original array:");
      
      for( i=0 ; i<n ;i++)
      {
          System.out.print(a[i]+"\t");
        }
      System.out.println();
      
      for ( i=1;i<n;i++)
       {
          for(j=0;j<n-i;j++)
          {
              if(a[j]<a[j+1])
              {
                  temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                }
            }
        }
        
    System.out.println("Rearranged array:-"); 
      if(n%2!=0)
      {
          for( i=(n-1);i>=0;i-=2)
              System.out.print ( a[i] + "\t");
          
          for( i=1;i<n-1;i+=2)
              System.out.print( a[i] +"\t");
            }
       
      
      else
      {
          
          for( i=n-2;i>=0;i-=2)
             System.out.print(a[i]+"\t");
          
          for(i=1;i<n;i+=2)
             System.out.print(a[i]+"\t");
              
            
    }
  }
}