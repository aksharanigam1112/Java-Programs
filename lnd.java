class lnd
{
 public static void main(int req)
 {
     int l,i,k;
     char ch;
     for( l = req ;l>0 ;l-=2)
     {
         for( i=1;i<=l ;i++)
         {
             System.out.print(i +"\t");
            }
         System.out.println();
         ch = 'A';
         for( k=1; k<l;k++)
         {
             System.out.print(ch+"\t");
             ch++;
            }
         System.out.println();
        }
    }
    }