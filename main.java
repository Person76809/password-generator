import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(generateRandomPassword(length));
    }

    public static String generateRandomPassword(int length) {
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String allChars = upperChars + lowerChars + numbers;

        Random rand = new Random();
        char[] password = new char[length];

        password[0] = upperChars.charAt(rand.nextInt(upperChars.length()));
        password[1] = lowerChars.charAt(rand.nextInt(lowerChars.length()));
        password[2] = numbers.charAt(rand.nextInt(numbers.length()));

        for (int i = 3; i < length; i++) {
            password[i] = allChars.charAt(rand.nextInt(allChars.length()));
        }

        return new String(password);
    }
}
