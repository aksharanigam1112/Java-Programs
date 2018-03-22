import java.util.*;
class fut_dat
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
      days--;
      int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
      int i=0;
      
      if(yyyy%4==0)
        arr[2] = 29;
      
      if( dd+days<=arr[mm])
        System.out.println("\n FUTURE DATE :- \t" + (dd+days) + "/"+ mm + "/" + yyyy);
        
      else
      {
       days-=arr[mm]-dd;
       mm++;
      if(mm==12)
      {
          mm=1;
          yyyy++;
          if(yyyy%4==0)
             arr[2] = 29;
        } 
        
       for(i = mm ;  ; i++ )
      {
        if( i > 12)
         {
          i=1;
          yyyy ++;
          if(yyyy%4==0)
            arr[2] = 29;
        }
        
        if(days>arr[i])
        
           days -= arr[i];
          
        else 
        
           break;
        
      }
      System.out.println("\n FUTURE DATE :- \t" + days + "/"+ i + "/" + yyyy);
     }
  }
}