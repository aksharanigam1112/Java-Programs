import java.util.*;
class starting
{
 public void cal()
 {
     Scanner sc = new Scanner (System.in);
     String st,k = "AEIOUaeiou";
     int l,p=0,r=0;
     char ch;
     System.out.println("Enter a sentence");
     st= sc.nextLine();
     l=st.length();
     while ( (p = st.indexOf(' ',r))!=-1)
     {
         ch = st.charAt(r);
         if( k.indexOf(ch)!=-1)
            System.out.print(st.substring(r,p)+ "  ");
         r=p+1;
        }
    }
}
   