class bin
{
 public static void main()
 {
     int arr[] = {17,26,48,69,83,99,107};
     int beg = 0 , mid =-1 , end  = arr.length-1;
     int s = 99;
     while( beg<=end)
     {
         mid =( beg + end )/2;
         if( arr[mid] == s)
               break;
         if( s > arr[mid] ) 
            beg = mid+1;
         else
            end = mid-1;
        }
     if(beg > end)
       System.out.println("search element "+ s +" not found");
     else
       System.out.println("search element " + s+ " found at " + (mid+1) + " th position");
    }
}