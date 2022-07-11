import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double priceOfItem = 0;
        double totalPrice = 0;
        double low = .50;
        double high = 9.99;

        String prompt = "What is the cost of your item";
        String prompt2 = "Do you want to continue adding items";

        boolean moreItems = true;

        Scanner in = new Scanner(System.in);

        do {
            priceOfItem = SafeInput.getRangedDouble(in, prompt, low, high);
            totalPrice = priceOfItem + totalPrice;
            moreItems = SafeInput.getYNConfirm(in, prompt2);
        }
        while (moreItems);

        System.out.printf("\nYour total price is " + "%-10.2f", totalPrice);
    }
}
