import java.util.*;
class rec_vow
{
  private String str;
  private int w;
  public void InputString()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter a sentence\t");
      str = sc.nextLine();
    }
    
  private void Counter(int len)
  {
      char ch1,ch2;
      if(len>1)
      {
          ch1 = str.charAt(len-1);
          ch2 = str.charAt(len-2);
          if(ch2==' ' && (ch1=='A' || ch1=='E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'))
               w++;
           Counter(len-1);
        }
    }
    
  public void disp()
  {
      str = " "+str;
      int  k = str.length();
      Counter(k);
      System.out.println("Total no of words beginning with a capital vowel are :- "+w);
    }
}
               