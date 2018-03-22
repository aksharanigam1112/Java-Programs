import java.util.*;
class two_digit
{
  public void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no=");
      int n = sc.nextInt();
      int hold =n,r,s=0,p=1;
      
      while(hold!=0)
      {
          r = hold%10;
          s = s+r;
          p = p*r;
          hold/=10;
        }
      if( (s+p) == n)
         System.out.println(" the no "+ " "+ n + " is a special two-digit no.");
      else
         System.out.println(" the no "+ " "+ n + " is not a special two-digit no.");
          
     }
 }

