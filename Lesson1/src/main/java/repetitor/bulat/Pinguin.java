package repetitor.bulat;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Pinguin implements Animal, Bird {

    public void fly() {
        throw new NotImplementedException();
    }

    public void getEggs() {
        System.out.println("Take 1 egg");
    }

    public String getName() {
        //в нашем примере не так важно
        return null;
    }

    public int getAge() {
        //в нашем примере не так важно
        return 0;
    }

    public void getVoice() {
        //в нашем примере не так важно
    }

    public void eat(FoodTypes food) {
        //в нашем примере не так важно
    }
}
