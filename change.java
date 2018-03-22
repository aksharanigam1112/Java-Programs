import java.util.*;
class change
{
 public void cal()
 {
     Scanner sc= new Scanner(System.in);
     String st="aeiou";
     String str , cstr = "";
     int l,i,p;
     char ch;
     System.out.println("Enter a sentence");
     str=sc.nextLine();
     str=str.toLowerCase();
     l=str.length();
     for ( i=0 ; i<l ; i++)
     {
         ch=str.charAt(i);
         p=st.indexOf(ch);
         if(p!=-1)
         {
             if(p==4)
              p=0;
             else
             p = p+1;
             ch=st.charAt(p);
            }
         cstr = cstr + ch;
        }
     System.out.print(cstr);
    }
}
            
             