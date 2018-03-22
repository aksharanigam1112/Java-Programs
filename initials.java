import java.util.*;
class initials
{
 public void cal()
 {
     Scanner sc = new Scanner(  System.in);
     String st , e="" , k="";
     int l,p,r=0,i;
     System.out.println("Enter a name = ");
     st = sc.nextLine();
     l=st.length();
     i=st.lastIndexOf(' ');
     e = st. substring((i+1) , l);
     while( (p=st.indexOf(' ',r))!=-1)
     {
         char ch= st.charAt(r);
         k=k+ch+".";
         r=p+1;
        }
        System.out.println( "1)" + " "+ k + e);
      System.out.println( "2)" +" "+ e +"."+ k);
      System.out.println( "3)"+ k + e.charAt(0));
    /* st=st+" ";r=0;k="";
     while( (p=st.indexOf(' ',r))!=-1)
     {
         char ch= st.charAt(r);
         k=k+ch;
         r=p+1;
        }
     System.out.println( "3)"+" " + k); */  
    }
}
    

