/**
 * Created by hgoscenski on 2/15/17.
 */
public class Student {
    private String studentFName;
    private String studentLName;
    private String studentID;

    /**
     * @param studentFName takes a string of the Student's first name
     * @param studentLName takes a string of the Student's last name
     * @param studentID takes a string of the Student's ID
     */
    public Student(String studentFName, String studentLName, String studentID) {
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentID = studentID;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return studentID + " | " + studentLName + ", " + studentFName;
    }
}
