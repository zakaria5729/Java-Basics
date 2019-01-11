package java_object_assign_to_arrays;

public class SavingAccount extends Account {
    private double amount;

    public SavingAccount(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculateInterest() {
        return amount*.5;
    }
    
}
