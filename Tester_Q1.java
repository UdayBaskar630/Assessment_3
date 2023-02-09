package Assessment_3;


class Tester_Q1 {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[4];

        teachers[0] = new Teacher("John Doe", "Mathematics", 50000);
        teachers[1] = new Teacher("Jane Doe", "Science", 55000);
        teachers[2] = new Teacher("Bob Smith", "English", 45000);
        teachers[3] = new Teacher("Alice Johnson", "History", 52000);

        for (int i = 0; i < teachers.length; i++) {
            System.out.println("Teacher Name: " + teachers[i].getTeacherName());
            System.out.println("Subject: " + teachers[i].getSubject());
            System.out.println("Salary: $" + teachers[i].getSalary());
            System.out.println();
        }
    }
}