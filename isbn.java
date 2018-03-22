import java.util.*;
class isbn
{
 public void main()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a code");
     int c = sc.nextInt();
     String t = Integer.toString(c);
     if( t.length()!=10)
       System.out.println("illegal isbn");
     else
     {
         int r, i=10 , s=0;
         while(c>0)
         {
             r = c%10;
             s = s + (r*i);
             i--;
             c/=10;
            }
         System.out.println("sum of the code is =" + s);
         if( s%11 ==0)
           System.out.println("legal isbn");
         else
           System.out.println("Illegal isbn");
        }
    }
}
         