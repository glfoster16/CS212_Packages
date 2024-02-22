package userInput;

public class checkSign {

    public static boolean isPositive(double number, boolean includeZero){

        if (includeZero){
            return number >= 0;
        }
        else {
            return number > 0;
        }

    }

    public static boolean isPositive(float number, boolean includeZero){

        if (includeZero){
            return number >= 0;
        }
        else {
            return number > 0;
        }

    }

    public static boolean isPositive(int number, boolean includeZero){

        if (includeZero){
            return number >= 0;
        }
        else {
            return number > 0;
        }

    }

    public static boolean isPositive(long number, boolean includeZero){

        if (includeZero){
            return number >= 0;
        }
        else {
            return number > 0;
        }

    }

    public static boolean isNegative(double number, boolean includeZero){

        if (includeZero){
            return number <= 0;
        }
        else {
            return number < 0;
        }

    }

    public static boolean isNegative(float number, boolean includeZero){

        if (includeZero){
            return number <= 0;
        }
        else {
            return number < 0;
        }

    }

    public static boolean isNegative(int number, boolean includeZero){

        if (includeZero){
            return number <= 0;
        }
        else {
            return number < 0;
        }

    }

    public static boolean isNegative(long number, boolean includeZero){

        if (includeZero){
            return number <= 0;
        }
        else {
            return number < 0;
        }

    }


}
