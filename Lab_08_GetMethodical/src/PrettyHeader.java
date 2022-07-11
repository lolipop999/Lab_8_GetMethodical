import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        String msg = "";
        String prompt = "Enter Text";
        String prettyHeader = "";

        Scanner in = new Scanner(System.in);

        msg = SafeInput.getNonZeroLenString(in, prompt);

        prettyHeader = SafeInput.prettyHeader(msg);

        System.out.println(prettyHeader);

    }
}
