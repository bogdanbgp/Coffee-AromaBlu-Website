package com.coffeemenuapp.coffee_aromablu_app.app;

import com.coffeemenuapp.coffee_aromablu_app.model.Accessory;
import com.coffeemenuapp.coffee_aromablu_app.model.Coffee;
import com.coffeemenuapp.coffee_aromablu_app.model.Order;
import com.coffeemenuapp.coffee_aromablu_app.service.MenuService;
import com.coffeemenuapp.coffee_aromablu_app.service.OrderService;
import com.coffeemenuapp.coffee_aromablu_app.service.PromotionGame;

import java.util.List;
import java.util.Scanner;

public class CoffeeApp {
    private MenuService menuService;
    private OrderService orderService;
    private PromotionGame promotionGame;

    public CoffeeApp() {
        menuService = new MenuService();
        orderService = new OrderService();
        promotionGame = new PromotionGame();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Coffee AromaBlu!");
            System.out.println("1. View Coffees");
            System.out.println("2. View Accessories");
            System.out.println("3. Place Order");
            System.out.println("4. View Promotions");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewCoffees();
                    break;
                case 2:
                    viewAccessories();
                    break;
                case 3:
                    placeOrder(scanner);
                    break;
                case 4:
                    viewPromotions();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for choosing Coffee AromaBlu!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void viewCoffees() {
        List<Coffee> coffees = menuService.getCoffees();
        System.out.println("Available Coffees:");
        for (int i = 0; i < coffees.size(); i++) {
            Coffee coffee = coffees.get(i);
            System.out.println((i + 1) + ". " + coffee.getName() + " - $" + coffee.getPrice());
            System.out.println("   Nutritional Facts: " + coffee.getNutritionalFacts());
            System.out.println("   Origin: " + coffee.getOrigin());
            System.out.println("   Combo: " + coffee.getCombo());
        }
    }

    private void viewAccessories() {
        List<Accessory> accessories = menuService.getAccessories();
        System.out.println("Available Accessories:");
        for (int i = 0; i < accessories.size(); i++) {
            Accessory accessory = accessories.get(i);
            System.out.println((i + 1) + ". " + accessory.getName() + " - $" + accessory.getPrice());
        }
    }

    private void placeOrder(Scanner scanner) {
        System.out.println("Would you like to order coffee or an accessory?");
        System.out.println("1. Coffee");
        System.out.println("2. Accessory");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice == 1) {
            System.out.println("Enter the number of the coffee you would like to order: ");
            int coffeeNumber = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            List<Coffee> coffees = menuService.getCoffees();
            if (coffeeNumber > 0 && coffeeNumber <= coffees.size()) {
                Coffee coffee = coffees.get(coffeeNumber - 1);
                System.out.println("Enter your name: ");
                String customerName = scanner.nextLine();
                Order order = new Order(customerName, coffee.getName(), coffee.getPrice(), "Prepare a " + coffee.getName());
                orderService.placeOrder(order);
                promotionGame.itemBought();
                System.out.println("Your order was successful and sent to the barista. Your coffee is now preparing and will be ready shortly. Thank you for choosing AromaBlu!");
            } else {
                System.out.println("Invalid coffee selection. Please try again.");
            }
        } else if (choice == 2) {
            System.out.println("Enter the number of the accessory you would like to order: ");
            int accessoryNumber = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            List<Accessory> accessories = menuService.getAccessories();
            if (accessoryNumber > 0 && accessoryNumber <= accessories.size()) {
                Accessory accessory = accessories.get(accessoryNumber - 1);
                System.out.println("Enter your name: ");
                String customerName = scanner.nextLine();
                Order order = new Order(customerName, accessory.getName(), accessory.getPrice(), "Prepare an order for " + accessory.getName());
                orderService.placeOrder(order);
                promotionGame.itemBought();
                System.out.println("Your order was successful and sent to the barista. Please pick it up from the cashier. Thank you for choosing AromaBlu!");
            } else {
                System.out.println("Invalid accessory selection. Please try again.");
            }
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
    }

    private void viewPromotions() {
        System.out.println(promotionGame.displayPromotions());
    }

    public static void main(String[] args) {
        CoffeeApp app = new CoffeeApp();
        app.start();
    }
}
