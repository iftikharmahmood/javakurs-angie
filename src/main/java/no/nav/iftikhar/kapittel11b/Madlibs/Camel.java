package kapittel11b.Madlibs;


/**
 * Then create a Camel class and a Duck class that both extend the Animal class.
 */

import kapittel11b.Animal;

public class Camel extends Animal {


        Animal animal = new Camel() {
        }

    @Override
    void makeSound() {

        System.out.println(" Camel Camel");
    }

    @Override
    public void eat() {
        super.eat();
    }

}
