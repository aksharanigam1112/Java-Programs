class mixer_app
{
 public static void main()
 {
     mixer xyz = new mixer (5);
     mixer abc = new mixer(5);
     mixer klm = new mixer(10);
     System.out.println("enter values for the first array");
     xyz.accept();
     System.out.println("enter values for another array");
     abc.accept();
     klm = abc.mix(xyz);
     klm.display();
    }
}