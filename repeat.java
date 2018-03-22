import java.util.*;
class repeat
{
 public void cal()
 {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a word");
     String st = sc.next();
     
     int l,i;
     char ch,ch2;
     l = st.length();
     for ( i=0; i<l-1 ; i++)
     {
         ch = st.charAt(i);
         ch2 = st.charAt(i+1);
         if ( ch != ch2)
          System.out.print(ch);
          else
          {
            System.out.print(ch);
            i++;
        }
    }
}
}

