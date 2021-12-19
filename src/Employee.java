public class Employee {
    private String surnameName;
    private int age;
    private String position;
    private String email;
    private double salary;
    private String phone;

    public int getAge() {
        return age;
    }

    public Employee(String surnameName, int age, String position, String email, double salary, String phone) {
        this.surnameName = surnameName;
        this.age = age;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surnameName='" + surnameName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void printEmployee() {
        System.out.println(this);
    }
}
