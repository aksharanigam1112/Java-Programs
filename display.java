class display
{
 public static void main (int req)
 {
     int line,row,ctr;
     for (line=1;line<=req;line++)
     {
         ctr=line%2==0?0:1;
         for (row=1;row<=line;row++)
         {
             System.out.print("\t"+ctr);
            }
         System.out.println();
        }
    }
}
