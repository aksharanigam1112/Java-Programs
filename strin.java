import java.util.*;
class strin
{
 public void cal()
 {
     Scanner sc = new Scanner ( System.in );
     System.out.println("enter a sentence :-");
     String St = sc.nextLine();
     String a [] = new String [50];
     St = St+ " ";
     int k,l,m=0,r=0,p;
     char ch1,ch2;
     String t="";
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
    }
}
     