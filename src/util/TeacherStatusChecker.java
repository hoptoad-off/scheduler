package util;

import model.Teacher;

public class TeacherStatusChecker {
    public static boolean isValid(String status) {
        if (status == null) { System.out.println("Status can't be null"); return false; }
        else if (status.isEmpty()) { System.out.println("Status can't be empty"); return false; }
        status = status.toLowerCase();
        for (String validStatus : Teacher.STATUSES) { if (status.equals(validStatus)) return true; }
        System.out.println("Status is incorrect: '" + status + "' is not a valid university title");
        System.out.print("Valid statues: ");
        for (String validStatus : Teacher.STATUSES) { System.out.print(validStatus + ","); }
        System.out.println();
        return false;
    }
}