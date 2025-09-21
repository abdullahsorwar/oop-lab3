import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal a){ animals.add(a); }

    public void feedAll(){
        // TODO: For each animal, print: "<name> eats. Sound: <sound>"
        // Return type is void; we just require the exact print format for testing via a capture (not used here).
        for (Animal a : animals) {
            System.out.println(a.getName() + " eats. Sound: " + a.makeSound());
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public Animal oldest(){
        int maxAge = -1;
        Animal oldestAnimal = null;
        for (Animal a : animals) {
            if (a.getAge() > maxAge) {
                maxAge = a.getAge();
                oldestAnimal = a;
            }
        }
        return oldestAnimal;
        // TODO: return oldest animal (null if none)
        // throw new UnsupportedOperationException("TODO");
    }

    public int size(){ return animals.size(); }
}
