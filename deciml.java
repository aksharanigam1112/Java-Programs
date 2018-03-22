import java.util.*;
class deciml
{
  public void main()
  {
   Scanner sc = new Scanner(System.in);
   System.out.print(" enter a number = ");
   int n = sc.nextInt();
   int ans =  d2b(n);
   System.out.println( " the conversion is = " + ans ); 
 }
 
 private static int k = 0;
 int d2b ( int num )
 {
     int rem;
     if( num == 0)
       return 0;
       
     rem = num %2;
     return  rem * (int) ( Math.pow( 10,k++)) + d2b ( num/2);
    }
}