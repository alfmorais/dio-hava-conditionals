package controllers;

import exceptions.InvalidParametersException;

public class Counter {
    public int firstNumber;
    public int secondNumber;

    public Counter (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Counter() {}

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void start() throws InvalidParametersException {
        boolean conditionToError = this.getFirstNumber() > this.getSecondNumber();

        if (conditionToError) {
            String message = "O segundo parâmetro deve ser maior que o primeiro";
            throw new InvalidParametersException(message);
        }

        int counter = this.getSecondNumber() - this.getFirstNumber();

        for (int number = 1; number <= counter; number++){
            System.out.println("Imprimindo o número: " + number);
        }
    }
}
