import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        String trash = "";
        final int SHIP_COST_CUTOFF = 100;
        double shipCost = 0.0;
        double total = 0.0;
        final double SHIP_RATE = 0.02;
        System.out.print("Enter the item price: ");

        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

        }
        else // when they make the error
        {
            trash = in.nextLine();
            System.out.print("You must enter a valid Number not : " + trash);
            System.out.println(" Run program again with correct input!");
            System.exit(0);
        }
        if(itemPrice < SHIP_COST_CUTOFF)
        {
            shipCost = itemPrice * SHIP_RATE;
        }
        total = itemPrice + shipCost;

        System.out.println("Item Price: $ " +itemPrice );
        System.out.println("Shipping Cost: $ " +shipCost );
        System.out.println("Total Cost: $ " +total );

    }
}