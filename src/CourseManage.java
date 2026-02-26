public class CourseManage implements UniversityManage {
    public static void add(){
        System.out.print("Enter course id: ");
        String id = inputReader.readLine();

        System.out.print("Enter course name: ");
        String name = inputReader.readLine();

        System.out.print("Enter course's credits: ");
        byte credits = inputReader.readByte();

        System.out.print("Enter course's credits: ");
        byte sessionsPerWeek = inputReader.readByte();

        University.addCourse(name, credits, id, sessionsPerWeek);
    }
    public static void remove(){
        printAll();

        System.out.println("Enter the index:");
        int index = inputReader.readInt();

        University.removeCohort(index);
    }
    public static void printAll(){
        Course[] courses = University.courses;

        System.out.println("Staff List:");
        for (int i = 0; i < courses.length; i++) {
            Course course = courses[i];

            if (course != null) { //to avoid NullPointerException
                System.out.println(i + "." + course.toString());
            }
        }
    }
}
