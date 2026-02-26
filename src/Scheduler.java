import java.util.Scanner;

public class Scheduler {
    private static final InputReader inputReader = new InputReader();

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
            System.out.println("Does cafeteria work right now:" + Cafeteria.isActive());

            System.out.println("1. Change Status to " + !Cafeteria.isActive());
            System.out.print("Enter number (O.Back): ");
            input = inputReader.readInt();

            switch (input) {
                case 1:
                    Cafeteria.setActive(!Cafeteria.isActive());
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
                    StaffManage.printAll();
                    break;
                case 2:
                    StaffManage.add();
                    break;
                case 3:
                    StaffManage.remove();
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        } while (input != 0);
    }


    private static void manageCohorts() {
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
                    showCohorts();
                    break;
                case 2:
                    addCohort();
                    break;
                case 3:
                    removeCohort();
                    break;
                default:
                    System.out.println("Wrong Number");
            }
        } while (input != 0);
    }

    private static void showCohorts() {
        University.printCohorts();
    }

    private static void addCohort() {

    }

    private static void removeCohort() {
        Scanner inputReader = new Scanner(System.in);

        showCohorts();

        System.out.println("Enter the index:");
        int index = inputReader.nextInt();

        University.removeCohort(index);
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
                    CourseManage.printAll();
                    break;
                case 2:
                    CourseManage.add();
                    break;
                case 3:
                    CourseManage.remove();
                    break;
                default:
                    System.out.println("Wrong number");
            }
        } while (input != 0);
    }

    private static void showCourses() {
        University.printCourses();
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
                    TeacherManage.printAll();
                    break;
                case 2:
                    TeacherManage.add();
                    break;
                case 3:
                    TeacherManage.remove();
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
                    RoomManage.printAll();
                    break;
                case 2:
                    RoomManage.add();
                    break;
                case 3:
                    RoomManage.remove();
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
