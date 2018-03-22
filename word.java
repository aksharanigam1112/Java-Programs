class word
{ 
 public static void main()
 {
     String str = "Compact Disk";
     str = str +" ";
     int r = 0,p;
     char ch;
     String k="" , n="";
     while((p = str.indexOf(' ' , r))!=-1)
     {
         k = str.substring(r,p);
         ch = k.charAt(0);
         n = n+ch;
         r=p+1;
        }
     System.out.println("short form ="+n);
    }
}