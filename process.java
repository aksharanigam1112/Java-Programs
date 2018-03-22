import java.util.*;
class process extends data
{
   int len;
   /*process()
   {
       super();
       len=str.length();
    }*/
   
   public void VowelWords()
    {

       StringTokenizer obj = new StringTokenizer(str);
       len = obj.countTokens();
       String word="",vow="AEIOUaeiou";
       char ch;
       int i,f=0;
       System.out.print("\n");
       for(i=0;i<len;i++)
       {
           word = obj.nextToken();
           ch = word.charAt(0);
           if( vow.indexOf(ch)>=0)
           {
               System.out.print(word + ",");
               f++;
            }
        }
        
       System.out.println("\n\t Number Of Vowel Words = " + f);
    }
}
