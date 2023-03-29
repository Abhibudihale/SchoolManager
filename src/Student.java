import java.util.ArrayList;

public class Student {
    private  int stdID;
    private  String stdName;

    private Course stdCourse;

    private  Batch stdBatch;




    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public  Batch getStdBatch(){
        return stdBatch;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void addEnrollStu(Course course,Batch batch) {
        course.addStudentList(this);
        stdCourse=course;
        stdBatch=batch;
    }

    public  void getStdDetails(){
        System.out.println("--------------------------");
        System.out.println("Student Name:"+this.stdName);
        System.out.println("Student  course:"+this.stdCourse.getCrsName());
        System.out.println("Student brach :"+this.stdBatch.getBtcName());
        System.out.println("--------------------------");
    }





}
