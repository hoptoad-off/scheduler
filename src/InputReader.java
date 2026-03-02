import java.util.Scanner;

public class InputReader {
    private final Scanner SCANNER = new Scanner(System.in);

    public int readInt() {
        int value = SCANNER.nextInt();
        SCANNER.nextLine();
        return value;
    }

    public byte readByte() {
        byte value = SCANNER.nextByte();
        SCANNER.nextLine();
        return value;
    }

    public short readShort() {
        short value = SCANNER.nextShort();
        SCANNER.nextLine();
        return value;
    }

    public String readLine() {
        return SCANNER.nextLine();
    }

    public boolean readBoolean() {
        while (true) {
            try {
                boolean value = SCANNER.nextBoolean();
                SCANNER.nextLine();
                return value;
            } catch (java.util.InputMismatchException e) {
                SCANNER.nextLine(); // Clear the invalid input
                System.out.print("Invalid input. Please enter 'true' or 'false': ");
            }
        }
    }
}
