package model;

public class OtherStaff extends Staff{
    private String position;

    public static final String[] POSITIONS = {
            "administration",
            "security",
            "canteen",
            "medical"
    };

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
