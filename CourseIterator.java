import java.util.Iterator;

public class CourseIterator implements Iterator<Student>
   {
      private Student [] list;
      int cur = 0;
   
      public CourseIterator(Student [] students)
      { 
         this.list = students;
         this.cur = 0;
      }
      
      @Override
      public boolean hasNext()
      {
         return cur < list.length;
      }
      
      @Override
      public void remove()
      {
         //empty
      }
      
      @Override
      public Student next()
      {
         return list[cur++];
      }
   }//end class CourseIterator