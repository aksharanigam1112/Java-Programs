class stud
{
 private int rno;
 private String name;
 private double fees;
 
 public stud()
 {
     rno=-1;
     name="***";
     fees=0.0;
    }
    
 public stud ( int r, String n, double f)
 {
     rno=r;
     name=n;
     fees=f;
    }
    
 public stud( int rno , String nm)
 {
     this.rno = rno;
     name=nm;
     fees =0;
    }
 
 public stud( stud obj)
 {
     this.rno = obj.rno;
     name = obj.name;
     this.fees = obj.fees;
    }
    
 public void show()
 {
     System.out.println("roll no ="+rno);
     System.out.println(" name = "+name);
     System.out.println(" fees = "+fees);
    }
 

}

     
