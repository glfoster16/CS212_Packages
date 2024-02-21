package userInput;

public class checkType {


    /**
     * Checks if a string is a double
     * @param input The string being checked if it is a double or not
     * @return true if input is a double, false if input is not a double
     */
    public static boolean isDouble(String input){
        try {
            double test = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Checks if a string is an Integer
     * @param input The string being checked if it is an integer or not
     * @return true if input is an integer, false if input is not an integer
     */
    public static boolean isInt(String input){
        try {
            double test = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Checks if a string is a long
     * @param input The string being checked if it is a long or not
     * @return true if input is a long, false if input is not a long
     */
    public static boolean isLong(String input){
        try {
            double test = Long.parseLong(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Checks if a string is a float
     * @param input The string being checked if it is a float or not
     * @return true if input is a float, false if input is not a float
     */
    public static boolean isFloat(String input){
        try {
            double test = Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }


}