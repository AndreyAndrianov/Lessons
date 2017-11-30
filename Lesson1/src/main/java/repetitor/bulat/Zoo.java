package repetitor.bulat;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public List<Animal> getAnimals(){
        return animals;
    }
}
