class bita
{
 public static void main(int req)
 {
     int line,row,sp,ctr;
     for (line=1;line<=req;line++)
     {
         ctr=line%2==0?0:1;
         for(sp=req-line;sp>=1;sp--)
         {
             System.out.print("\t"+" ");
            }
         for(row=1;row<=line;row++)
         {
             System.out.print("\t"+ctr%2);
             ctr++;
            }
         System.out.println();
        }
    }
}