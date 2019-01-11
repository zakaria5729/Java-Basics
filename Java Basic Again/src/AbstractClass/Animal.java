package AbstractClass;

public abstract class Animal {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    
    public abstract String getDiet();

    public int getLegs() {
        return legs;
    }

    public void sleep() {
        String name = getClass().getSimpleName();
        System.out.println(name + " sleeping... Don't distrub!");
    }
}

class Lion extends Animal {

    public Lion(int legs) {
        super(legs);
    }

    @Override
    public String getDiet() {
        return "Meat";
    }
}

class Tiger extends Animal {

    public Tiger(int legs) {
        super(legs);
    }

    @Override
    public String getDiet() {
        return "Meat";
    }
}

class Deer extends Animal {

    public Deer(int legs) {
        super(legs);
    }

    @Override
    public String getDiet() {
        return "Grass";
    }
}

class MiniZoo {

    private Animal[] animals;

    public MiniZoo(Animal[] animals) {
        this.animals = animals;
    }
    
    public void numberOfLegs() {
        System.out.println("");
        
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " has " + animal.getLegs() + " legs");
        }
    }

    public void putThemOnSleep() {        
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    public void dietsOfAllAnimal() {
        System.out.println("");
        
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " eats " + animal.getDiet());
        }
    }
}

class MiniZooDemo {

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];

        animal[0] = new Tiger(4);
        animal[1] = new Lion(6);
        animal[2] = new Deer(5);

        MiniZoo miniZoo = new MiniZoo(animal);
        miniZoo.putThemOnSleep();
        miniZoo.dietsOfAllAnimal();
        miniZoo.numberOfLegs();
    }
}
