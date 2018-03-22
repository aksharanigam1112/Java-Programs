class gcd
{
 public static void main ( int x,int y)
 {
     int a,b,r;
     if( x>y)
     {
       a=x;
       b=y;
    }
    else
    {
        a=y;
        b=x;
    }
    while(a%b!=0)
    {
        r=a%b;
        a=b;
        b=r;
    }
    System.out.println(" greatest common divisor of the two nos is =" +b);
}
}

   
     