import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party ="";
        System.out.print("Enter your party Affiliation [D-Democrat R-Republican I-Independent]: ");

        party = in.nextLine();

        if( party.equalsIgnoreCase("D"))
        {
            System.out.print( "You get a Democrat Donkey.!");
        }
        else if (party.equalsIgnoreCase("R"))
        {
            System.out.print("You get a Republican Elephant.!");
        }
        else if (party.equalsIgnoreCase("I"))
        {
            System.out.print("You get a Independent Man.!");
        }

        else
        {
            System.out.println("You enter Incorrect input: " +party);
            System.out.print("Try Again!");
        }
    }
}
