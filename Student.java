import java.util.*;

class Student {
    String name;
    int age;
    int year;
    String idNo;

    public Student(String name, int age, int year, String idNo) throws IllegalArgumentException {
        setName(name);
        setAge(age);
        setYear(year);
        setIdNo(idNo);
    }

    public void setName(String name) throws IllegalArgumentException {
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Invalid name format. Name should contain only letters.");
        }
        this.name = name;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age >= 35) {
            throw new IllegalArgumentException("Age should be less than 35.");
        }
        this.age = age;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Invalid year. Year should be between 1 and 4.");
        }
        this.year = year;
    }

    public void setIdNo(String idNo) throws IllegalArgumentException {
        if (idNo.length() != 6 || !idNo.matches("[a-zA-Z]\\d{4}[a-zA-Z]")) {
            throw new IllegalArgumentException("Invalid ID number format. Should be in the format f0102U.");
        }
        this.idNo = idNo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.println("Enter the name of the student: ");
            String name = scanner.nextLine();

            System.out.println("Enter the age of the student: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the current year of the student: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the ID Number of the student: ");
            String idno = scanner.nextLine();
            
            Student student = new Student(name, age, year, idno);
            System.out.println("Student created successfully!");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
    }
}
