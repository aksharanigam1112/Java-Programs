
class output
{
int row;
output(int r)
{
row=r;
}
public void bombay(int n)
{
  if(n==0)
   return;
   else
   {
     nine11(n);
     System.out.println();
     bombay(--n);
    }
}

public void nine11(int p)
{
   if(p==0)
   return;
   else
   {
     System.out.print(p);
     nine11(--p);
    }
}
public static void main(int r)
{
  output ob= new output(r);
  ob.bombay(r);
}
}
