package InvokingObject;

public class UseAnimal {
    
    public void doSomething(Horse horse) {
        System.out.println("Invoke horse object");
    }
    
    public void doSomething(Animal animal) {
        System.out.println("Invoke animal object");
    }            
    
    public static void main(String[] args) {
        Animal obj = new Horse(); //up casting
        
        obj.typeAnimal();
        
        UseAnimal useAnimal = new UseAnimal();
        useAnimal.doSomething(obj);
        
        Horse obj2 = (Horse) obj; //down casting
        
        if(obj2 instanceof Horse) {
            obj2.typeHorse();
            useAnimal.doSomething(obj2);
        }
    }
}
