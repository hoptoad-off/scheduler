public class TeacherManage implements CRUD {
    public void add() {
        System.out.print("Enter teacher's name: ");
        String name = inputReader.readLine();

        System.out.print("Enter teacher's age: ");
        byte age = inputReader.readByte();

        System.out.print("Enter teacher's status: ");
        String status = inputReader.readLine();

        while (!TeacherStatusChecker.isValid(status)) {
            System.out.print("Enter teacher's status: ");
            status = inputReader.readLine();
        }

        System.out.print("Enter teacher's email: ");
        String email = inputReader.readLine();
        email = Scheduler.checkAndGetValidEmail(email);

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setStatus(status);
        teacher.setEmail(email);

        //finding empty index
        int i = 0;
        while (University.teachers[i] != null) {
            i++;
        }

        University.teachers[i] = teacher;
    }

    public void remove() {
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();

        University.teachers[index] = null;
    }

    public void printAll() {
        Teacher[] teachers = University.teachers;

        System.out.println("Teacher List:");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];

            if (teacher != null) { //to avoid NullPointerException
                System.out.println(i + "." + teacher.toString());
            }
        }
    }
}
