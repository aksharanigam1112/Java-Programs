import java.util.*;
class binary_decimal
{
  int  l1,l2,c;
   
  public int input()
  {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      return m;
    }
    
  public int dec_bin(int n)
  {
      int b=0,r;
      
      while(n>0)
      {
          r = n%2;
          n/=2;
          b+= r*(int)(Math.pow(10,c++));
        }
      return b;
    }
    
  public String bin_add(int rev1,int rev2)
  {
      int sum=0,carry=0,x=0,y=0;
      String s="";
      
      
      while( l1>0 && l2>0)
      {
        x = x=rev1%10;
        y=rev2%10;
        
        rev1/=10;
        rev2/=10;
        if( x==0 && y==0 && carry==0)
        {
            sum=0;
            carry=0;
        }
        
          if( x==0 && y==0 && carry==1)
           {
            sum=1;
            carry=0;
          }
        
         if( x==0 && y==1 && carry==1)
          {
            sum=0;
            carry=1;
         }
          if( x==1 && y==0 && carry==1)
          {
            sum=0;
            carry=1;
         }
          if(((x==1 && y==0)||(y==1 && x==0)) && carry==0)
          {
            sum=1;
            carry=0;
         }
        
         if( x==1 && y==1 && carry==1)
         {
            sum=1;
            carry=1;
        }
         if(x==1 && y==1 &&carry == 0)
        {
        sum=0;
        carry =1;
        }
        s = sum+s;
        System.out.print("\n x  =   " + x + " y  = " + y + "  carry = " +carry +" sum = " +sum + " s = "+s);
        l1--;
        l2--;
    }
    
    while(l1>0)
    {
        x = rev1%10;
        rev1/=10;
        
        if(x==0 && carry==0)
        {
            sum=0;
            carry=0;
        }
        if(x==1 && carry==0)
        {
            sum=1;
            carry=0;
        }
        if(x==1 && carry==1)
        {
            sum=0;
            carry=1;
        }
        s = sum+s;
        l1--;
    }
   if(l1<0 && carry==1)
      s=carry+s;
     
    while(l2>0)
    {
        y = rev2%10;
        rev2/=10;
        
        if(y==0 && carry==0)
        {
            sum=0;
            carry=0;
        }
        if(y==1 && carry==0)
        {
            sum=1;
            carry=0;
        }
        if(y==1 && carry==1)
        {
            sum=0;
            carry=1;
        }
        s=sum+s;
        l2--;
    }
    if(l2<=0 && carry==1)
      s=carry+s;  
     
    return s;
 }
 
 public void main(int dec1,int dec2)
 {
     c=0;
     int bin1 = dec_bin(dec1);
     l1 = c;
     System.out.print("\nfirst no = "+dec1+" :- \t "+bin1);
     System.out.print("\nlength of first no = "+l1);
     c=0;
     int bin2 = dec_bin(dec2);
     l2 = c;
     System.out.print("\nSecond no = "+dec2+" :- \t "+bin2);
     System.out.print("\nlength of second no = "+l2);
     String ans = bin_add(bin1,bin2);
     System.out.print("\nBinary addition =\t "+ans);
    }
}
     
