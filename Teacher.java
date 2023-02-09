package Assessment_3;

class Teacher{
    private String teacherName;
    private String subject;
    private double salary;

    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
}