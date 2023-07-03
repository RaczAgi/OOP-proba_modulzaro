package animal;

import java.util.ArrayList;

public class Elephant extends Animal{


    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Trompeting");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
