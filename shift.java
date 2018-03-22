class shift
{ 
 public static void main()
 {
     int arr [] = {9,3,-2,6,-3,-4,5,8};
     int i , l = arr.length ,p,j,r=0;
     for(i=0;i<l;i++)
     {
         if(arr[i]<0)
         {
             p=arr[i];
             for(j=i ; j>r ; j--)
                arr[j]=arr[j-1];
             arr[r] = p;
             r++;
            }
        }
     for(i=0;i<l;i++)
       System.out.print( arr[i] + "  ");
    }
    
}