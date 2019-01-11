package java_object_assign_to_arrays;

public abstract class Account {
    private long amount;
    public final void deposit(long amount) {
        this.amount += amount;
    }
    
    public long getAmount() {
        return amount;
    }
    
    public abstract double calculateInterest();
}
