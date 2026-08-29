public class StudentRecord {
    private String name;
    private String studentId;
    private int mark;
    StudentRecord(String name,String studentId,int mark){
        if (name!=null && !name.isEmpty()) {
            this.name = name;
        }
     if (studentId!=null && !studentId.isEmpty()) {
         this.studentId = studentId;
        }
       if(mark>=0 && mark<=100){
        this.mark = mark;
       }
    }

    public String getName(){
        return name;
    }
    public String getstudentId(){
        return studentId;
    }
    public int getmark(){
        return mark;
    }
    boolean setMark(int newMark){
        if(newMark>=0 && newMark<=100){
            this.mark = newMark;
            return true;
        }
        return false;
    }
    boolean hasPassed(){
        if(mark>=40){
            return true;
        }
        return false;
    }
    
    String getClassification() {

    if (mark >= 90 && mark<=100) {
        return "A";
    }
    else if (mark>=80 && mark<90) {
        return "B";
    }
    else if (mark>=70 && mark<80) {
        return "C";
    }
    else if (mark>=60 && mark<70) {
        return "D";
    }
    else if (mark>=40 && mark<60) {
        return "E";
    }
    else {
        return "F";
    }

    }
    @Override
public String toString() {
    return "StudentRecord{name='" + name
         + "', studentId='" + studentId
         + "', mark=" + mark + "}";
}

}
