class sentence
{
 public static void main (String s)
 {
     char ch;
     int i,l;
     l=s.length();
     for(i=l-1;i>=0;i--)
     {
         ch = s.charAt(i);
         System.out.print(ch);
        }
    }
}

   