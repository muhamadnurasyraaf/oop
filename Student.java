public class Student extends Uitm{
    
    int semester;
    String courseCode;

    public Student(){
        super();
        semester = 0;
        courseCode = null;
    }

    public Student(String id,String branch,int age,int sem,String cc){
        super(id,branch,age);
        semester = sem;
        courseCode = cc;
    }
   
    public int getSemester(){
        return semester;
    }
    public String getCourseCode(){
        return courseCode;
    }

   
    public double calcFee(){
        return 745.00;
    }

    public String toString(){
        return super.toString() + "\nSemester : " + semester + "\nCourse Code : " + courseCode + "\n";
    }
}
