package model;

public class Teacher extends Staff{

    public static final String[] STATUSES = {
            "professor",
            "associate professor",
            "assistant professor",
            "lecturer",
            "researcher",
            "doctor",
            "phd student",
            "dean",
            "rector",
            "teacher",
            "assistant"
    };


    private short officeNumber;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(short officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}