import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by hgoscenski on 2/15/17.
 */

public class StudentRegistrationList {


    private LinkedList<Student> srl;

    /**
     * A constructor for the StudentRegistrationList that generates the empty LinkedList that takes Student objects
     */
    public StudentRegistrationList(){
        srl = new LinkedList<Student>();
    }

    public LinkedList<Student> getListAsList(){
        return srl;
    }

    public void addStudent(Student newStudent){
        srl.add(newStudent);
    }

    public void addStudentToFront(Student importantStudent){
        srl.add(0,importantStudent);
    }

    /**
     * @param name takes the last name of a student as an argument and if it matches a name it drops that name
     */
    public void dropStudent(String name){
        Iterator<Student> it = srl.iterator();
        Boolean found = false;
        while(it.hasNext()){
            Student tempStudent = it.next();
            if(name.equalsIgnoreCase(tempStudent.getStudentLName())){
                srl.remove(tempStudent);
                System.out.println(tempStudent.toString() + " was removed.\n");
                found = true;
            }
        }
        if(!found) {
            System.out.println("That name does not seem to be on the registration list.\n");
        }
    }

    public void popStudent(){
        System.out.println(srl.get(0).toString());
        srl.remove(0);
    }

    /**
     * @return returns a toString of the registration list generated with a iterator and a StringBuilder
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registration List: \n");
        Iterator<Student> it = srl.iterator();
        int artificialIndex = 1;
        while (it.hasNext()) {
            Student tempStudent = it.next();
            sb.append(artificialIndex + ". #" + tempStudent.toString() + "\n");
            artificialIndex ++;
        }
        return sb.toString();
    }

}
