public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getRank() {
        if (grade < 0 || grade > 10) {
            return "Invalid grade";
        } else if (grade < 5.0) {
            return "Fail";
        } else if (grade < 6.5) {
            return "Medium";
        } else if (grade < 7.5) {
            return "Good";
        } else if (grade < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", " +
                "name='" + name + "', " +
                "grade=" + grade + ", " +
                "rank=" + getRank() + "}";
    }
}