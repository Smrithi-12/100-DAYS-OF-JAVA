import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);
        String comparisonResult = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(comparisonResult);
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }

    private static String capitalizeFirstLetter(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }
}
