 class aa
{
public void cal()
{
  int p=recursive(1,0,5);
  System.out.println(p);
  p=recursive(1,1,6);
  System.out.println(p);
}

int recursive(int a, int b, int c)
{
if ((a + b) > c)
return 0;
else
return ((a + b) + recursive(b, a+b,c));
}
}

//(i)   What does the method recursive ( 1, 0, 5) return?                                     