package college.app;

import college.model.Person;
import college.model.Student;
import college.model.Instructor;
import college.model.InvalidStudentDataException;

public class Week7Lab {

    public static void main(String[] args) {

        Person[] people={
            new Student("Asha"),
            new Instructor(),
            new Student("Rahul")
        };

        for(Person person:people) {
            person.describeRole();

            if(person instanceof Student student) {
                student.submitAssignment();
            }

            if(person instanceof Instructor instructor) {
                instructor.conductClass();
            }
        }

        System.out.println();

        String[] marks={"85","hello","150"};

        for(String text:marks) {
            try {
                Student student=new Student("  asha   nair ");
                int mark=Integer.parseInt(text);
                student.setMark(mark);
                System.out.println(student);
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid mark: not a number");
            }
            catch(InvalidStudentDataException e) {
                System.out.println("Invalid mark: "+e.getMessage());
            }
            finally {
                System.out.println("Validation attempt complete");
            }
        }

        try {
            Student student=Student.fromText("  rahul   kumar ","85");
            System.out.println(student);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid mark: not a number");
        }
        catch(InvalidStudentDataException e) {
            System.out.println("Invalid mark: "+e.getMessage());
        }
    }
}