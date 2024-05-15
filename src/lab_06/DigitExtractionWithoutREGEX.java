package lab_06;

public class DigitExtractionWithoutREGEX {

    public static void main(String[] args) {
        String myStr = "100 minutes and 45 seconds";
        char[] splitMyStr = myStr.toCharArray();

        String resultStr = "";

        for (char c : splitMyStr) {
            if (Character.isDigit(c)) {
                resultStr += c;
            }
        }

        System.out.println(resultStr);
    }
}
