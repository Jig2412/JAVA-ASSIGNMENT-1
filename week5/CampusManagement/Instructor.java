public  class Instructor extends Person {
    Instructor(String name){
        super(name);
    }
    
    @Override
    public String getRole(){
        return "Instructor";
    }
    @Override
    public String toString(){
        return "Instructor: " + getName();
    }
}
