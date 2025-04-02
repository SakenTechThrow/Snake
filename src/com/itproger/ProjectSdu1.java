package com.itproger;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectSdu1 {
    public static Scanner scanner = new Scanner(System.in);
    private static final String adminPassword = "Admin01?";
    public static boolean isRunning = true;
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<ArrayList<String>> subCategories = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> Prices = new ArrayList<>();


    public static void main(String[] args) {
        while (isRunning) {
            System.out.print("Enter 'Admin', 'Client', or 'Exit' to close the program: ");
            String user = scanner.nextLine();
            if (user.equals("Admin")) {
                System.out.print("Enter Admin password: ");
                String password = scanner.nextLine();
                if (password.equals(adminPassword)) {
                    Admin1.start();
                } else {
                    System.out.println("Incorrect password. Try again!");
                }
            } else if (user.equals("Client")) {
                System.out.println("You entered as a Client");
                Client1.start();
            } else if (user.equals("Exit")) {
                System.out.println("Exiting the program, Goodbye!");
                isRunning = false;
            } else {
                System.out.println("You entered something wrong, try again!");
            }
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------------------

class Admin1 extends ProjectSdu1 {
    public static String welcomeMessage = "Welcome to the Admin Panel of 'Magnum' Supermarket!";
    public static Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println(welcomeMessage);
        while (true) {
            System.out.println("Here you can do the following activities: \n\n");
            System.out.println("0. Exit Admin Mode and return to Role Selection.");
            System.out.println("1. Change Welcome Message.");
            System.out.println("2. Change Menu.");
            System.out.println("3. Change SubMenu.");
            System.out.println("4. Change Price.");
            System.out.println("5. Display Welcome Message.");
            System.out.println("6. Display Menu.");
            System.out.println("7. Display SubMenu.");
            System.out.println("8. Display Prices.");
            System.out.println("9. Initialize with standard data.");

            System.out.print("\nChoose an activity: ");
            int choice = getIntInput();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting Admin Mode...");
                    return;
                case 1:
                    changeWelcomeMessage();
                    break;
                case 2:
                    changeMenu();
                    break;
                case 3:
                    changeSubMenu();
                    break;
                case 4:
                    changePrice();
                    break;
                case 5:
                    System.out.println(welcomeMessage);
                    break;
                case 6:
                    displayMenu();
                    break;
                case 7:
                    displaySubMenu();
                    break;
                case 8:
                    displayPrices();
                    break;
                case 9:
                    initializeData();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // CASE 1
    public static void changeWelcomeMessage() {
        System.out.print("Enter welcome message that you want to change: ");
        welcomeMessage = scanner.nextLine();
        System.out.println("Welcome message is successfully changed! ");
    }

    // CASE 2
    public static void changeMenu() {
        System.out.println("Here you can do the following activities: ");
        System.out.println("0. Go Back.");
        System.out.println("1. Add category.");
        System.out.println("2. Remove Categories.");
        System.out.print("Your choice: ");
        int choice = getIntInput();
        scanner.nextLine();
        switch (choice) {
            case 0:
                return;
            case 1:
                addCategory();
                break;
            case 2:
                removeCategory();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // CASE 2(CHANGE MENU) INSIDE ADD
    public static void addCategory() {
        System.out.println("Write the names of categories separated by comma(c1, c2, ...): ");
        System.out.print("> ");
        String categoryInput = scanner.nextLine();
        String[] inputArray = categoryInput.split(", ");


        for (String cat : inputArray) {
            if (!categories.contains(cat.trim())) {
                categories.add(cat.trim());
                subCategories.add(new ArrayList<>());
                Prices.add(new ArrayList<>());
                System.out.println("Category '" + cat + "' successfully added!");
            } else {
                System.out.println("Category '" + cat + "' already exists!");
            }
        }

        System.out.println("Current categories: " + categories);
    }

    // CASE 2(MENU)  REMOVE
    public static void removeCategory() {
        if (categories.isEmpty()) {
            System.out.println("No categories available to remove.");
            return;
        }

        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }

        System.out.print("Enter the index of the category you want to remove: ");
        int remove = getIntInput();
        scanner.nextLine();

        if (remove < 1 || remove > categories.size()) {
            System.out.println("Invalid index. Please try again.");
            return;
        }

        int indexToRemove = remove - 1;
        String category = categories.get(indexToRemove);

        categories.remove(indexToRemove);
        subCategories.remove(indexToRemove);
        Prices.remove(indexToRemove);

        System.out.println("Category '" + category + "' and all associated subcategories and prices removed.");
    }

    // 3 CASE
    public static void changeSubMenu() {
        System.out.println("Here you can do the following activities: ");
        System.out.println("0. Go Back.");
        System.out.println("1. Add subcategory.");
        System.out.println("2. Remove subcategories.");
        System.out.print("Your choice: ");
        int choice = getIntInput();

        switch (choice) {
            case 0:
                return;
            case 1:
                addSubCategory();
                break;
            case 2:
                removeSubcategory();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // CASE 3(SUBMENU)  ADD
    public static void addSubCategory() {
        if (categories.isEmpty()) {
            System.out.println("No categories available. Please add categories first.");
            return;
        }
        System.out.println("Choose a category for which you want to add subcategories: ");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }
        System.out.print("Enter the index of category: ");
        int index = getIntInput();
        scanner.nextLine();

        if (index < 1 || index > categories.size()) {
            System.out.println("Invalid category index. Please try again.");
            return;
        }

        String category = categories.get(index - 1);
        ArrayList<String> subList = subCategories.get(index - 1);
        ArrayList<Integer> priceList = Prices.get(index - 1);

        System.out.println("Write the names of subcategories separated by comma(c1, c2, ...): ");
        System.out.print("> ");
        String subCategoryInput = scanner.nextLine();
        String[] inputArray = subCategoryInput.split(", ");

        for (String subCat : inputArray) {
            if (!subList.contains(subCat.trim())) {
                subList.add(subCat.trim());
                priceList.add(0);
                System.out.println("Subcategory '" + subCat + "' added to category '" + category + "'.");
            } else {
                System.out.println("Subcategory '" + subCat + "' already exists in category '" + category + "'.");
            }
        }
    }


    // CASE 3(SUBMENU) REMOVE
    public static void removeSubcategory() {
        if (categories.isEmpty()) {
            System.out.println("No categories available. Please add categories first.");
            return;
        }

        System.out.println("Choose a category for which you want to remove a subcategory: ");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }
        System.out.print("Enter the index of the category: ");
        int categoryIndex = getIntInput();
        scanner.nextLine();

        if (categoryIndex < 1 || categoryIndex > categories.size()) {
            System.out.println("Invalid category index. Please try again.");
            return;
        }

        ArrayList<String> subList = subCategories.get(categoryIndex - 1);
        ArrayList<Integer> priceList = Prices.get(categoryIndex - 1);

        if (subList.isEmpty()) {
            System.out.println("No subcategories available in the selected category.");
            return;
        }

        System.out.println("Choose a subcategory to remove:");
        for (int i = 0; i < subList.size(); i++) {
            System.out.println((i + 1) + ". " + subList.get(i));
        }
        System.out.print("Enter the index of the subcategory: ");
        int subIndex = getIntInput();
        scanner.nextLine();

        if (subIndex < 1 || subIndex > subList.size()) {
            System.out.println("Invalid subcategory index. Please try again.");
            return;
        }

        String removedSubcategory = subList.get(subIndex - 1);
        subList.remove(subIndex - 1);
        priceList.remove(subIndex - 1);

        System.out.println("Subcategory '" + removedSubcategory + "' removed successfully.");
    }

    // CASE 4
    public static void changePrice() {
        if (categories.isEmpty()) {
            System.out.println("No categories available. Please add categories first.");
            return;
        }

        System.out.println("Choose a category for which you want to change prices of subcategories: ");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }
        System.out.print("Enter the number of the category: ");
        int catIndex = getIntInput();
        scanner.nextLine();

        if (catIndex < 1 || catIndex > categories.size()) {
            System.out.println("Invalid category number. Please try again.");
            return;
        }
        String category = categories.get(catIndex - 1);
        ArrayList<String> subList = subCategories.get(catIndex - 1);
        ArrayList<Integer> priceList = Prices.get(catIndex - 1);

        if (subList.isEmpty()) {
            System.out.println("No subcategories available in this category.");
            return;
        }

        System.out.println("Choose a subcategory to change its price:");
        for (int i = 0; i < subList.size(); i++) {
            System.out.println((i + 1) + ". " + subList.get(i) + " - Current price: " + priceList.get(i));
        }
        System.out.print("Enter indexes to set price(i1, i2, ...): ");
        String input = scanner.nextLine();
        System.out.print("Enter new price: ");
        int price = scanner.nextInt();
        String[] inputArray = input.split(", ");
        int[] num = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            num[i] = Integer.parseInt(inputArray[i]);
            if (num[i] < 1 || num[i] > subList.size()) {
                System.out.println("Invalid subcategory number. Please try again.");
            }
            String subCategory = subList.get(num[i] - 1);
            priceList.set(num[i] - 1, price);
            System.out.println("Price for subcategory " + subCategory + " in category " + category + " set to " + price + ".");
        }
    }

    // CASE 6
    public static void displayMenu() {
        if (categories.isEmpty()) {
            System.out.println("No items available!");
            return;
        }
        for (int i = 0; i < categories.size(); i++) {
            System.out.println(i + 1 + ". " + categories.get(i));
        }
    }

    // CASE 7
    public static void displaySubMenu() {
        if (categories.isEmpty()) {
            System.out.println("No categories available. Please add categories first.");
            return;
        }

        System.out.println("Choose a category to see its subcategories:");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }

        System.out.print("Enter the number of the category: ");
        int index = getIntInput();
        scanner.nextLine();

        if (index < 1 || index > categories.size()) {
            System.out.println("Invalid category index. Please try again.");
            return;
        }

        ArrayList<String> subList = subCategories.get(index - 1);

        if (subList.isEmpty()) {
            System.out.println("No subcategories available in the selected category.");
            return;
        }

        System.out.println("Subcategories in category '" + categories.get(index - 1) + "':");
        for (int i = 0; i < subList.size(); i++) {
            System.out.println((i + 1) + ". " + subList.get(i));
        }
    }

    // CASE 8
    public static void displayPrices() {
        if (categories.isEmpty()) {
            System.out.println("No categories available. Please add categories first.");
            return;
        }

        System.out.println("Choose a category to see its subcategories prices:");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }

        System.out.print("Enter the number of the category: ");
        int index = getIntInput();
        scanner.nextLine();

        if (index < 1 || index > categories.size()) {
            System.out.println("Invalid category number. Please try again.");
            return;
        }

        ArrayList<String> subList = subCategories.get(index - 1);
        ArrayList<Integer> priceList = Prices.get(index - 1);

        if (subList.isEmpty()) {
            System.out.println("No subcategories available in the selected category.");
            return;
        }

        System.out.println("Subcategories and prices for category '" + categories.get(index - 1) + "':");
        for (int i = 0; i < subList.size(); i++) {
            String subCategory = subList.get(i);
            int price = priceList.get(i);
            System.out.println((i + 1) + ". " + subCategory + " - " + (price > 0 ? price + " kzt." : "Price not set"));
        }
    }

    public static void initializeData() {
        // Category 1
        categories.add("Fruits");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Bananas");
        fruits.add("Oranges");
        fruits.add("Grapes");
        fruits.add("Pineapples");
        subCategories.add(fruits);

        ArrayList<Integer> fruitPrices = new ArrayList<>();
        fruitPrices.add(25);
        fruitPrices.add(18);
        fruitPrices.add(22);
        fruitPrices.add(30);
        fruitPrices.add(45);
        Prices.add(fruitPrices);

        // Category 2
        categories.add("Vegetables");
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Carrots");
        vegetables.add("Potatoes");
        vegetables.add("Onions");
        vegetables.add("Cabbage");
        vegetables.add("Tomatoes");
        subCategories.add(vegetables);

        ArrayList<Integer> vegetablePrices = new ArrayList<>();
        vegetablePrices.add(12);
        vegetablePrices.add(15);
        vegetablePrices.add(10);
        vegetablePrices.add(20);
        vegetablePrices.add(25);
        Prices.add(vegetablePrices);

        // Category 3
        categories.add("Drinks");
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Fanta");
        drinks.add("Sprite");
        drinks.add("Water");
        drinks.add("Juice");
        subCategories.add(drinks);

        ArrayList<Integer> drinkPrices = new ArrayList<>();
        drinkPrices.add(14);
        drinkPrices.add(16);
        drinkPrices.add(13);
        drinkPrices.add(10);
        drinkPrices.add(20);
        Prices.add(drinkPrices);

        // Category 4
        categories.add("Snacks");
        ArrayList<String> snacks = new ArrayList<>();
        snacks.add("Chips");
        snacks.add("Cookies");
        snacks.add("Nuts");
        snacks.add("Popcorn");
        snacks.add("Chocolate");
        subCategories.add(snacks);

        ArrayList<Integer> snackPrices = new ArrayList<>();
        snackPrices.add(50);
        snackPrices.add(70);
        snackPrices.add(100);
        snackPrices.add(40);
        snackPrices.add(90);
        Prices.add(snackPrices);

        // Category 5
        categories.add("Dairy");
        ArrayList<String> dairy = new ArrayList<>();
        dairy.add("Milk");
        dairy.add("Cheese");
        dairy.add("Butter");
        dairy.add("Yogurt");
        dairy.add("Cream");
        subCategories.add(dairy);

        ArrayList<Integer> dairyPrices = new ArrayList<>();
        dairyPrices.add(25);
        dairyPrices.add(50);
        dairyPrices.add(40);
        dairyPrices.add(30);
        dairyPrices.add(35);
        Prices.add(dairyPrices);

        // Category 6
        categories.add("Bakery");
        ArrayList<String> bakery = new ArrayList<>();
        bakery.add("Bread");
        bakery.add("Buns");
        bakery.add("Croissants");
        bakery.add("Bagels");
        bakery.add("Cakes");
        subCategories.add(bakery);

        ArrayList<Integer> bakeryPrices = new ArrayList<>();
        bakeryPrices.add(15);
        bakeryPrices.add(10);
        bakeryPrices.add(20);
        bakeryPrices.add(25);
        bakeryPrices.add(50);
        Prices.add(bakeryPrices);

        System.out.println("Data initialized successfully!");
    }


    public static int getIntInput() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number. ");
                scanner.nextLine();
            }

        }
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------
class Client1 extends ProjectSdu1 {
    public static ArrayList<String> basket = new ArrayList<>();
    public static ArrayList<String> bankCard = new ArrayList<>();
    public static int totalCost = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("\n\n" + Admin1.welcomeMessage + "\n\n");
        while (true) {
            System.out.println("Client Mode Options:");
            System.out.println("1. Show Menu Categories");
            System.out.println("2. View basket");
            System.out.println("3. Add Bank Card");
            System.out.println("4. Checkout");
            System.out.println("5. Exit Client Mode");
            System.out.print("\nChoose an option: ");

            int choice = getIntInput();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    menuCat();
                    break;
                case 2:
                    viewBasket();
                    break;
                case 3:
                    addCard();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Exiting Client Mode...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // CASE 1
    public static void menuCat() {
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
            return;
        }

        for (int i = 0; i < categories.size(); i++) {
            String category = categories.get(i);
            System.out.println("\nCategory: " + category);

            ArrayList<String> subList = subCategories.get(i);
            ArrayList<Integer> priceList = Prices.get(i);

            if (subList.isEmpty()) {
                System.out.println("No subcategories available!");
                return;
            }

            for (int j = 0; j < subList.size(); j++) {
                String subCategory = subList.get(j);
                int price = priceList.get(j);
                System.out.println(" " + (j + 1) + ". " + subCategory + " - " + (price > 0 ? price + " kzt" : "Price not set"));
            }

            while (true) {
                System.out.print("\nSelect an item to add to your basket (or 0 to skip this category, 01 to go back): ");
                String input = scanner.nextLine();

                if (input.equals("01")) {
                    System.out.println("Exiting...");
                    return;
                }

                if (input.equals("0")) {
                    System.out.println("Skipping this category...");
                    break;
                }

                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    continue;
                }

                if (choice < 1 || choice > subList.size()) {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }

                String chosenSubCategory = subList.get(choice - 1);
                basket.add(chosenSubCategory);
                totalCost += priceList.get(choice - 1);
                System.out.println("You added " + chosenSubCategory + " from " + category + " to your basket.");
                break;
            }
        }

        System.out.println("\nYou have viewed all categories.");
    }

    // CASE 2
    public static void viewBasket() {
        if (basket.isEmpty()) {
            System.out.println("Your basket is empty.");
            return;
        }
        System.out.println("Items in your basket: \n");
        for (String chosenSubcategory : basket) {
            for (int categoryIndex = 0; categoryIndex < categories.size(); categoryIndex++) {
                ArrayList<String> subList = subCategories.get(categoryIndex);
                ArrayList<Integer> priceList = Prices.get(categoryIndex);

                if (subList.contains(chosenSubcategory)) {
                    int subCategoryIndex = subList.indexOf(chosenSubcategory);
                    int price = priceList.get(subCategoryIndex);

                    System.out.println((categoryIndex + 1) + ". " + chosenSubcategory + " - " + price + " kzt.");
                }
            }
        }
        System.out.println("\nTotal cost: " + totalCost + " kzt.");
    }

    // CASE 3
    public static void addCard() {
        System.out.print("Add bank card number (16 digits): ");
        String cardNumber = scanner.nextLine();
        if (cardNumber.length() != 16) {
            System.out.println("Invalid Digits. Enter 16 digits.");
            return;
        }
        System.out.print("Enter card expiration date (MM/YY): ");
        String cardExp = scanner.nextLine();
        if (!cardExp.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            System.out.println("Invalid expiration date.");
            return;
        }
        System.out.print("Enter CVV (3 digits): ");
        String cvv = scanner.nextLine();
        if (cvv.length() != 3) {
            System.out.println("Invalid CVV. Enter 3 digits");
            return;
        }
        bankCard.add(cardNumber);
        System.out.println("Bank card added successfully.");
    }

    // CASE 4
    public static void checkout() {
        if (basket.isEmpty()) {
            System.out.println("\nYour basket is empty. Add items before checking out.");
            return;
        }
        if (bankCard.isEmpty()) {
            System.out.println("\nFirst you need to add a card.");
            return;
        }

        System.out.println("\nChecking out with the following items: ");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        for (String chosenSubcategory : basket) {
            for (int categoryIndex = 0; categoryIndex < categories.size(); categoryIndex++) {
                ArrayList<String> subList = subCategories.get(categoryIndex);
                ArrayList<Integer> priceList = Prices.get(categoryIndex);

                if (subList.contains(chosenSubcategory)) {
                    int subCategoryIndex = subList.indexOf(chosenSubcategory);
                    int price = priceList.get(subCategoryIndex);

                    System.out.println(chosenSubcategory + " - " + price + " kzt.");
                }
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Total cost: " + totalCost + " kzt\n");
        System.out.println("Checkout complete. Thank you for shopping with us!");

        basket.clear();
        totalCost = 0;
    }

    public static int getIntInput() {
        while (true) {
            try {
                int choice = scanner.nextInt();
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number. ");
                scanner.nextLine();
            }

        }
    }
}