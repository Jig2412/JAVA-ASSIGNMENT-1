public  class Student extends Person {
    private int[] marks;
    Student(String name,int[] marks){
        super(name);
        this.marks=marks;
    }
    public int[] getMarks() {
        return marks;
    }



    @Override
    public String getRole(){
        return "Student";
    }
    @Override
    public String toString(){
        return "Student: " + getName();
    }

}
