package util;

public class EmailChecker {
    public static boolean isValid(String email) {
        if (email == null || email.isEmpty()) { System.out.println("Email can't be null or empty"); return false; }
        if (!email.contains("@")) { System.out.println("Email must contain '@' symbol"); return false; }
        if (email.startsWith("@") || email.endsWith("@")) { System.out.println("Email is incorrect: '@' symbol can't be at start or at the end"); return false; }
        String[] parts = email.split("@");
        if (parts.length != 2) { System.out.println("Email is incorrect: there must be only one '@' symbol"); return false; }
        String domainPart = parts[1];
        if (!domainPart.contains(".")) { System.out.println("Email is incorrect: domen must contain '.' symbol"); return false; }
        if (domainPart.startsWith(".") || domainPart.endsWith(".")) { System.out.println("Email is incorrect: '.' symbol can't be at start or at the end"); return false; }
        return true;
    }
}