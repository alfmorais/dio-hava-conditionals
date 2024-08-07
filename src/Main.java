import controllers.Counter;
import exceptions.InvalidParametersException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int firstNumber = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int secondNumber = terminal.nextInt();

        Counter counter = new Counter(firstNumber, secondNumber);

        try {
            counter.start();
        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        }
    }
}