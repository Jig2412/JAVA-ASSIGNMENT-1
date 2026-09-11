public class HourlyEmployee extends Employee{
    private double hours;
    private double rate;

    HourlyEmployee(String id,double hours,double rate){
        super(id);
        this.hours=hours;
        this.rate=rate;
    }

    @Override
    public double calculatePayment() {
        return hours*rate;
    }

    @Override
    public String toString(){
        return "Hourly Employee:" + id;
    }
}