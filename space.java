class space
{
 public static void main(int req)
 {
     int k,sp,n;
     for(k=1;k<=req;k++)
     {
         for(sp=req-k;sp>0;sp--)
         {
             System.out.print("\t"+" ");
            }
            for(n=1;n<=k;n++)
            {
               System.out.print("\t"+n);
            }
            System.out.println();
        }
    }
}
     