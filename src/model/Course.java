package model;

public class Course {
    private String name;
    private byte credits;
    private String code;
    private byte sessionsPerWeek;

    public String getCode() { return code; }
    public int getSessionsPerWeek() { return sessionsPerWeek; }
    public void setSessionsPerWeek(byte sessionsPerWeek) { this.sessionsPerWeek = sessionsPerWeek; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public byte getCredits() { return credits; }
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", code='" + code + '\'' +
                '}';
    }
    public void setCredits(byte credits) {
        if (credits <= 0) {
            if (credits < 0) System.out.println("invalid credit");
            if (credits == 0) System.out.println("Still wrong");
        } else {
            this.credits = credits;
        }
    }
}