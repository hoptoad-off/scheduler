package management;

import model.OtherStaff;
import model.University;
import util.InputReader;
import util.EmailChecker;
import util.StaffPositionChecker;
import app.Scheduler;

public class StaffManage implements CRUD {
    private final InputReader inputReader = InputReader.instance;

    @Override
    public void add() {
        System.out.print("Enter Staff name: ");
        String name = inputReader.readLine();

        System.out.print("Enter Staff age: ");
        byte age = inputReader.readByte();

        System.out.print("Enter Staff email: ");
        String email = inputReader.readLine();
        email = Scheduler.checkAndGetValidEmail(email);

        System.out.print("Enter Staff position: ");
        String position = inputReader.readLine();

        while (!StaffPositionChecker.isValid(position)) {
            System.out.print("Enter Staff position: ");
            position = inputReader.readLine();
        }

        System.out.print("Enter Staff salary: ");
        int salary = inputReader.readInt();

        OtherStaff staff = new OtherStaff();
        staff.setName(name);
        staff.setPosition(position);
        staff.setEmail(email);
        staff.setAge(age);
        staff.setSalary(salary);

        int i = 0;
        while (University.staffs[i] != null) {
            i++;
        }

        University.staffs[i] = staff;
    }

    @Override
    public void remove() {
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();

        University.staffs[index] = null;
    }

    @Override
    public void printAll() {
        OtherStaff[] staffs = University.staffs;

        System.out.println("Staff List:");
        for (int i = 0; i < staffs.length; i++) {
            OtherStaff staff = staffs[i];

            if (staff != null) {
                System.out.println(i + "." + staff.toString());
            }
        }
    }
}