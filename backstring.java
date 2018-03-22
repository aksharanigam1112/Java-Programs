import java.util.*;
import java.io.*;
class backstring
{
 public static void main()throws IOException
 {
     BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
     int n,i=0 , r,p;
     String str,s;
     System.out.print("enter the no of lines = ");
     n = Integer.parseInt(rd.readLine());
     
     System.out.println(" enter a sentence");
     str = rd.readLine();
     String ar[] = new String[n];
     StringTokenizer st = new StringTokenizer(str , "!,.;:?");
     
     while( st.hasMoreTokens())
     {
         ar[i] = st.nextToken();
         i++;
        }
     
     for( i = n-1 ; i>=0 ; i--)
     {   ar[i]=" "+ar[i];
         r = ar[i].length();
         System.out.println("r = "+ r); 
         while((p=ar[i].lastIndexOf(' ' , r))!=-1)
         {
             s = ar[i].substring(p+1,r);
             System.out.print( s+ " " );
             r=p;
            }
        }
    }
}
         