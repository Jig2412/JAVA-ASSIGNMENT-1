public class PayrollManagementApp {
    public static void main(String[] args) {

        PayrollProcessor payroll = new PayrollProcessor(5);

        SalariedEmployee e1 = new SalariedEmployee("E101", 50000);
        SalariedEmployee e2 = new SalariedEmployee("E102", 45000);
        HourlyEmployee e3 = new HourlyEmployee("E103", 40, 500);
        HourlyEmployee e4 = new HourlyEmployee("E104", 30, 600);
        Invoice i1 = new Invoice("I101", 10000);

        payroll.addPayment(e1);
        payroll.addPayment(e2);
        payroll.addPayment(e3);
        payroll.addPayment(e4);
        payroll.addPayment(i1);

        payroll.displayPayments();

        System.out.println("Total Payment: " + payroll.calculateTotal());

        System.out.println("Search: " + payroll.searchById("E103"));

        payroll.countTypes();
    }
}