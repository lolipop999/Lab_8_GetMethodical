import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
       double cost = 0;

        Scanner in = new Scanner(System.in);

        cost = getRangedDouble(in, "Enter the cost", 0.00, 100.00);
    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        // declaring variables
        double retRangedDouble = 0;
        String trash = "";
        boolean gotRangedDouble = false;

        do // loop that confirms user inputs double
        {
            // show prompt
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            // checking if input is double

            if (pipe.hasNextDouble()) // is double
            {
                // setting input to the variable
                retRangedDouble = pipe.nextDouble();
                pipe.nextLine();

                if (retRangedDouble >= low && retRangedDouble <= high) // if double is in range
                {
                    // exit loop
                    gotRangedDouble = true;
                }
                else // double not in range
                {
                    System.out.println("Please enter a double within range [" + low + " - " + high + "]: " + retRangedDouble);

                    gotRangedDouble = false;
                }

            }
            else // not double
            {
                // set input to trash
                trash = pipe.nextLine();

                // show user their incorrect input
                System.out.println("Please enter a double within range [" + low + " - " + high + "]: " + trash);

                // stay in loop
                gotRangedDouble = false;
            }
        }
        while(!gotRangedDouble);

        return retRangedDouble;

    }
}

