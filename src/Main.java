public class Main {
    public static void main(String[] args) {
        // Create a StudentStack instance
        StudentStack studentStack = new StudentStack();

        // Create some Student instances
        Student student1 = new Student(1, "Alice", 8.5);
        Student student2 = new Student(2, "Bob", 6.0);
        Student student3 = new Student(3, "Charlie", 9.2);

        // Push students onto the stack
        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);

        // Display all students in the stack
        studentStack.displayStudents();

        // Update a student's details
        studentStack.updateStudent(2, "Bob Smith", 7.5);

        // Search for a student
        Student foundStudent = studentStack.searchStudent(2);
        System.out.println("Found Student: " + foundStudent);

        // Pop a student from the stack
        Student poppedStudent = studentStack.pop();
        System.out.println("Popped Student: " + poppedStudent);

        // Display all students after popping one
        studentStack.displayStudents();

        // Delete a student by ID
        studentStack.deleteStudent(1);

        // Display all students after deletion
        studentStack.displayStudents();
    }
}