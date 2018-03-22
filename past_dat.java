import java.util.*;
class past_dat
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      
      System.out.print(" Enter a date = ");
      int dd = sc.nextInt();
      System.out.print("\n Enter month no  = ");
      int mm = sc.nextInt();
      System.out.print("\n Enter year = ");
      int yyyy = sc.nextInt();
      System.out.print("\n Enter no of days  = ");
      int days = sc.nextInt();
      
      int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      int i=0;
      
      if(yyyy%4==0)
        arr[2] = 29;
      
      if( dd-days>0)
        System.out.println("\n PAST DATE :- \t" + (dd-days) + "/"+ mm + "/" + yyyy);
        
      else
      {
       days-=dd;
       mm--;
      if(mm==1)
      {
          mm=12;
          yyyy--;
          if(yyyy%4==0)
             arr[2] = 29;
        }
        
      for(i = mm ;  ; i-- )
      {
        if( i < 1)
         {
          i=12;
          yyyy --;
          if(yyyy%4==0)
            arr[2] = 29;
        }
        
        if(days>arr[i])
        
           days -= arr[i];
          
        else 
        
           break;
        
      }
      System.out.println("\n PAST DATE :- \t" +(arr[i]-days+1) + "/"+ i + "/" + yyyy);
     }
  }
}