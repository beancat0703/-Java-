import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int length = input.length();
        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;

        for (int i = 0; i < length; i ++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letter ++;
            }
            else if (Character.isDigit(ch)) {
                number ++;
            }
            else if (Character.isSpaceChar(ch)) {
                space ++;
            }
            else {
                other ++;
            }
        }

        System.out.println(letter);
        System.out.println(number);
        System.out.println(space);
        System.out.println(other);
    }
}
