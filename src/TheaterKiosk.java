import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your Age: ");

        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(" You Must Enter Valid Age: " + trash);
            System.out.println("Try Again!");
            System.exit(0);

        }
        if (age >= 21)
        {
            System.out.println("You will get Paper Wrist band!");
        }
        else
        {
            System.out.println("Sorry! you don't wrist Band! ");
        }

    }
}
