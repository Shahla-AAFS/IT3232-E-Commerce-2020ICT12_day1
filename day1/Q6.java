/* 6) Create a student class
	-create 5 student objects and store it in 
	a proper datastructure
- find the average marks of the students
*/
public class Q6 {
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        
        
        students[0] = new Student("John", 85);
        students[1] = new Student("Emily", 92);
        students[2] = new Student("Michael", 78);
        students[3] = new Student("Sarah", 95);
        students[4] = new Student("David", 88);
        
        
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        
        double averageMarks = totalMarks / students.length;
        System.out.println("Average marks of students: " + averageMarks);
        
       
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private double marks;
    
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }
    
    public double getMarks() {
        return marks;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}

/*PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1> javac Q6.java
PS E:\Academic\level 3 sem 2\EC IT3232\IT3232-E-Commerce-2020ICT12\day1> java Q6      
Average marks of students: 87.6

Student Details:
Student [name=John, marks=85.0]
Student [name=Emily, marks=92.0]
Student [name=Michael, marks=78.0]
Student [name=Sarah, marks=95.0]
Student [name=David, marks=88.0] */