public class SalariedEmployee extends Employee {
    private double salary;

    SalariedEmployee(String id,double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salaried Employee:" + id;
    }
}
