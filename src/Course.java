import java.awt.*;
import java.util.ArrayList;

public class Course {
    private  int crsID;
    private String crsName;
    private  int fees;

    private  ArrayList<Student> studentList;


    public ArrayList<Batch> batchList;
    //----------------------------------------


    public Course(int crsID, String crsName, int fees) {
        this.crsID = crsID;
        this.crsName = crsName;
        this.fees = fees;
    }

    //Courses....
    public Course() {
        batchList = new ArrayList<>();
        studentList=new ArrayList<>();
    }
    //-----------------------
    void addBatch(Batch b){
        batchList.add(b);
    }
    public ArrayList<Batch> getBatchList(){
        return batchList;
    }

    //---------------------------
    void addStudentList(Student student){
        studentList.add(student);
    }

    ArrayList<Student> getStudentList(){
        return studentList;
    }

    //--------------------------------------------
    public int getCrsID() {
        return crsID;
    }

    public void setCrsID(int crsID) {
        this.crsID = crsID;
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
