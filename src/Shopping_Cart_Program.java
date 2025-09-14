import java.util.Scanner;

public class Shopping_Cart_Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to shooping, type what u want to buy and how much of it!!");
        System.out.println(" ");
        System.out.println("1: zloty");
        System.out.println("2: euro");
        System.out.println("3: dollar");
        System.out.println("4: peso");
        System.out.print("Please choose the currency: ");

        String currency = scanner.nextLine();
        double rate = 1.0;

        if(currency.equals("1")){
            currency = "PLN";
            rate = 1.0;
        }else if(currency.equals("2")){
            currency = "EUR";
            rate = 4.5;
        }else if(currency.equals("3")){
            currency = "USD";
            rate = 3.75;
        }else if(currency.equals("4")){
            currency = "MXD";
            rate = 4.75;
        }else{
            System.out.println("Invalid choice, swithcing to defualt currency: 'PLN'");
            currency = "PLN";
            rate = 1.0;
        }

        double totalZloty = 0.0;
        double price = 7.8;

        while (true) {
            System.out.print("Enter what u want: ");
            String produce = scanner.nextLine();

            if(produce.equalsIgnoreCase("exit")){
                break;
            }

            System.out.print("Enter the quantity: ");
            double quantity = scanner.nextDouble();
            scanner.nextLine();

            double itemCost = quantity * price;
            totalZloty += itemCost;

            System.out.println("You've chosen : " + quantity + " of " + produce + " which cost is: " + itemCost);
            System.out.println("\nYou're current converted total is: " + (totalZloty * rate) + " " + currency);
            System.out.print("\nIf u want to continie type enter next product OR type 'exit' to close your cart");
        }

        System.out.println("You're total overAll is : " + (totalZloty * rate) + " " + currency);

        scanner.close();

    }
}
