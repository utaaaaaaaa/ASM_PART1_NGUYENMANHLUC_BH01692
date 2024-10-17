class StudentStack {
    private Node top; // Top of the stack
    private int size; // To keep track of the number of elements

    // Node class to represent each student in the stack
    private class Node {
        Student student; // The student data
        Node next;      // Pointer to the next node

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    // Constructor
    public StudentStack() {
        top = null; // Stack is initially empty
        size = 0;   // Initial size is 0
    }

    // Push a student onto the stack
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top; // Point new node to the previous top
        top = newNode;      // Update top to be the new node
        size++;
        System.out.println("Inserted: " + student);
    }

    // Pop a student from the stack
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Student poppedStudent = top.student; // Get the student from the top node
        top = top.next;                     // Move top to the next node
        size--;
        return poppedStudent;
    }

    // Peek at the top student
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.student; // Return the student at the top node
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null; // Stack is empty if top is null
    }

    // Get the size of the stack
    public int size() {
        return size; // Return current size of the stack
    }

    // Display all students in the stack
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students in the stack.");
            return;
        }

        System.out.println("Students in Stack:");
        Node current = top;  // Start from the top node
        while (current != null) {
            System.out.println(current.student);
            current = current.next; // Move to the next node
        }
    }

    // Update an existing student's details
    public void updateStudent(int id, String newName, double newGrade) {
        Node current = top;
        boolean found = false;

        while (current != null) {
            if (current.student.getId() == id) {
                current.student = new Student(id, newName, newGrade);
                found = true;
                break;
            }
            current = current.next; // Move to the next node
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Search for a student by ID
    public Student searchStudent(int id) {
        Node current = top;

        while (current != null) {
            if (current.student.getId() == id) {
                return current.student; // Return the found student
            }
            current = current.next; // Move to the next node
        }
        return null; // Not found
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        Node current = top;
        Node previous = null;

        while (current != null) {
            if (current.student.getId() == id) {
                if (previous == null) {
                    top = current.next; // Remove top node
                } else {
                    previous.next = current.next; // Bypass the current node
                }
                size--;
                System.out.println("Deleted student with ID " + id);
                return;
            }
            previous = current;
            current = current.next; // Move to the next node
        }

        System.out.println("Student with ID " + id + " not found.");
    }
}