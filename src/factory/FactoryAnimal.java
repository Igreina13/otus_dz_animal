package factory;

import animals.AbsAnimal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypesData;
import data.ColorData;

public class FactoryAnimal {

    private String name;
    private int age;
    private int weight;
    private ColorData colorData;

    public FactoryAnimal(String name, int age, int weight, ColorData color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colorData = color;
    }

    public AbsAnimal create(AnimalTypesData animalTypesData){
        switch(animalTypesData) {
            case CAT: {
                return new Cat(name, age, weight, colorData);
            }
            case DOG: {
                return new Dog(name, age, weight, colorData);

            }
            case DUCK: {
                return new Duck(name, age, weight, colorData);
            }
        }

return null;

    }
}