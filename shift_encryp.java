import java.util.*;
class shift_encryp
{
  public static void main()
  {
      Scanner sc = new Scanner (System.in);
      System.out.print("CODED TEXT  :\t");
      String str = sc.nextLine();
      System.out.print("\nSHIFT  :\t");
      int shift = sc.nextInt();
      if(shift>=1 && shift<=26)
      {
          int len,i;
          char ch1,ch2;
          String st="";
          
          for(i=0;i<str.length()-1;i++)
          {
              ch1 = str.charAt(i);
              
              if(ch1==(str.charAt(i+1)))
              {
                   st = st+" ";
                   i++;
                }
              else
                 if(((int)ch1+(shift-1)>90))
                 {
                     len = ((int)ch1 + (shift-1))-26;
                     st = st + (char)len;
                     //len = ((int)ch2 + (shift-1) )-26;
                    // st = st + (char)len;
                    }
                 else
                 {
                     len = (int)ch1+(shift-1);
                     st = st+(char)len;
                     //len = (int)ch2+(shift-1);
                     //st = st+(char)len;
                    }
                }
          System.out.print("DECODED TEXT:\t"+st);
          }
      else
         System.out.print("INVALID SHIFT VALUE");
       }
    }