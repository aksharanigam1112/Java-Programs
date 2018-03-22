import java.util.*;
class amt_words
{
 public static void main()
 {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter a maximum 7 digit no.\t");
     int num = sc.nextInt();
     String str = String.valueOf(num);
     
     String digit[] = { ""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
     String tens[] = {"",""," Twenty"," Thirty"," Fourty"," Fifty"," Sixty", " Seventy"," Eighty"," Ninety"};
     
     int len = str.length();
     String hold="",fin ="";
     int i=0,j=0,rem=len;
     
     while(len>3)
     {
         if( len%2!=0)
         {
            
             hold = str.substring(i,i+2);
             j = Integer.parseInt(hold);
             if(j>19)
             {
                 if(len==7)
                     fin = fin+tens[j/10]+digit[j%10]+" lakhs";
                 if(len==5)
                     fin = fin+tens[j/10]+digit[j%10]+" thousand";
                    }
                    
              else
              {
                 if(len==7)
                     fin = fin+digit[j]+" lakhs";
                 if(len==5)
                     fin = fin+digit[j]+" thousand";
                    }
              len-=2;
              i+=2;
             }
         
         else
          {
             hold = str.substring(i,i+1);
             j = Integer.parseInt(hold);
             if(len==7)
                     fin = fin+digit[j]+" lakhs";
             if(len==5)
                     fin = fin+digit[j]+" thousand";
             
             len-=1;
             i+=1;
            }
        }
     if( len==3)
        {
        hold = str.substring(rem-len);
        j = Integer.parseInt(hold);
        i = j%100;
        fin = fin+digit[j/100]+" hundred"+tens[i/10]+digit[i%10];
       }
     if( num<10)
      
         fin = fin+digit[num];
        
    
        System.out.println("the given amount "+num+" equivalent is \n"+fin);
    }
}
             
     
     