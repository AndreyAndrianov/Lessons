package repetitor.bulat;

public class Eagle implements Animal, Bird {
    private String name;
    private int age;
    private boolean isCarnivore;

    public Eagle(String name, int age) {
        isCarnivore = true;
        this.age = age;
        this.name = name;
    }

    public Eagle() {
        new Eagle("Eagle", 1);
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getVoice() {
        System.out.println("Kar");
    }

    public void eat(FoodTypes food) {
        if(food == FoodTypes.DryFood)
            System.out.printf("%s: omnomnom", name);
    }

    public void fly() {
        System.out.println("I fly");
    }

    public void getEggs() {
        System.out.println("I made 2 eggs");
    }
}
