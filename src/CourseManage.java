public class CourseManage implements CRUD {
    private final Course[] courses = University.courses;
    private final InputReader inputReader = InputReader.instance;

    @Override
    public void add() {
        System.out.print("Enter course id: ");
        String id = inputReader.readLine();

        System.out.print("Enter course name: ");
        String name = inputReader.readLine();

        System.out.print("Enter course's credits: ");
        byte credits = inputReader.readByte();

        System.out.print("Enter course's sessions per week: ");
        byte sessionsPerWeek = inputReader.readByte();

        int i = 0;

        Course course = new Course();

        course.setCode(id);
        course.setName(name);
        course.setCredits(credits);
        course.setSessionsPerWeek(sessionsPerWeek);

        //finding empty index
        while (courses[i] != null) {
            i++;
        }
        courses[i] = course;
    }

    @Override
    public void remove() {
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();

        courses[index] = null;
    }

    @Override
    public void printAll() {
        System.out.println("Staff List:");
        for (int i = 0; i < courses.length; i++) {
            Course course = courses[i];

            if (course != null) { //to avoid NullPointerException
                System.out.println(i + "." + course.toString());
            }
        }
    }
}
