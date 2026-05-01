package model;

public class Student {
    String name;
    byte age;
    String gender;
    String degree;
    double tuitionFee;
    boolean isTuitionFeePayed;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", degree='" + degree + '\'' +
                ", tuitionFee=" + tuitionFee +
                ", isTuitionFeePayed=" + isTuitionFeePayed +
                '}';
    }
}
