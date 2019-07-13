import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegativeZero {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Remorechner 2.1");
            System.out.print("First number: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String firstInput = bufferedReader.readLine();
            switch (firstInput) {
                case "!help":
                    System.out.println("First number = erste  Zahl (nur Zahlen)" + "\n" + "Operator = Operator (+,-,*,/)" + "\n" + "Second number = zweite Zahl (nur Zahlen)");
                    main(null);
                    break;
                case "!changelog":
                    System.out.println("2.0 basicversion" + "\n" + "2.1 added !help & !chanchelog");
                    main(null);
                    break;
                default: {
                    double firstNumber = Double.parseDouble(firstInput);
                    System.out.print("Operator: ");
                    String operator = bufferedReader.readLine();
                    System.out.print("Second number: ");
                    String secondInput = bufferedReader.readLine();
                    double secondNumber = Double.parseDouble(secondInput);
                    double result = 0;
                    int uselessInteger = 1;
                    switch (operator) {
                        case "+":
                            result = firstNumber + secondNumber;
                            break;
                        case "-":
                            result = firstNumber - secondNumber;
                            break;
                        case "*":
                            result = firstNumber * secondNumber;
                            break;
                        case "/":
                            result = firstNumber / secondNumber;
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
}




