class diamond
{
 public static void main (int req)
 {
     int l=1,line,sp,k, c=req-1;
     char n='A';
     for(line=1 ; line<=req ; line++)
     {
         for (sp=1;sp<=c;sp++)
            System.out.print(" "+"\t");
         for (k=1;k<=l;k++)
          {
              System.out.print(n+ "\t ");
              n++;
            }
         l+=2;
         c--;
         System.out.println();
     }
 }
}