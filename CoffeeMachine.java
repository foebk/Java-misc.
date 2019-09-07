import java.util.Scanner;

class Main {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);

    static void buyAction() {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choose = scanner.next();
        System.out.println(choose);
        switch (choose){
            case "1":
                if (water - 250 >= 0 && beans - 16 >= 0 && cups > 0) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    if (water - 250 < 0) {
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (beans - 16 < 0) {
                        System.out.println("Sorry, not enough beans!");
                    }
                    else if (cups == 0) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
                break;
            case "2":
                if (water - 350 >= 0 && beans - 20 >= 0 && milk - 75 >= 0 && cups > 0) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    if (water - 350 < 0) {
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (beans - 20 < 0) {
                        System.out.println("Sorry, not enough beans!");
                    }
                    else if (milk - 75 < 0) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    else if (cups == 0) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
                break;
            case "3":
                if (water - 200 >= 0 && beans - 12 >= 0 && milk - 100 >= 0 && cups > 0) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                else {
                    if (water - 200 < 0) {
                        System.out.println("Sorry, not enough water!");
                    } else if (beans - 75 < 0) {
                        System.out.println("Sorry, not enough beans!");
                    } else if (milk - 12 < 0) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (cups == 0) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
            case "back":
                return;
        }
    }

    static void takeAction() {
        System.out.println("I gave you: $" + money);
        money = 0;
    }

    static void fillAction() {
        System.out.print("Write how many ml of water do you want to add: ");
        int wfill = scanner.nextInt();
        System.out.println(wfill);
        System.out.print("Write how many ml of milk do you want to add: ");
        int mfill = scanner.nextInt();
        System.out.println(mfill);
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        int bfill = scanner.nextInt();
        System.out.println(bfill);
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        int cfill = scanner.nextInt();
        System.out.println(cfill);
        water += wfill;
        milk += mfill;
        beans += bfill;
        cups += cfill;
    }

    static void writeStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        if (money > 0){
            System.out.print("$");
        }
        System.out.println(money + " of money");
    }

    public static void main(String[] args) {
        writeStatus();
        System.out.println();
        System.out.print("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();
        System.out.println(action);
        while (true) {
            switch (action) {
                case "buy":
                    buyAction();
                    System.out.print("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    System.out.println(action);
                    break;
                case "fill":
                    fillAction();
                    System.out.print("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    System.out.println(action);
                    break;
                case "take":
                    takeAction();
                    System.out.print("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    System.out.println(action);
                    break;
                case "remaining":
                    writeStatus();
                    System.out.print("Write action (buy, fill, take, remaining, exit): ");
                    action = scanner.next();
                    System.out.println(action);
                    break;
                case "exit":
                    return;
            }
        }
    }
}
