package utils;

import data.ColorData;
import data.CommandsData;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class InputUtils {

    private  Scanner scanner;

    private EnumUtils enumUtils = new EnumUtils();

    private NumbersUtils numbersUtils = new NumbersUtils();

    public InputUtils(Scanner scanner) {
        this.scanner = scanner;
    }

    public <T extends Enum <T>>String inputWithValidation (String userMessage, Class<T> enumClass, String errorMessage) {
        List<String> names = new ArrayList<>();
        for(T enumConst: enumClass.getEnumConstants()) {
            names.add(enumConst.name().toLowerCase());
        }

        while (true) {
        System.out.printf(userMessage, String.join("/", names));
        String userInput = scanner.next().toUpperCase(Locale.ROOT);

        if(!enumUtils.checkValueInEnum(enumClass, userInput)) {
            System.out.println(errorMessage);
            continue;
    }

    return userInput;
     }

    }

    public int inputNumberUser(String errorMassage, String inputMessage) {

        while (true) {
            System.out.println(inputMessage);
        String numberUserInput = scanner.next();

        if (!numbersUtils.isNumber(numberUserInput)) {
            System.out.println(errorMassage);
            continue;
        }

        int number = Integer.parseInt(numberUserInput);
        if (number <= 0 || number > 20) {
            System.out.println(errorMassage);
            continue;
        }
        return number;
    }
    }
}
