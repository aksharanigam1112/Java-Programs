import java.util.*;
class perfect
{
  public void main()
  {
   Scanner sc = new Scanner(System.in);
   System.out.print(" enter a number = ");
   int n = sc.nextInt();
   int ans =  pn( n);
   
   if( ans == n)
     System.out.println(" the no is a perfect no");
   else
     System.out.println(" the no is not a perfect no");
 }
 
 public static int k = 1;
 int pn( int num )
 {
     if( k==num )
        return 0;
     
     if( num % k ==0)
       return (k++) + pn(num);
     else
       return 0 + pn(num);
    }
}
     