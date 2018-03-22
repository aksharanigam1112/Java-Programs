import java.util.*;
class time_words
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      String ch[] = {""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen",""," Sixteen"," Seventeen"," Eighteen"," Nineteen"," Twenty"};
      String ch2[] = { " o'clock" , " Quarter Past"," Half Past" , " Quarter To"};
      String st="", time ;
      int hh , mm ,r;
      boolean t = true;
      do
      {
          System.out.print(" Enter time in 12 hour format hh:mm = ");
          time = sc.nextLine();
          r = time.indexOf(":");
          hh = Integer.parseInt( time.substring(0,r));
          mm = Integer.parseInt( time.substring(r+1));
          
          if( hh>0 && hh<=12 && mm >=0 && mm<60)
          {
              if(mm <30 && mm!=15 && mm!=0)
              {
                  if( mm>19)
                     st = st + ch[20] + ch[mm%10] + " Minutes Past" + ch[hh];
                  else
                     st = st + ch[mm] + " Minutes Past" + ch[hh];
                    }
                    
              if( mm ==15)
                st = st + ch2[1] + ch[hh];
              if( mm == 30)
                st = st + ch2[2] + ch[hh];
              if (mm == 0 )
                st = st + ch[hh] + ch2[0];
                
              if( mm > 30)
              {
                  mm = 60 - mm;
                  hh++;
                  if( hh>12)
                    hh =1;
                  if( mm==15)
                    st = st + ch2[3]+ ch[hh];
                  else
                    if( mm>19)
                       st = st+ ch[20] + ch[mm%10] + " Minutes To" + ch[hh];
                    else
                       if( mm<19)
                         st = st + ch[mm] + " Minutes To" + ch[hh];
                        }
                    System.out.println(" equivalent time= " + time + "\n" + st);
                     t = false;
                    }
            
          else
          
              System.out.println(" invalid time \n renter time = ");
          
            }while(t);
        }
    }
    