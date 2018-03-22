import java.util.*;
class ini
{
 public void cal()
 {
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter a name =");
     String n = scn.nextLine();
     n = " "+n;
     int l,p;
     String k ="" , t = "";
     char ch;
     l = n.length();
     p=n.lastIndexOf(' ');
     k = n.substring((p+1),l);
     t = k+t;
     l=p-1;
     while( (p=n.lastIndexOf(' ',l))!=-1)
     {
         k = n.substring((p+1),l);
         ch=k.charAt(0);
         t = ch+"."+t;
         l= p-1;
        }
     System.out.println("new string = "+t);
    }
}
     