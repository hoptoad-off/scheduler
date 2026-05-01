package model;

abstract class Staff {
    public String name;
    public byte age;
    public String email;
    public double salary;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Nobody works for minus");
        } else if (salary == 0) {
            System.out.println("Slave");
        } else {
            if (salary < 500) {
                System.out.println("That’s below minimum wage!");
                this.salary = salary;
            } else if (salary >= 500 && salary < 3000) {
                System.out.println("Average salary");
                this.salary = salary;
            } else if (salary >= 3000 && salary < 10000) {
                System.out.println("High salary");
                this.salary = salary;
            } else {
                if (salary >= 10000 && salary < 100000) {
                    System.out.println("Are you a rector or what?");
                    this.salary = salary;
                } else {
                    System.out.println("Unrealistic salary value");
                }
            }
        }
    }
    public byte getAge() { return age; }
    public void setAge(byte age) { if (age <= 0) System.out.println("Impossible"); else this.age = age; }
    public String toString() { return "Staff{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + '}'; }
}