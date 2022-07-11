import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        String RegEx = "";
        String SSN = "";
        String studentM = "";
        String menuChoice = "";

        Scanner in = new Scanner(System.in);

        SSN = SafeInput.getRegExString(in, "What is your SSN", "\\d{3}-\\d{2}-\\d{4}");
        studentM = SafeInput.getRegExString(in, "What is your UC Student M number", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, "Choose an option: Open, Save, View, Quit", "[OoSsVvQq]");

        System.out.println(SSN);
        System.out.println(studentM);
        System.out.println(menuChoice);
    }
}
