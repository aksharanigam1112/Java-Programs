import java.util.*;
class encode_decode
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("input encoded text:-\t");
      String st = sc.nextLine();
      char ch=' ';
      String str ="" , s="";
      int i,c=0,p,n=st.length();
      
      for( i=0;i<=n-2;i+=2)
      {
          s = st.substring(i,i+2);
          p = Integer.parseInt(s);
          
          if( (p>=65&&p<=90)||(p>=97&&p<=99))
          {
              ch = (char)p;
              if(c==0)
              {
                ch = Character.toUpperCase(ch);
                c++;
               }
              else
                 ch = Character.toLowerCase(ch);
             }
                
          else
             if( p ==32)
              {
                  ch = ' ';
                  c=0;
                }
               else 
                  if(p>=48 &&p<=57)
                    ch='\u0000';
                  else 
                   {
                     s = st.substring(i,i+3);
                     p = Integer.parseInt(s);
                  
                     ch= (char)p;
                  
                       if( c==0)
                        {
                        ch = Character.toUpperCase(ch);
                        c++;
                        }
                       else
                  
                         ch = Character.toLowerCase(ch);
                        i++;
                     }
                      
          str = str+ch;
        }
        System.out.print( "output decoded text:-\t" + str);
    }
  }
