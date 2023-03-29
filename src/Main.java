import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class Main {

    //Global Variables
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Course> crsList = new ArrayList<>();


    public static void main(String[] args) {
        boolean flag=true;
        while(flag){

                System.out.println("----------------------------------------");
                System.out.println("1. Register Course..");
                System.out.println("2. Register Batch   ");
                System.out.println("3. Register Student ");
                System.out.println("4. Display Course List");
                System.out.println("5. Display batch List");
                System.out.println("6. Get Student List by Course");
                System.out.println("7. Search Student by ID");
                System.out.println("8. exit");

                System.out.println("----------------------------------------");
                System.out.println("Enter your Choice......");
                int choice = sc.nextInt();

                switch (choice){

                    case 1:
                            addCourse();
                            break;
                    case 2:
                            addBatch();
                            break;

                    case 3:
                            addStudent();
                            break;
                    case 4:
                            disCourseList();
                            break;
                    case 5:
                            disBatchList();
                            break;
                    case 6:
                            getStudentList();
                            break;
                    case 7:
                           // getStdDetails();
                            break;
                    case 8:
                            flag=false;
                            break;
                    default:
                        System.out.println("Enter Correct Choices..");

                }



        }

        }

    private static void getStudentList() {
        System.out.println("For Which  course do you want to Student List...");
        for(int i=0;i<crsList.size();i++)
        {
            Course c = crsList.get(i);
            System.out.print(i+" ");
            System.out.println(c.getCrsName());
        }
        int choice=sc.nextInt();

        Course stdCourse = crsList.get(choice);
        ArrayList<Student>stdList = stdCourse.getStudentList();
        System.out.println("-------------------------------------------");
        for(int i=0;i<stdList.size();i++){
            Student sTemp = stdList.get(i);
            Batch bTemp = sTemp.getStdBatch();
            System.out.println(sTemp.getStdID()+"  "+sTemp.getStdName() +" "+bTemp.getBtcName());
        }
        System.out.println("-------------------------------------------");



    }

    private static void addStudent() {
        Student student = new Student();
        System.out.println("welcome to Adhayana training institude........");
        System.out.println("Create Your Id No.. ");
        student.setStdID(sc.nextInt());
        System.out.println("Enter Your Name ..");
        student.setStdName(sc.next());
        System.out.println("For Which  course do you want to register...");
        for(int i=0;i<crsList.size();i++)
        {
            Course c = crsList.get(i);
            System.out.print(i+" ");
            System.out.println(c.getCrsName());
        }
        int choice=sc.nextInt();

        Course stdCourse = crsList.get(choice);

        System.out.println("For Which Batch you want to register...");
        ArrayList<Batch> btemp = stdCourse.getBatchList();
        for(int i=0;i<btemp.size();i++){
            Batch tempName = btemp.get(i);
            System.out.print(i+" ");
            System.out.println(tempName.getBtcID()+" "+tempName.getBtcName());
        }
        System.out.println("Enter code to join Batch...");
        int choice2=sc.nextInt();
        Batch stdBatch = btemp.get(choice2);

      student.addEnrollStu(stdCourse,stdBatch);
      student.getStdDetails();


    }

    private static void disBatchList() {
        System.out.println("for which course:");
        //System.out.println("* to which Couser do you want to add Batch..");
        for(int i=0;i<crsList.size();i++)
        {
            Course c = crsList.get(i);
            System.out.print(i+" ");
            System.out.println(c.getCrsName());
        }
        int choice=sc.nextInt();

        Course c2 = crsList.get(choice);
        ArrayList<Batch> temp = c2.getBatchList();
        for(int i=0;i<temp.size();i++){
            Batch btemp = temp.get(i);
            System.out.println(btemp.getBtcID()+"  "+btemp.getBtcName());
        }
        System.out.println("----------------------------------");

    }

    private static void addBatch() {




        Batch batch = new Batch();
        System.out.println("Enter Batch Code..");
        batch.setBtcID(sc.nextInt());
        System.out.println("Enter Batch Name..");
        batch.setBtcName(sc.next());
        System.out.println("Mode of batch: 1) Online 2) Offline ");
        batch.setBtcMode(sc.nextInt());

        System.out.println("* to which Couser do you want to add Batch..");
        for(int i=0;i<crsList.size();i++)
        {
            Course c = crsList.get(i);
            System.out.print(i+" ");
            System.out.println(c.getCrsName());
        }
        int choice=sc.nextInt();

        Course c2 = crsList.get(choice);
        c2.addBatch(batch);

    }

    private static void disCourseList() {

        System.out.println("----------------------");
        int size=crsList.size();
        for(int i=0;i<size;i++)
        {
            Course s = crsList.get(i);
            System.out.println(s.getCrsName());
        }
        System.out.println("----------------------");

    }

    private static void addCourse() {

        Course course=new Course();
        System.out.println("Enter Course ID");
        course.setCrsID(sc.nextInt());
        System.out.println("Enter Course Name");
        course.setCrsName(sc.next());
        System.out.println("Enter Course Fees");
        course.setFees(sc.nextInt());

        crsList.add(course);


    }

}