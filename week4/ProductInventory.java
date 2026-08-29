public class ProductInventory {
    private String code;
    private String name;
    private double unitP;
    private int quantity;
    private static int spc = 0;
    ProductInventory(String code, String name, double unitP) {
        this(code, name, unitP, 0);
    }
    ProductInventory(String code, String name, double unitP, int quantity) {
        if (unitP>0 && quantity>=0) {
        this.code = code;
        this.name = name;
        this.unitP = unitP;
        this.quantity = quantity;
        spc++;
        }
    }
    public void restock(int amount) {
    if (amount>0) {
        quantity += amount;
    }
}
public void sell(int amount) {
    if (amount>0 && amount<=quantity) {
        quantity -= amount;
    }
}

public double getInventoryValue() {
    return unitP * quantity;
}
@Override
public String toString() { 
    return "ProductInventory{code='" + code + 
           "', name='" + name + 
           "', unitP=" + unitP + 
           ", quantity=" + quantity + "}";
}

}
