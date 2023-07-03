package animal;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrr");;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
