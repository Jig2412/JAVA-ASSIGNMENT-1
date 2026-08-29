public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance = 0;
    BankAccount(String accountNumber,String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }
    boolean deposit(double amount){
        if (amount > 0) {
        balance = balance + amount;
        return true;
    }
    return false;
    }
    boolean withdraw(double amount) {

    if (amount > 0 && amount <= balance) {
        balance = balance - amount;
        return true;
    }

    return false;
}
public String getAccountNumber(){
    return accountNumber;
}
public String getownerName(){
    return ownerName;
}
public double getbalance(){
    return balance;

}
@Override
public String toString() {
    return "BankAccount{" +
           "accountNumber='" + accountNumber + '\'' +
           ", ownerName='" + ownerName + '\'' +
           ", balance=" + balance +
           '}';
}


}
