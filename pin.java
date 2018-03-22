class pin
{
 public static void  main()
 {
     int i , j , n , k , l ;
     
     for( i =1 ;i<=5 ;i++)
     {
         n=i;
         if(n==1)
         { 
             for(j=1;j<=5 ; j++)
             {
                 System.out.print(j + " ");
                }
         }
         else
         {
             for( k=1 ;k<=n ; k++)
                System.out.print(n+ " ");
             for( l=1 ;l <= 5-n ;l++)
             {
                 System.out.print(k+" ");
                 k++;
                }
            }
         System.out.println();
        }
    }
}