package inheritage2;

public class Employee {
    
    public String name;
    public int employeeId;
    
    public Employee() {
        this.employeeId = 1;
        this.name = "zakaria";
    }
    
    public Employee(int id, String name) {
        this.employeeId = id;
        this.name = name;
    }
    
     String getDetails() {
        return "ID is " + employeeId + " and name is " + name;
    }
}
