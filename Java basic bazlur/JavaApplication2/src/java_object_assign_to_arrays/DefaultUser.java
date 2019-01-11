package java_object_assign_to_arrays;

public class DefaultUser implements User {
    private String name;

    public DefaultUser(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
}
