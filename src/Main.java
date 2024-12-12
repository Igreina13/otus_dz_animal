import animals.AbsAnimal;
import data.AnimalTypesData;
import data.ColorData;
import data.CommandsData;
import factory.FactoryAnimal;
import utils.InputUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<AbsAnimal>  animals = new ArrayList<>();

        InputUtils inputUtils = new InputUtils(scanner);

        while (true) {

            String commandStrUser = inputUtils.inputWithValidation(
                    "Введите одну из команд %s:\n",
           CommandsData.class,
                    "Вы ввели неверную команду =("
            );

            switch (CommandsData.valueOf((commandStrUser))) {
                case ADD: {

                    String animalTypesStrUser = inputUtils.inputWithValidation(
                            "Введите один из типов животного %s:",
                            AnimalTypesData.class,
                            "Вы ввели неверный тип животного: =("
                    );

                    System.out.println("Введите имя животного:");
                    String name = scanner.next();

                    int age = inputUtils.inputNumberUser(
                            "Вы ввели неверный возраст животного =(",
                            "Введите возраст животного:"
                    );

                    int weight = inputUtils.inputNumberUser(
                            "Вы ввели неверный вес животного =(",
                            "Введите вес животного:"
                    );

                    String colorDataStr = inputUtils.inputWithValidation(
                            "Введите один из цветов животного %s:\n",
                            ColorData.class,
                            "Цвет не поддерживается =("
                    );

                    ColorData colorData = ColorData.valueOf(colorDataStr);

                    AbsAnimal animal = new FactoryAnimal(name, age, weight, colorData).create(AnimalTypesData.valueOf(animalTypesStrUser));


                    animals.add(animal);
                    animal.say();
                    break;

                }
                case LIST: {
                    animals.forEach(animal -> System.out.println(animal.toString()));
                    break;
                }
                case EXIT: {
                    System.out.println("Пока-пока!!!");
                    System.exit(0);
            }

            }

        }
    }

}