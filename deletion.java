import java.util.*;
class deletion
{
 public void cal()
 {
     Scanner sc = new Scanner ( System.in);
     String s, d,w = "";
     int p,r=0,l;
     System.out.println(" Enter a sentence");
     s = sc.nextLine();
     s = s+ " ";
     System.out.println(" Enter the word to be deleated=");
     d = sc.next();
     l = d.length();
     while ((p = s.indexOf(' ' , r))!=-1)
     {
         w = s.substring(r,p);
         if ( d.equalsIgnoreCase(w)!=true)
         {
             System.out.print(w+ " " );
           
            }
              r=p+1;
        }
    }
}
