class in_out
{
 public static void main()
   {
     time ob1=new time();
     time ob2=new time();
     time ob3=new time();
     ob1.accept();
     ob2.accept();
    System.out.println("show value of object one");   
    ob1.show();
        System.out.println("show value of object two");
      ob2.show();
      ob3=ob2.diff(ob1);
     System.out.println("show value of diffrent object ");
     ob3.show();
    }
}