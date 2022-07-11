import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;

        Scanner in = new Scanner(System.in);

        celsius = SafeInput.getDouble(in, "What is the temperature in celsius");

        fahrenheit = CtoF(celsius);
        System.out.println("The temperature in fahrenheit is " + fahrenheit);

        for (celsius = -100;  celsius<=100; celsius++) {
            System.out.printf("\n%-7.0f%-7.0f", celsius, CtoF(celsius));
        }
    }

    public static double CtoF(double celsius)
    {
        double fahrenheit = 0;

        fahrenheit = (celsius * 9/5) + 32;

        return fahrenheit;
    }
}
