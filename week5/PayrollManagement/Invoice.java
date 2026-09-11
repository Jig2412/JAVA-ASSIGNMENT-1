public class Invoice implements Payable{
    private String id;
    private double amount;

    Invoice(String id, double amount){
        this.id=id;
        this.amount=amount;
    }

    public String getId(){
        return id;
    }

    @Override
    public double calculatePayment(){
        return amount;
    }

    @Override
    public String toString(){
        return "Invoice: " + id;
    }
}