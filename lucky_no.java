import java.util.*;
class lucky_no
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Enter a number:- ");
      int n = sc.nextInt();
      
      int arr[] = new int[n];
      int i , g=2, k=0,hold=n;
      
     for(i=0;i<n;i++)
     {
          arr[i] = i+1;
       }
      
      while( g<n)
      {
          
        for(i=0;i<n;i++)
        {
          if( (i+1)%g !=0)
          {
              arr[k] = arr[i];
              k++;
            }
        }
        n=k;
        g++;
        k=0;
     }
     System.out.println("\n Lucky nos less than "+ hold);
     for(i=0;i<n-1;i++)
     {
        System.out.print(arr[i] + "   ");
     }
  }
}
            
            
            
            
            
            
            
