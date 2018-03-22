class special
{
 public static void main (int n)
 {
     int p=n,r,f,i,s=0;
     while(p>0)
     {
         r=p%10;
         p/=10;
         f=1;
         for( i=1;i<=r;i++)
           f*=i;
         s+=f;
        }
     if ( s==n)
       System.out.println( "special no:"+n);
       else
       System.out.println( "not special no:"+n);
    }
}

            