
package ödev1;

public class main {

    public static void main(String[] args) {
        
       Course course1 = new Course();
       course1.name ="Programlamaya Giriş için Temel Kurs";
       course1.educator="Engin Demiroğ";
       course1.CampProgram="7 konu";
       course1.completed=100;
       
       Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı(C#+ANGULAR)","Engin Demiroğ","16 derslik kamp",60);
       Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı(JAVA+REACT)","Engin Demiroğ","16 derslik kamp",10);
       
       Course[] cours = {course1,course2};
       
       for(Course course : cours ){
           System.out.println(course.name);
       }
       
       Category category = new Category();
       category.id=65465331;
       category.name="Programlama";
       
       CourseManager coursemanager = new CourseManager();
       coursemanager.addCourse(course3);
       coursemanager.deleteCourse(course1);
       
    }
    
}
