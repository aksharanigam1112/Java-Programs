class rev
{
 public static void main()
 {
  int arr[] = { 5,-4,3,-2,6,-11,12,-7,9,-5};
  int i , n , j,r=0;
  for( i=0 ; i<arr.length ; i++)
  {    
      if(arr[i]>0)
      { 
       n=arr[i];
       for(j =i ; j>r ; j--)
          arr[j]=arr[j-1];
       arr[r]=n;
       r++;
      }
  }
  for( i=0 ; i<arr.length ; i++)
    System.out.print(arr[i]+ "   ");
 }
}
