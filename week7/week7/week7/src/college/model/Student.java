package college.model;
import college.util.TextUtils;
public class Student extends Person {

    private String name;
    private int mark;

    public Student(String name) {
        this.name=TextUtils.normalizeName(name);
    }

    public void describeRole() {
        System.out.println("I am a Student");
    }

    public void submitAssignment() {
        System.out.println("Student submitted assignment");
    }

    public void setMark(int mark) throws InvalidStudentDataException {
        if(mark<0||mark>100) {
            throw new InvalidStudentDataException("Mark must be between 0 and 100");
        }
        this.mark=mark;
    }

    public String toString() {
        return "Student{name='"+name+"', mark="+mark+"}";
    }
    public static Student fromText(String name,String markText) throws InvalidStudentDataException {
    int mark=Integer.parseInt(markText);
    Student student=new Student(name);
    student.setMark(mark);
    return student;
}
}