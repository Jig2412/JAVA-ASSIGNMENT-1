public class CourseEnrollment {
    private String CourseCode;
    private  String title;
    private int capacity;
    private int count;

    CourseEnrollment(String CourseCode, String title,int capacity,int count){
        if(capacity>0){
            this.CourseCode = CourseCode;
            this.title = title;
            this.capacity = capacity;
            this.count = 0;
        }

    }
    boolean enroll(){
        if(count<capacity){
            count++;
            return true;
        }
        return false;
    }
    boolean withdraw(){
        if(count>0){
            count--;
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(count==capacity){
            return true;
        }
        return false;
    }
    int getAvailableSeats(){
        return capacity - count;
    }
    @Override
public String toString() {
    return "CourseEnrollment{courseCode='" + CourseCode +
           "', title='" + title +
           "', capacity=" + capacity +
           ", enrolled=" + count + "}";
}

}
