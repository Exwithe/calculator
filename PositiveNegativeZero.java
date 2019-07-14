import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegativeZero {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Remorechner 2.2");
            System.out.print("First number: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String firstInput = bufferedReader.readLine();
            switch (firstInput) {
                case "!help":
                    System.out.println("First number = erste  Zahl (nur Zahlen)" + "\n" + "Operator = Operator (+,-,*,/)" + "\n" + "Second number = zweite Zahl (nur Zahlen)");
                    main(null);
                    break;
                case "!changelog":
                    System.out.println("2.0 basic version" + "\n" + "2.1 added !help & !changelog" + "\n" + "2.2 added methods");
                    main(null);
                    break;
                    default: {
                    double firstNumber = Double.parseDouble(firstInput);
                    System.out.print("Operator: ");
                    String operator = bufferedReader.readLine();
                    System.out.print("Second number: ");
                    String secondInput = bufferedReader.readLine();
                    double secondNumber = Double.parseDouble(secondInput);
                    double result = -1.1111111111;
                    //int uselessInteger = 1;
                    switch (operator) {
                        case "+":
                            result = calculatePlus(firstNumber, secondNumber);
                            break;
                        case "-":
                            result = calculateMinus(firstNumber, secondNumber);
                            break;
                        case "*":
                            result = calculateTimes(firstNumber, secondNumber);
                            break;
                        case "/":
                            result = calculateDivide(firstNumber, secondNumber);
                            break;
                        default:
                            System.out.println("Your input is invalid, return to home...");
                            break;
                    }
                    System.out.println("Your result is " + result);
                }
            }
        }
    }
    public static double calculatePlus (double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
        }
    public static double calculateMinus (double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
        }
    public static double calculateTimes (double firstNumber, double secondNumber) {
            double result = firstNumber * secondNumber;
            return result;
        }
    public static double calculateDivide (double firstNumber, double secondNumber) {
        if (firstNumber == 0 | secondNumber == 0) {
            System.out.println("Du Bridä, epis durch Null git immer nid (Zrugg ad ORS mit diär!");
            return 0;
        } else {
            double result = firstNumber / secondNumber;
            return result;
        }
    }
}




