import java.util.*;
class future
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("\n\t DAY NUMBER : ");
      int day =sc.nextInt();
      System.out.print("\n\t MONTH NUMBER : ");
      int mm =sc.nextInt();
      System.out.print("\n\t YEAR : ");
      int yy =sc.nextInt();
      System.out.print("\n\t DAY AFTER : ");
      int n =sc.nextInt();
      
      int m[] ={0,31,28,31,30,31,30,31,31,30,31,30,31};
      String M[] ={"","January","February","March","April","May","June","July","August","September","October","November","December"};
      
      if(yy%4==0)
        m[2] = 29;
        
      int hold=n,p=0;
      
      while(day>m[mm])
      {
          day-=m[mm];
          mm++;
        }
        
      System.out.println(day+"th "+M[mm]+" "+yy);
      
      p=m[mm]-day;
      if(n>p)
      {
          n-=p;
          mm++;
      
      while( mm<=12 && n>m[mm])
      {
          n-=m[mm];
          mm++;
        }
        
      if(mm>12 && n>m[1])
      {
          mm=1;
          yy++;
          if(yy%4==0)
            m[2] =29;
          
          while( n>m[mm])
          {
              n-=m[mm];
              mm++;
            }
        }
      day =n;
      System.out.println(" DAY AFTER "+ hold + " DAYS IS "+day +"th "+M[mm] +" "+yy);  
    }
  

    else
    {
         day +=n;
         
      System.out.println(" DAY AFTER "+ hold + " DAYS IS "+day +"th "+M[mm] +" "+yy);  
    }
  }
}
      

