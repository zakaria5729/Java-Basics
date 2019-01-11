package oopbasic;

public class staticVariable {
    public static void main(String[] args) {
        
        statVarCons stat = new statVarCons("zakaria", 22);
        stat.display();
        
        statVarCons stat1 = new statVarCons("hossain", 20);
        stat1.display();
        
        statVarCons stat2 = new statVarCons("saharia", 15);
        stat2.display();
        
        /*normal variable related to object but static variable related to (only) this class*/
        System.out.println(statVarCons.uniName);
    }
    
}
