package util;

import model.OtherStaff;

public class StaffPositionChecker {
    public static boolean isValid(String position) {
        if (position == null) {
            System.out.println("Position can't be null");
            return false;
        } else if (position.isEmpty()) {
            System.out.println("Position can't be empty");
            return false;
        }

        position = position.toLowerCase();

        for (String validPosition : OtherStaff.POSITIONS) {
            if (position.equals(validPosition)) {
                return true;
            }
        }

        System.out.println("Status is incorrect: '" + position + "' is not a valid university title");

        System.out.print("Valid statues: ");
        for (String validPosition : OtherStaff.POSITIONS) {
            System.out.print(validPosition + ",");
        }

        System.out.println();
        return false;
    }
}
