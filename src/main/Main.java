package main;

import coffeeMachine.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        boolean status;
        do {
            status = machine.processAction();
        }
        while(status);
    }
}
