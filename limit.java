class limit
{
 public static void main(int ll , int ul)
 {
     System.out.println("Prime nos. b/w"+" " + ll + " "+"and"+" "+ ul +" " +"are :-");
     int n,h;
     for (n=ll; n<=ul;n++)
     {
         for (h=2;h<n;h++)
         {
             if(n%h==0)
             break;
            }
            if (n==h)
            System.out.println( n );
        }
    }
}