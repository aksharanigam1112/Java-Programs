class rearrange
{
 public static void main()
 {
     int arr[][] = { {8,7,9,3},{-2,0,4,5},{1,3,6,-4}};
     int i,j,l=0,s=0,r=0,c=0,t=0,x,y;
     System.out.println(" original matrix");
     for(i=0; i<arr.length ; i++)
     {
         for( j=0;j<arr[i].length ; j++)
         {
             System.out.print(arr[i][j] + "    ");
            }
         System.out.println();
        }
     l=arr[0][0];
         r=0;
         c=0;
      for(i=0; i<arr.length ; i++)
     {
         
         for( j=0;j<arr[i].length ; j++)
         {
             if(arr[i][j] > l)
             {
                 l=arr[i][j];
                 r=i;
                 c=j;
            }
        }
    }
    
    System.out.println("Largest no = " +l);
    System.out.println( "\t row :" + r);
    System.out.println("\t column:"+c);
    
    
    s=arr[0][0];
         r=0;
         c=0; 
      for(i=0; i<arr.length ; i++)
     {
         
         for( j=0;j<arr[i].length ; j++)
         {
             if(arr[i][j] < s)
             {
                 s=arr[i][j];
                 r=i;
                 c=j;
            }
        }
    }
    
    System.out.println("Smallest no = " +s);
    System.out.println( "\t row :" + r);
    System.out.println("\t column:"+c);
    s= arr[0][0];
           r=0;
           c=0;
    for(x=0 ; x<arr.length ; x++)
    {
       for( y=0; y<arr[0].length ; y++)
       {
          s = arr[x][y]; 
          for(i=0; i<arr.length ; i++)
           {
              for( j=1;j<arr[i].length ; j++)
              {
                 if(arr[i][j]<s)
                 {
                     s=arr[i][j];
                     r=i;
                     c=j;
                   }
              }
            }
          t = arr[x][y];
          arr[x][y] = s;
          arr[r][c] = t;
        }
    }
    System.out.println("rearranged matrix");
    for(i=0; i<arr.length ; i++)
    {
        for( j=0 ;j<arr[0].length ;j++)
        {
            System.out.print(arr[i][j]+"     ");
            }
        System.out.println();
    }
 }
}
    
    
    
    
   
    