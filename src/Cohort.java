package model;

public class Cohort {
    public static final byte MAX_STUDENTS = 48; // It is university requirement
    public Course[] getCourses;
    private String name;
    private Student[] students;
    private String major;
    private int id;
    private boolean isStudying;

    private Course[] courses;

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStudying() {
        return isStudying;
    }

    public void setStudying(boolean studying) {
        isStudying = studying;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public Course[] getCourses() {
        return courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void printStudents() {
        System.out.println("Student list:");

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.toString());
        }

        System.out.println("End of student list");
    }

    public void printCourses() {
        System.out.println("Course list:");
        int totalCredits = 0;
        for (int i = 0; i < courses.length; i++) {
            Course course = courses[i];
            System.out.println(course.toString());
            totalCredits += course.getCredits();
        }
        System.out.println("Total credits: " + totalCredits);
        System.out.println("End of course list");
    }

    public String toString() {
        return "Cohort{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", id=" + id +
                ", isStudying=" + isStudying +
                '}';
    }
}
