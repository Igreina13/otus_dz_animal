package animals.birds;

import animals.AbsAnimal;
import data.ColorData;

public class Duck extends AbsAnimal implements IFlaying{

    public Duck(String name, int age, int weight, ColorData color) {
        super(name, age, weight, color);
    }

    @Override
    public void fly(){
        System.out.println("Я лечу ибо я кря кря");
    }
    @Override
    public void say() {
        System.out.println("Кря кря кря");
    }
}
//gigi
