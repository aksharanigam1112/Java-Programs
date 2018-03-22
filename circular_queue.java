class circular_queue
{
 private String data[];
 private int f,r;
 
 circular_queue()
 {
     data = new String[5];
     f=0;
     r=-1;
    }
    
 public void insert(String hold)
 {
     if( r+2==f || f+data.length-1==r)
     {
         System.out.println("Circular queue overflow");
         return;
        }
        
     if( r== data.length-1)
       r=-1;
       
     data[++r] = hold;
    }
    
 public String remove()
 {
     if(r+1==f || f+data.length-1== r)
     {
         System.out.println("Circular queue underflow");
         return null;
        }
     String temp = data[++f];
     if( f==data.length)
        f=0;
      return temp;
    }
}
