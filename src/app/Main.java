import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import app.Scheduler;

public class Main {
    private static final String PASSWORD = "1234";
    private static final byte MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte attempts = 0;

        do {
            System.out.print("Enter password: ");
            String passwordEntered = scanner.next();

            if (passwordEntered.equals(Main.PASSWORD)) {
                Scheduler.start();
                break;
            } else {
                System.out.println("Oops! Password is wrong!!!");
                attempts++;
                System.out.println("You have " + (MAX_ATTEMPTS - attempts) + " more attempts");
            }

        } while (attempts < MAX_ATTEMPTS);
    }
}