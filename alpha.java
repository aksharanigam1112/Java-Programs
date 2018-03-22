class alpha
{
 public static void main()
 {
     int j ;
     char ch , i ;
     String st = "COMPUTER";
     for( i = 'A' ; i<='Z' ; i++)
     {
         for( j=0 ; j<st.length() ; j++)
         {
             ch = st.charAt(j);
             if ( ch ==i)
               System.out.print(ch);
            }
        }
    }
}