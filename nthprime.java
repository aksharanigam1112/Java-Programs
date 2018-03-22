class nthprime

{
 public static void main (int req)
 {
     int ctr=0,num,hold;
     for(num=2; ; num++)
     {
         for(hold=2;hold<num;hold++)
         {
             if(num%hold==0)
             break;
             }
         if(num==hold)
         {
             ctr++;
             if (ctr==req)
             break;
            }
        }
        System.out.println(req + "prime no is"+num);
    }
}

            
            
            
            