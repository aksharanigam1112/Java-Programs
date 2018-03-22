import java.util.*;
class uword
{
 public static void main()
 {
   Scanner sc =new Scanner(System.in);
   System.out.println( "HONESTY IS THE BEST POLICY");
   System.out.println( " 1 ....... for first alphabet");
   System.out.println( " 2 ....... for last alphabet");
   String str = "HONESTY IS THE BEST POLICY";
   str = str + " ";
   System.out.println("enter your choice =");
   int n = sc.nextInt();
   switch ( n )
   {
     case 1 :
          int p,r=0;
          String k="" , l="";
          char ch;
          while((p = str.indexOf (' ' ,r))!=-1)
          {
              k = str.substring(r,p);
              ch = k.charAt(0);
              l = l+ch;
              r = p+1;
            }
          System.out.println("shortform:-  " + l);
          break;
          
     case 2 :
          int len ,pn,rn=0;
          String ka="" , la="";
          char chn;
          while((pn = str.indexOf (' ' ,rn))!=-1)
          {
              ka = str.substring(rn,pn);
              len = ka.length();
              chn = ka.charAt(len-1);
              la= la+chn;
              rn = pn+1;
            }
          System.out.println("shortform:-  " + la);
          break;
      }
  }
}