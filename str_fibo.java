class str_fibo
{
 public static void main(int n)
 {
     String a ="a" , b = "b" , c = "";
     System.out.print( a + " , " + b + " , ");
     int i ;
     for( i=1 ; i<= n-2 ; i++)
     {
         c = b+a;
         a = b;
         b = c;
         System.out.print(c + " , ");
        }
    }
}
     
 