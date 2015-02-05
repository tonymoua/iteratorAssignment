public class CourseTester
{
   public static void main(String [] args)
   {
      Student [] students = new Student[3];
      
      students[0] = new Student("Tony", "Moua", 0);
      students[1] = new Student("Lander", "Brandt", 2);
      students[2] = new Student("Sean", "Burright", 3);
      
      Course iteration = new Course(students);
      
      for(Student i : iteration)
      {
         System.out.println(i);
      }
   }
}