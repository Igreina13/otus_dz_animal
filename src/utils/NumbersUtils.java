package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersUtils {

    public boolean isNumber(String number) {
        return number.trim().matches("^\\d+$");
  }
}
