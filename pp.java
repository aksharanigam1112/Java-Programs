class pp
{
 public static void main(int req)
 {
     int k , n , sp;
     char ch;
     for (k =1; k<=req;k++)
     {
         ch = 'A';
         for( sp =1;sp <= req-k;sp++)
         {
             System.out.print(" ");
            }
         for( n =1;n<=k;n++)
         {
             
              System.out.print(" " +ch);
              ch++;
            }
        
     System.out.println();
    }
    
  }
}
