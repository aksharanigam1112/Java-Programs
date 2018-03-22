import java.util.*;
class city
{ 
 public static void main()
 {
     Scanner sc = new Scanner (System.in);
     int i , j ,l , p ;
     String c[]={"Delhi","Bangalore","Agra","Mumbai","Calcutta"};
     String t="";
     l = c.length;
     /*for( i =0 ;i<l ; i++)
     {
         for( j=0 ; j<l-(i+1) ; j++)
         {
             if( (c[j].compareTo(c[j+1]))>0)
              {
                  t = c[j];
                  c[j] = c[j+1];
                  c[j+1] =t;
              }
         }
        }
     for(i=0;i<l;i++)
        System.out.print(c[i]+ " , ");*/
     
     for(i=0 ; i<l-1 ; i++)
     {
         t = c[i];
         p=i;
         for(j=i+1 ; j<l ;j++)
         {
             if( (c[j].compareTo(t))>0)
             {
                 t= c[j];
                 p = j ; 
                }
            }
         c[p] = c[i];
         c[i]= t;
        }
     for(i=0 ;i <l;i++)
        System.out.print( c[i] + "\t");
    }
}


                