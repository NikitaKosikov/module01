package by.epam_laba.module1;

import by.epam_laba.module.MyStringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        for (String string : str) {
            if (!MyStringUtils.isPositiveNumber(string)){
                return false;
            }
        }
        return true;
    }
}
