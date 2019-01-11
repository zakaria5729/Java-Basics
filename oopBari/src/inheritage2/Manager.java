package inheritage2;

public class Manager extends Employee {
    
    public String department;
    
    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
    
    void print() {
        System.out.println("name: " + name);
        System.out.println("department: " + department);
    }
    
    @Override
    String getDetails() {
        return "SubDetails";
    }
    
    public static void main(String[] args) {
        Manager mgr = new Manager(1, "Mr. Hossain", "IT");
        mgr.print();
        
        System.out.println(mgr.getDetails());
    }
}
