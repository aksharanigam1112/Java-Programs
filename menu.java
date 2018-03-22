import java.util.*;
class menu
{
 public void cal()
 {
     int n,ch;
     Scanner sc = new Scanner ( System.in);
     System.out.println( " 1 for Perfect number");
     System.out.println( " 2 for Armstrong number");
     System.out.println( " 3 for Prime number");
     System.out.println( " Enter your choice");
     ch = sc.nextInt();
     System.out.println( " Enter a number ");
     n = sc.nextInt();
     switch(ch)
     {
         case 1:
           int p,sum=0;
           for (p=1;p<n;p++)
           {
              if (n%p==0)
              sum+=p;
            }
           if( n==sum)
              System.out.println( " It is a perfect number");
           else
           System.out.println( " It is not perfect number");
           break;
         
         case 2:
           int h=n,r,s=0,c;
           while( h>0)
           {
               r=h%10;
               c= r*r*r;
               s+=c;
               h=h/10;
              
            }
          
           if (n==s)
             System.out.println( " It is armstrong number");
            else
            System.out.println( " It is not armstrong number");
           break;
           
         case 3:
           int i,f=0;
           for ( i=1;i<=n;i++)
           {
               if ( n%i==0)
                f++;
            }
           if (f==2)
              System.out.println( " It is prime number");
           else 
            System.out.println( " It is not prime number");
           break;
        }
    }
}
              
     