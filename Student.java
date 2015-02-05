public class Student
{
   private String fname;
   private String lname;
   private int ID; 
   
   public Student(String fname, String lname, int ID)
   {
      this.fname = fname;
      this.lname = lname;
      this.ID = ID;
   }
   
   @Override
   public String toString()
   {
      return fname + " " + lname + ", " + ID;
   }
}//end class