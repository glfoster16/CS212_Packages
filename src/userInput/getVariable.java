package userInput;
import java.util.Scanner;

public class getVariable {

    public static String POSITIVE = "positive";
    public static String NEGATIVE = "negative";

    /**
     * Prints a prompt to the console and reads the next line from the console
     * Will only accept the correct type
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a double
     */
    public static double getSafeDouble(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);
        String input = scanner.nextLine();
        while (!checkType.isDouble(input)){
            System.out.println("Please only enter a number.");
            System.out.println("Try again.");
            input = scanner.nextLine();
        }

        return Double.parseDouble(input);
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @param sign accepts "positive" or "negative", will only return input of this type
     * @return The input as a double
     */
    public static double getSafeDouble(String promptText, String sign){
        if (!sign.equals(POSITIVE) && !sign.equals(NEGATIVE)){
            throw new IllegalArgumentException("Unexpected token: '" + sign + "'" +
                    "\n\nAccepted arguments are \"" + POSITIVE + "\" and \"" + NEGATIVE + "\"\n");
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(promptText);
            String input = scanner.nextLine();

            while (!checkType.isDouble(input)) {
                System.out.println("Please only enter a " + sign + " number.");
                System.out.println("Try again.");
                input = scanner.nextLine();
            }

            double number = Double.parseDouble(input);

            if (sign.equals(POSITIVE)) {
                if (0 > number){
                    System.out.println("Please only enter a positive number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            } else if (sign.equals(NEGATIVE)){
                if (0 < number){
                    System.out.println("Please only enter a negative number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            }
        }

    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * Will only accept the correct type
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as an integer
     */
    public static int getSafeInt(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);
        String input = scanner.nextLine();
        while (!checkType.isInt(input)){
            System.out.println("Please only enter a whole number.");
            System.out.println("Try again.");
            input = scanner.nextLine();
        }

        return Integer.parseInt(input);
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @param sign accepts "positive" or "negative", will only return input of this type
     * @return The input as an integer
     */
    public static int getSafeInt(String promptText, String sign){
        if (!sign.equals(POSITIVE) && !sign.equals(NEGATIVE)){
            throw new IllegalArgumentException("Unexpected token: '" + sign + "'" +
                    "\n\nAccepted arguments are \"" + POSITIVE + "\" and \"" + NEGATIVE + "\"\n");
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(promptText);
            String input = scanner.nextLine();

            while (!checkType.isInt(input)) {
                System.out.println("Please only enter a " + sign + " number.");
                System.out.println("Try again.");
                input = scanner.nextLine();
            }

            int number = Integer.parseInt(input);

            if (sign.equals(POSITIVE)) {
                if (0 > number){
                    System.out.println("Please only enter a positive whole number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            } else if (sign.equals(NEGATIVE)){
                if (0 < number){
                    System.out.println("Please only enter a negative whole number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            }
        }
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * Will only accept the correct type
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a long
     */
    public static long getSafeLong(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);
        String input = scanner.nextLine();
        while (!checkType.isLong(input)){
            System.out.println("Please only enter a whole number.");
            System.out.println("Try again.");
            input = scanner.nextLine();
        }

        return Long.parseLong(input);
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @param sign accepts "positive" or "negative", will only return input of this type
     * @return The input as a long
     */
    public static long getSafeLong(String promptText, String sign){
        if (!sign.equals(POSITIVE) && !sign.equals(NEGATIVE)){
            throw new IllegalArgumentException("Unexpected token: '" + sign + "'" +
                    "\n\nAccepted arguments are \"" + POSITIVE + "\" and \"" + NEGATIVE + "\"\n");
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(promptText);
            String input = scanner.nextLine();

            while (!checkType.isDouble(input)) {
                System.out.println("Please only enter a " + sign + " number.");
                System.out.println("Try again.");
                input = scanner.nextLine();
            }

            long number = Long.parseLong(input);

            if (sign.equals(POSITIVE)) {
                if (0 > number){
                    System.out.println("Please only enter a positive whole number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            } else if (sign.equals(NEGATIVE)){
                if (0 < number){
                    System.out.println("Please only enter a negative whole number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            }
        }

    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * Will only accept the correct type
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a float
     */
    public static float getSafeFloat(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);
        String input = scanner.nextLine();
        while (!checkType.isFloat(input)){
            System.out.println("Please only enter a number.");
            System.out.println("Try again.");
            input = scanner.nextLine();
        }

        return Float.parseFloat(input);
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @param sign accepts "positive" or "negative", will only return input of this type
     * @return The input as a float
     */
    public static float getSafeFloat(String promptText, String sign){
        if (!sign.equals(POSITIVE) && !sign.equals(NEGATIVE)){
            throw new IllegalArgumentException("Unexpected token: '" + sign + "'" +
                    "\n\nAccepted arguments are \"" + POSITIVE + "\" and \"" + NEGATIVE + "\"\n");
        }

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(promptText);
            String input = scanner.nextLine();

            while (!checkType.isDouble(input)) {
                System.out.println("Please only enter a " + sign + " number.");
                System.out.println("Try again.");
                input = scanner.nextLine();
            }

            float number = Float.parseFloat(input);

            if (sign.equals(POSITIVE)) {
                if (0 > number){
                    System.out.println("Please only enter a positive number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            } else if (sign.equals(NEGATIVE)){
                if (0 < number){
                    System.out.println("Please only enter a negative number.");
                    System.out.println("Try again.");
                }
                else {
                    return number;
                }
            }
        }

    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a string
     */
    public static String getString(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);

        return scanner.nextLine();
    }


    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a double
     */
    public static double getDouble(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);

        return scanner.nextDouble();
    }


    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as an integer
     */
    public static int getInt(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);

        return scanner.nextInt();
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a long
     */
    public static long getLong(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);

        return scanner.nextLong();
    }

    /**
     * Prints a prompt to the console and reads the next line from the console
     * @param promptText Will print this prompt to let the user know what to do
     * @return The input as a float
     */
    public static float getFloat(String promptText){
        Scanner scanner = new Scanner(System.in);
        System.out.println(promptText);

        return scanner.nextFloat();
    }

    /**
     * Reads the next line from console
     * @return The input as a string
     */
    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Reads the next line from console
     * @return The input as an integer
     */
    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Reads the next line from console
     * @return The input as a double
     */
    public static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    /**
     * Reads the next line from console
     * @return The input as a long
     */
    public static long getLong(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }

    /**
     * Reads the next line from console
     * @return The input as a float
     */
    public static float getFloat(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }


}
