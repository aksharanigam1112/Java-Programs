class mirror_pattern
{
 public static void main()
 {
     char i,j,k,t;
     int n=1 , m=0 , p , sp;
     for( j = 'A' ; j<='E' ; j++)
         {
             System.out.print( j + " ");
             
            }
        for( j ='D' ; j>='A' ; j--)
         {
             System.out.print( j + " ");
             
            }
     System.out.println();
     for( i= 'D' ; i>='A' ; i--)
     {
         for( j = 'A' ; j<=i ; j++)
         {
             System.out.print( j + " ");
             
            }
            
        
                     for( sp = 1 ; sp <=n ; sp++)
             {
                 System.out.print(" ");
                 
                }
                n=n+4;
           
           // t=i;System.out.print("t "+t);
           t=i;
          
                    
         for(k=t ; k>='A' ; k--)
           System.out.print(" "+k);
           
         System.out.println();
         
        }
     n=n-4;
     for( i= 'A' ; i<='E' ; i++)
     {
         for( j = 'A' ; j<=i ; j++)
         {
             System.out.print( j + " ");
            }
         if( i!= 'E')
         {
             for( sp = 1 ; sp <=n ; sp++)
             {
                 System.out.print(" ");
                }
            
            
         for(k = i; k>='A' ; k--)
           System.out.print( " " +k );
           n=n-4;
        }
        else
        {
        t=i;
        --t;
        for(k = t; k>='A' ; k--)
           System.out.print( " " +k );
        }
         System.out.println();
         
        }
    }
}