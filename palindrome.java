
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            while (true) {

                System.out.println("Enter number : ");

                int x = sc.nextInt();

                if (x < 0) {

                    System.out.println("Negetive number !!");

                    return;

                }

                int org = x;
                int rev = 0;

                while (x != 0) {

                    int dig = x % 10;

                    rev = rev * 10 + dig;

                    x = x / 10;

                }

                if (org == rev) {

                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }
}