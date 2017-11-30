package repetitor.bulat;

public class Lion implements Animal {
    private boolean isCarnivore;
    private String name;
    private int age;

    public Lion(String name, int age) {
        isCarnivore = true;
        this.name = name;
        this.age = age;
    }

    public Lion() {
        new Lion("King", 5);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getVoice() {
        System.out.println("RRRRRRRRR");
    }

    public void eat(FoodTypes food) {
        if(food == FoodTypes.DryFood)
            System.out.printf("%s: omnomnom", name);
    }

    public void printInfo(Lion lion){
        System.out.printf("Name: %s, age: %d", lion.getName(), lion.getAge());
    }
}
