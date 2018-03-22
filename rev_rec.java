import java.util.*;
class rev_rec
{
  public void main()
  {
   Scanner sc = new Scanner(System.in);
   System.out.print(" enter a string = ");
   String st = sc.nextLine();
   String ans =  reverse( st);
   System.out.println( ans);
 }
 public static int k = 0;
 
 String reverse( String str)
 { 
     if( k==str.length())
        return"";
     k++;
     return reverse( str) + str.charAt(--k);
    }
}
     