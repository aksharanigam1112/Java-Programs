import java.util.*;
class sep_vow
{
  public static void main()
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a paragraph of max 10 sentences:-");
      String para = sc.nextLine();
      
      StringTokenizer obj = new StringTokenizer(para,"!,.?");
      int len = obj.countTokens();
      String st[] = new String[len];
      String arr[] = new String[20];
       
      
      String word="",v="AEIOUaeiou",temp="",vow="";
      int i,j,k,p,r=0,l=0;
      char ch;
      
      for(i=0;i<len;i++)
      {
          st[i] = obj.nextToken();
          //System.out.println("st[i] = " + st[i]);
        }
        
      for(i=0;i<len;i++)
      {
          l=0;
          st[i] = st[i]+" ";
          r=0;
          while( (p=st[i].indexOf(' ',r))>=0)
          {
              word = st[i].substring(r,p);
              System.out.println("\n word = "+word);
              
              ch = word.charAt(r);
              if( v.indexOf(ch)>=0)
                 vow = vow+word+" , ";
                 
              arr[l++] = word;
              r=p+1;
              word ="";
              //System.out.print("\n\tvow = "+vow);
              //System.out.print("\n\tarr[l] = "+arr[l-1]);
            }
          
          for( j=0;j<l;j++)
          {
              for(k=0;k<l-(j+1);k++)
              {
                  if( arr[k].compareTo(arr[k+1])>0)
                  {
                      temp = arr[k];
                      arr[k] = arr[k+1];
                      arr[k+1] = temp;
                    }
                  //System.out.println("arr[k] = "+arr[k]);  
                }
              //System.out.println("\n\tarr[j] = "+arr[j]);  
            }
            
          System.out.println("\n\tSorted sentance=");
          for(j=0;j<l;j++)
          {
              System.out.print(arr[j]+" ");
            }
        }
      
      //System.out.println("Final Sentance ="+fin);
      
      System.out.println("\n vowel words="+vow);
        }
    }

      