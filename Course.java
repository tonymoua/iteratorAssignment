import java.util.Iterator;

public class Course implements Iterable<Student>
{
   private Student [] array;
   
   
   
   @Override
   public Iterator<Student>iterator() 
   {
      return new CourseIterator(array);
   } 
     
   public Course(Student [] students)
   {
      this.array = students;
   }
}//end class

