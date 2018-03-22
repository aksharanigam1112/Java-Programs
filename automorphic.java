class automorphic
{
 public static void main (int n)
 {
     int s,p,c=1;
     p=n;
     s=n*n;
     while ( p>0)
     {
         c=c*10;
         p/=10;
        }
     if( s%c==n)
      System.out.println( "automorphic no ="+n);
      else
      System.out.println( "not automorphic no ="+n);
    }
}
     