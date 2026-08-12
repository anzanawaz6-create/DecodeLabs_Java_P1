import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DecodeLabs_Java_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int count = 0;
        int i = 1;

        int key = rand.nextInt(100) + 1;

        while (i <= 3) {
            try {
                System.out.println("Enter number");
                int target = sc.nextInt();

                if (target == key) {
                    System.out.println("you win");
                    count++;
                    System.out.println("total attempts are: " + count);
                    return;
                } else if (target < key) {
                    System.out.println("too low");
                } else {
                    System.out.println("too high");
                }

                count++;
                System.out.println("total attempt are: " + count);
                i++;

            } catch (InputMismatchException e) {
                System.out.println("Mismatch input");
                sc.nextLine();
                i++;
            }
        }

        if (i > 3) {
            System.out.println("Game over! The number was: " + key);
        }
    }
}