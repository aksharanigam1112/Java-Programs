class matrix
{
 public static void main()
 {
     int arr[][] = {{ 5,6,7,8},{12,11,10,9},{1,2,3,4},{16,15,14,13}};
     int i,j,s=0,p,h=0,k;
     
     for(i=0 ; i<arr.length ;i++)
     {
         s = arr[i][0];
         p=0;
         
         for( j=1 ; j<arr[0].length ; j++)
         {
             if(arr[i][j] < s)
               {
                   s=arr[i][j];
                   p = j;
                }
            }
         for(k=0 ; k<arr.length ; k++)
         {
             if( s>=arr[k][p])
                h=s;
             else 
               break;
            }
        }
     if(h==s)
       System.out.println("the element "+ h +" is a saddle point");
    }
}