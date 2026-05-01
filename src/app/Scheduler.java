package app;

import management.CohortManage;
import management.CourseManage;
import management.RoomManage;
import management.StaffManage;
import management.TeacherManage;
import model.Cafeteria;
import model.University;
import util.EmailChecker;
import util.InputReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scheduler {
    private static final InputReader inputReader = InputReader.instance;
    private static final StaffManage staffManage = new StaffManage();
    private static final CourseManage courseManage = new CourseManage();
    private static final CohortManage cohortManage = new CohortManage();
    private static final TeacherManage teacherManage = new TeacherManage();
    private static final RoomManage roomManage = new RoomManage();
    private static final Cafeteria cafeteria = new Cafeteria();

    static {
        System.out.println("Welcome to Scheduling System");
        System.out.println("University name: " + University.UNIVERSITY_NAME);
        System.out.println("Location: " + University.LOCATION);
        System.out.println("Website: " + University.WEBSITE);
        System.out.println("Official language: " + University.OFFICIAL_LANGUAGE);
    }

    public static void start() {
        int input;
        do {
            System.out.println("********Main Menu*******");
            System.out.println("1. Cohorts");
            System.out.println("2. Courses");
            System.out.println("3. Teachers");
            System.out.println("4. Rooms");
            System.out.println("5. Other Staff");
            System.out.println("6. Cafeteria Management");


            System.out.print("Enter number(O.Exit): ");
            input = inputReader.readInt();
            switch (input) {
                case 0:
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    manageCohorts();
                    break;
                case 2:
                    manageCourses();
                    break;
                case 3:
                    manageTeachers();
                    break;
                case 4:
                    manageRooms();
                    break;
                case 5:
                    manageStaff();
                    break;
                case 6:
                    manageCafeteria();
                    break;
                default:
                    System.out.println("Wrong Number!");
            }

        } while (input != 0);
    }

    private static void manageCafeteria() {
        int input;
        do {
            System.out.println("**** Cafeteria Management Menu ****");
            System.out.println("Does cafeteria work right now: " + cafeteria.checkStatus());

            if (!cafeteria.isActive()){
                System.out.println("(It is their breaktime right now!)");
            }

            cafeteria.showWorkTime();

            System.out.println("1. Change Status to " + !cafeteria.isActive());
            System.out.print("Enter number (O.Back): ");
            input = inputReader.readInt();

            switch (input) {
                case 1:
                    cafeteria.setActive(!cafeteria.isActive());
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        } while (input != 0);
    }

    private static void manageStaff() {
        int input;
        do {
            System.out.println("**** Staff Management Menu ****");
            System.out.println("1. Show Staff");
            System.out.println("2. Add Staff Member");
            System.out.println("3. Remove Staff Member");
            System.out.print("Enter number (O.Back): ");
            input = inputReader.readInt();

            switch (input) {
                case 1:
                    staffManage.printAll();
                    break;
                case 2:
                    staffManage.add();
                    break;
                case 3:
                    staffManage.remove();
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        } while (input != 0);
    }


    private static void manageCohorts() {
        try {
            int input;
            do {
                System.out.println("**** Cohort Management Menu ****");
                System.out.println("1. Show Cohorts");
                System.out.println("2. Add Cohort");
                System.out.println("3. Remove Cohort");
                System.out.print("Enter number (O.Back): ");
                input = inputReader.readInt();

                switch (input) {
                    case 1:
                        cohortManage.printAll();
                        break;
                    case 2:
                        cohortManage.add();
                        break;
                    case 3:
                        cohortManage.remove();
                        break;
                    default:
                        System.out.println("Wrong Number");
                }
            } while (input != 0);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception");
            manageCourses();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            manageCourses();
        }
    }

    private static void manageCourses() {
        Scanner inputReader = new Scanner(System.in);
        int input;
        do {
            System.out.println("**** Courses Management Menu ****");
            System.out.println("1. Show Courses");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Course");
            System.out.print("Enter number (O.Back): ");
            input = inputReader.nextInt();

            switch (input) {
                case 1:
                    courseManage.printAll();
                    break;
                case 2:
                    courseManage.add();
                    break;
                case 3:
                    courseManage.remove();
                    break;
                default:
                    System.out.println("Wrong number");
            }
        } while (input != 0);
    }

    private static void manageTeachers() {
        int input;
        do {
            System.out.println("**** Teacher Management Menu ****");
            System.out.println("1. Show Teachers");
            System.out.println("2. Add Teacher");
            System.out.println("3. Remove Teacher");
            System.out.print("Enter number (O.Back): ");
            input = inputReader.readInt();

            switch (input) {
                case 1:
                    teacherManage.printAll();
                    break;
                case 2:
                    teacherManage.add();
                    break;
                case 3:
                    teacherManage.remove();
                    break;
                default:
                    System.out.println("Wrong number");
            }
        } while (input != 0);
    }

    private static void manageRooms() {
        int input;
        do {
            System.out.println("**** Room Management Menu ****");
            System.out.println("1. Show Rooms");
            System.out.println("2. Add Room");
            System.out.println("3. Remove Room");
            System.out.print("Enter number (O.Back): ");
            input = inputReader.readInt();

            switch (input) {
                case 1:
                    roomManage.printAll();
                    break;
                case 2:
                    roomManage.add();
                    break;
                case 3:
                    roomManage.remove();
                    break;
                default:
                    System.out.println("Wrong number");
            }
        } while (input != 0);
    }


    public static String checkAndGetValidEmail(String email) {
        if (EmailChecker.isValid(email)) {
            return email;
        }

        System.out.print("Enter teacher's email: ");
        email = inputReader.readLine();

        return checkAndGetValidEmail(email);
    }
}