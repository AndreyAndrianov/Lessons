package repetitor.bulat;

import java.text.Format;

public class Elephant implements Animal {
    private String name;
    private boolean isCarnivore;
    private int age;

    public Elephant(String name, int age) {
        isCarnivore = false;
        this.name = name;
        this.age = age;
    }

    public Elephant() {
        new Elephant("Jumbo", 3);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void getVoice() {
        System.out.println("UUUUUUUUUUU");
    }

    public void eat(FoodTypes food) {
        if(food == FoodTypes.DryFood)
            System.out.printf("%s: omnomnom", name);
    }

    public void printInfo(Elephant elephant){
        System.out.printf("Name: %s, age: %d", elephant.getName(), elephant.getAge());
    }
}
