package kapittel11b.Madlibs;

/**
 * Then create a Camel class and a Duck class that both extend the Animal class.
 */

import kapittel11b.Animal;

public class Duck extends Animal {

    @Override
    void makeSound(){
        System.out.println(" Qak Qak Qak Qak");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
}
