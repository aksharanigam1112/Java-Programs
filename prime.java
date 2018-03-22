class prime
{
 public static void main(int req)
 {
     int ctr=0,n,h;
     for(n=2;ctr<req;n++)
     {
         for(h=2;h<n;h++)
         {
             if(n%h==0)
             break;
            }
            if(n==h)
            ctr++;
        }
        System.out.println(req +" "+ "th Prime no.is :"+ --n);
    }
}