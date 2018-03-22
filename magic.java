class magic
{
 public static void main (int n)
 {
     int s,r,p=n;
     do
     {
         s=0;
         while(n>0)
         {
             r=n%10;
             n/=10;
             s+=r;
            }
         if (s>9)
         n=s;
        }while(n>9);
        if (s==1)
         System.out.println( " magic no :" +p);
         else
         System.out.println( " not magic no :" +p);
        }
        }
       