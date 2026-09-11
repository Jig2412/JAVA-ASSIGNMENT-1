public  class Coach  extends Person{
    Coach(String name){
        super(name);
    }
    @Override
    public String getRole(){
        return "Coach";
    }
    @Override
    public String toString(){
        return "Coach: " + getName();
    }
}
