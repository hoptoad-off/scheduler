package util;

import java.util.Scanner;

public class InputReader {
    public static final InputReader instance = new InputReader();
    private InputReader() {}
    private final Scanner SCANNER = new Scanner(System.in);
    public int readInt() { int value = SCANNER.nextInt(); SCANNER.nextLine(); return value; }
    public byte readByte() { byte value = SCANNER.nextByte(); SCANNER.nextLine(); return value; }
    public short readShort() { short value = SCANNER.nextShort(); SCANNER.nextLine(); return value; }
    public String readLine() { return SCANNER.nextLine(); }
    public boolean readBoolean() { return SCANNER.nextBoolean(); }
}