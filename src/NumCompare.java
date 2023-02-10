import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        String trash = "";

        System.out.print("Enter First Integer: ");


        if (in.hasNextInt())
        {


            number1 = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(" the input is not valid: " + trash);
            System.out.println("Try Again!");
            System.exit(0);

        }
        System.out.print("Enter Second Integer: ");


        if(in.hasNextInt())
        {
            number2 = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(" the input is not valid: " + trash);
            System.out.println("Try Again!");
            System.exit(0);

        }


        if(number1 == number2)
        {
            System.out.println("The " + number1 + " and " + number2 + " are equall." );
        }
        else if(number1 > number2)
        {
            System.out.println("The " + number1 + " is greater than " + number2 );
        }
        else
        {
            System.out.println("The " + number1 + " is less than " + number2 );
        }
    }
}
