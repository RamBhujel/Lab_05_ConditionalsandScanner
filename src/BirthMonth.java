import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter The Birth Month [1-12]: ");


        if (in.hasNextDouble()) {
            birthMonth = in.nextInt();
            in.nextLine();

        } else // when they make the error
        {
            trash = in.nextLine();
            System.out.print("You must enter a valid number [1-12] : " + trash);
            System.out.println(" Run program again with correct number!");
            System.exit(0);
        }
        if (birthMonth == 1)
        {
            System.out.println("Your Birth Month is: January.");
        }
        else if (birthMonth == 2)
        {
            System.out.println("Your Brith Month is: February");
        }
        else if (birthMonth == 3)
        {
            System.out.println("Your Brith Month is: March");
        }
        else if (birthMonth == 4)
        {
            System.out.println("Your Brith Month is: April");
        }
        else if (birthMonth == 5)
        {
            System.out.println("Your Brith Month is: May");
        }
        else if (birthMonth == 6)
        {
            System.out.println("Your Brith Month is: June");
        }
        else if (birthMonth == 7)
        {
            System.out.println("Your Brith Month is: july");
        }
        else if (birthMonth == 8)
        {
            System.out.println("Your Brith Month is: August");
        }
        else if (birthMonth == 9)
        {
            System.out.println("Your Brith Month is: September");
        }
        else if (birthMonth == 10)
        {
            System.out.println("Your Brith Month is: October");
        }
        else if (birthMonth == 11)
        {
            System.out.println("Your Brith Month is: November");
        }
        else if (birthMonth == 12) {
            System.out.println("Your Brith Month is: December");
        }
        else
        {
            System.out.println("You Enter an incorrect Month value: " + birthMonth);
        }


    }
}
