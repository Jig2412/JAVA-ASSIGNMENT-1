
public class PayrollProcessor {
    private Payable[] payments;
    private int size;

    PayrollProcessor(int capacity) {
        payments=new Payable[capacity];
        size=0;
    }

    public boolean addPayment(Payable p){
        if(size<payments.length) {
            payments[size]=p;
            size++;
            return true;
        }
        return false;
    }

    public double calculateTotal(){
        double total=0;

        for(int i=0;i<size;i++){
            total+=payments[i].calculatePayment();
        }

        return total;
    }

    public Payable searchById(String id){
        for(int i=0;i<size;i++) {
            if(payments[i] instanceof Employee){
                Employee e=(Employee)payments[i];

                if(e.getId().equalsIgnoreCase(id))
                    return e;
            } else if(payments[i] instanceof Invoice){
                Invoice inv=(Invoice)payments[i];

                if(inv.getId().equalsIgnoreCase(id))
                    return inv;
            }
        }

        return null;
    }

    public void countTypes(){
        int employees=0;
        int others=0;

        for(int i=0;i<size;i++) {
            if(payments[i] instanceof Employee)
                employees++;
            else
                others++;
        }

        System.out.println("Employees: "+employees);
        System.out.println("Non-Employees: "+others);
    }

    public void displayPayments(){
        for(int i=0;i<size;i++)
            System.out.println(payments[i]+" = "+payments[i].calculatePayment());
    }

}
