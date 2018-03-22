import java.io.*;
class week_day
{
    public static void main()throws IOException
    {
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("\n Enter date = ");
      int dd = Integer.parseInt(sc.readLine());
      System.out.print("\n Enter month no = ");
      int mm = Integer.parseInt(sc.readLine());
      System.out.print("\n Enter year = ");
      int yyyy = Integer.parseInt(sc.readLine());
      //sc.skip("/n");
      System.out.print("\n Enter day on 1st January = ");
      String word = sc.readLine();
      
      
      int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      int i,j,sum=0,rem=0,f=0;
      
      String week[] = {"","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
      
      if(yyyy%4==0)
        arr[2] = 29;
      
      for(i=0;i<mm;i++)
      {
          sum+=arr[i];
        }
      sum+=dd;
      rem = sum%7;
        
      for(i=0;i<8;i++)
       {
         if(word.equalsIgnoreCase(week[i]))
           break;
        }
        
      System.out.println("\n week day on "+dd+"/"+mm+"/"+yyyy);
      
      for(j=i;j<8;j++)
      {
          f++;
          if(f==rem)
           {
               System.out.println("\n"+week[j]);
               break;
            }
          if( f!=rem && j==7) 
            {
                j=1;
                //continue;
            }
        }
    }
}
        
      