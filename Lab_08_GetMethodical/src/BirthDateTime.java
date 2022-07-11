import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        int birthYear = 0;
        int low = 1950;
        int high = 2010;
        String prompt = "What is your birth year";

        Scanner in = new Scanner(System.in);

        birthYear = SafeInput.getRangedInt(in, prompt, low, high);

        int birthMonth = 0;
        low = 1;
        high = 12;
        prompt = "What is your birth month";

        birthMonth = SafeInput.getRangedInt(in, prompt, low, high);

        int birthDay = 0;
        low = 1;
        switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12: high = 31;
            break;
            case 6, 9, 11: high = 30;
            break;
            case 2:
                if (birthYear % 4 == 0) {
                    high = 29;
                }
                else {
                    high = 28;
                }
            break;
        }
        prompt = "What is your birth day";

        birthDay = SafeInput.getRangedInt(in, prompt, low, high);

        int birthHour = 0;
        low = 1;
        high = 24;
        prompt = "What is your birth hour";

        birthHour = SafeInput.getRangedInt(in, prompt, low, high);

        int birthMinute = 0;
        low = 0;
        high = 59;
        prompt = "What is your birth minute";

        birthMinute = SafeInput.getRangedInt(in, prompt, low, high);

        System.out.println("You were born: " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
