/*
*object type cast also called an "Is a relationship"
 */
package typeCasting;

class Animal {
    int health = 100;
}

class Cat extends Animal {

}

public class ObjectTypeCasting {

    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        
        /*up-casting (implicit and safe)*/
        a = c;
        /*doqn-casting (explicit and can be loose info)*/
        c = (Cat) a;
        
        System.out.println("c = " + c.health);
    }
}
