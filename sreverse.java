import java.util.*;
class sreverse
{
 public void cal()
 {
     Scanner sc = new Scanner ( System.in );
     System.out.println("enter a sentence :-");
     String St = sc.nextLine();
     String a [] = new String [50];
     St = St+ " ";
     int k,l,m=0,r=0,p,j;
     char ch1,ch2;
     String t="", f = "";
     l = St.length();
     for ( k=0 ; k<l-1 ; k++)
     {
         ch1 = St.charAt(k);
         ch2 = St.charAt(k+1);
         p=k+1;
         if ( ch1 != ' ' && ch2 == ' ')
         {
             t = St.substring(r,p);
             t = t.trim();
             a[m]=t;
             m++;
             r = p+1;
            }
        }
     for(k=0 ; k<m ; k++)
        System.out.println( a[k]);
     for ( k = 0 ; k<m ; k++)
     {
         f="";
         l = a[k].length();
         for(j=l-1 ; j >=0 ;j--)
         {
             System.out.println();
             ch1 = a[k].charAt(j);
             f= f+ch1;
            }
         System.out.println( f);
      }
    }
}
               