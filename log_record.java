import java.util.*;
class log_record
{
  private String duration(String t1 , String d1 , String t2 , String d2)
  {
      String d="";
      int h1 , h2 , m1 , m2 , p;
      p = t1.indexOf(":");
      h1 = Integer.parseInt( t1.substring(0,p));
      m1 = Integer.parseInt( t1.substring(p+1));
      p = t2.indexOf(":");
      h2 = Integer.parseInt( t2.substring(0,p));
      m2 = Integer.parseInt( t2.substring(p+1));
      
      if(d1.equals(d2))
          d = d + (h2-h1)+":" + ((m2>m1)? m2-m1 : m1-m2);
          
      if( t1.equals(t2) && (d2.compareTo(d1)>0))
      {
          int x = d2.compareTo(d1);
          d+= (x*24)+":00";
        }
        
      if(  (t1.equals(t2)==false) && (d2.compareTo(d1)==1) )
      {
          h1 = 24-h1;
          int sum=0;
          d+=(h1+h2)+":";
          d+=((m1>m2) ? m1-m2 : m2-m1);
        }
      
      if(d2.compareTo(d1)>1 && (t1.equals(t2)==false))
      {
          int date1 , date2 ,x , sum=0;
          p = d1.indexOf("-");
          date1  = Integer.parseInt( d1.substring(0,p));
          p = d2.indexOf("-");
          date2  = Integer.parseInt( d2.substring(0,p));
          x = date2-date1;
          
          while(x>1)
          {
              sum+=24;
              x--;
            }
          h1 = 24-h1;  
          d+= sum + (h1+h2)+":";
          d+= (m2>m1 ? m2-m1 : m1-m2);
        }
      return d;  
      //System.out.print("Time elapsed:- \t "+d);
    }
  
  public void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Number of Users = ");
      int n = sc.nextInt();
      String data[][] = new String[n][5];
      int i ,j;
      System.out.println(" USER IDEN \t LOGIN TIME \t LOGIN DATE \t LOGOUT TIME \t LOGOUT DATE");
      for(i=0;i<n;i++)
      {
          for(j=0;j<5;j++)
          {
              data[i][j] = sc.nextLine();
            }
        }
        
      String dur[] = new String[n];
      System.out.println(" USER IDEN \t LOGIN TIME & DATE \t LOGOUT TIME & DATE \t DURATION(HR:MIN)");
      
      for(i=0;i<n;i++)
      {
          dur[i] = duration(data[i][1],data[i][2],data[i][3],data[i][4]); 
        }
        
      for(i=0;i<n;i++)
      {
          for(j=0;j<5;j++)
          {
              System.out.print( data[i][j]+"\t\t" );
            }
          System.out.println(dur[i]);  
        }
      int p=1;  
      String l="";
      l = dur[0];
      for(i=1;i<n;i++)
      { 
          if(dur[i].compareTo(l)>0)
           {
               l = dur[i];
               p=i;
            }
        }
      System.out.println("\n The user who logged for longest duration:-");
      System.out.print(data[i][0]+"\t\t"+data[i][1]+"\t\t"+data[i][2]+"\t\t"+data[i][3]+"\t\t"+data[i][4]+"\t\t"+dur[i]);
    }
}
          
        
          