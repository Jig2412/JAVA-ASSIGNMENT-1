public abstract class Employee implements Payable {
    protected String id;

    Employee(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}