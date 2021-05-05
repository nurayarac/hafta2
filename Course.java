
package ödev1;

public class Course {
    
    public Course(){
        System.out.println("***");
    }
    public Course(String name,String educator,String CampProgram,double completed){
        this();
        this.name=name;
        this.educator=educator;
        this.CampProgram=CampProgram;
        this.completed=completed;
        
    }
   
    String name;
    String educator;
    String CampProgram;
    double completed;

   
}
