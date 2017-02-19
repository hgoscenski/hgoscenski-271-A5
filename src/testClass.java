/**
 * Created by hgoscenski on 2/15/17.
 */

import java.util.UUID;

public class testClass {

    public static void main(String args[]) {

//        Creating some generic Student objects for the list
        Student hGoscenski = new Student("Harrison", "Goscenski", "3036653");
        Student jSmith = new Student("John", "Smith", "2456859");
        Student fDoe = new Student("Fred", "Doe", "3492847");
        Student vip = new Student("Very", "Important", "8675309");

//        Creating and instantiating a StudentRegistrationList
        StudentRegistrationList regList = new StudentRegistrationList();

//        Adding some of my sample students to the StudentRegistrationList
        regList.addStudent(hGoscenski);
        regList.addStudent(jSmith);
        regList.addStudent(fDoe);

//        Displays the StudentRegistrationList
        System.out.println(regList.toString());

//        Testing the addToFront method
        regList.addStudentToFront(vip);

//        regList.getListAsList().indexOf();

//        Demonstrating that the addToFront method works
        System.out.println(regList.toString());

//        Testing dropStudent method
        regList.dropStudent("Smith");

//        Testing the popStudent method
        regList.popStudent();

//        Demonstrating that the dropStudent method works
        System.out.println(regList.toString());

//        Using a foreach loop to print the StudentRegistrationList per the assignment spec
        System.out.println("this is printing using a foreach loop");
        System.out.println("Registration List: ");
        for (Student stu:regList.getListAsList()) {
            System.out.println(stu.toString());
        }
        System.out.print("\n");

//        This was simply for curiosities sake about how my computer would behave generating random names
//        In case your curious the answer is that is does fine up to about 1 million random uuid's however 100 million
//        locks it up and actually uses up all the memory. Which was impressive.

//        int i = 0;
//        while(i<1000){
//            String fname = UUID.randomUUID().toString();
//            String lname = UUID.randomUUID().toString();
//            String id = UUID.randomUUID().toString();
//            regList.addStudent(new Student(fname,lname,id));
//            i++;
//        }
//        System.out.println(regList.toString());
//
    }
}
