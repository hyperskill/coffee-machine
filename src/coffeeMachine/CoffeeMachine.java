package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private Scanner scanner;
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    private CoffeeMachine() {
        this.scanner = new Scanner(System.in);
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.cups = 9;
        this.money = 550;
    }

}
