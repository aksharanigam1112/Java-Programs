class hcf
{
  public static void main (int x, int y)
  {
    int l,a,i,h=0;
    if (x>y)
     a=x;
     else 
     a=y;
    for (i=1;i<=a;i++)
    {
        if ( x%i==0 && y%i==0)
        h=i;
    }
    l = x * y / h;
    System.out.println( " HCF of the two nos="+h);
    System.out.println( " LCM of the two nos="+l);
  }
}

      