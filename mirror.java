import java.util.*;
class mirror
{
 public void cal()
 {
     Scanner sc = new Scanner(System.in);
     String st;
     char ch;
     int r=0,p,i;
     System.out.println("Enter a sentence");
     st=sc.nextLine();
     st = st+ " ";
     while((p=st.indexOf(' ' ,r))!=-1)
     {
         for(i=p-1;i>=r;i--)
         {
             ch=st.charAt(i);
             System.out.print(ch);
            }
         System.out.print(" ");
         r=p+1;
        }
    }
}
    