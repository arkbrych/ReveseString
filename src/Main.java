import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz słowo, które chcesz odwrócić");
        String word = input.nextLine();

        System.out.println(reverse(word));

    }

    static String reverse(String word) {

        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        return rev;
    }

}

