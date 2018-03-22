import java.util.*;
class decryption
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the encrypted code = ");
      String str = sc.nextLine();
      int i,rem;
      String s="", fin="";
      
      for(i=0;i<str.length()-1;i++)
      {
        s = str.substring(i,i+2);
        rem = Integer.parseInt(s);
        if( (rem>=65 && rem<=90) || (rem>=97 && rem<=99 ) || (rem>=48 && rem<=57 ) || rem==32)
        {
          fin = fin + (char)rem;
          i+=1;
        }

        if( rem >=10 && rem<=12 )
        {
         s = str.substring(i,i+3);
         rem = Integer.parseInt(s);
         if(rem>=100 && rem<=122)
         {
          fin = fin + (char)rem;
          i+=2;
        }
       }
    }
    System.out.println(" decrypted code = " + fin);
  }
 }
