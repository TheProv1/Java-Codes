import java.util.*;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String add) {
        this.address = add;
    }

    public void display() {
        System.out.println("Name: " + this.name + "\nAddress: " + this.address);
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String prog) {
        this.program = prog;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newyear) {
        this.year = newyear;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double newfee) {
        this.fee = newfee;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Program: " + this.program + "\nYear: " + this.year + "\nFee: " + this.fee);
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String sch) {
        this.school = sch;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double newpay) {
        this.pay = newpay;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("School: " + this.school + "\nPay: " + this.pay);
    }
}

class StaffStudent {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int optionmain = 0;

        System.out.print("\nEnter the student program: ");
        String studentprogram = sc.nextLine();

        System.out.print("\nEnter student year: ");
        int stuyear = sc.nextInt();
        sc.nextLine();

        System.out.print("\nEnter the student fee: ");
        double studentfee = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nEnter the Staff School: ");
        String staffschool = sc.nextLine();

        System.out.print("\nEnter the Staff pay: ");
        double staffpayment = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nEnter the Address: ");
        String universaladdress = sc.nextLine();

        System.out.print("\nEnter the Name: ");
        String universalname = sc.nextLine();

        Student student = new Student(universalname, universaladdress, studentprogram, stuyear, studentfee);
        Staff staff = new Staff(universalname, universaladdress, staffschool, staffpayment);

        while (optionmain != 3) {
            System.out.print("MAIN MENU \n\n\n1. Student \n2. Staff\n3. Exit \nEnter your choice: ");
            optionmain = sc.nextInt();
            sc.nextLine();

            if (optionmain == 1) {
                int studentoption = 0;
                
                while (studentoption != 7) {
                    System.out.print("STUDENT MENU\n\n1. Change name \n2. Change Program \n3. Change Year \n4. Change Address \n5. Change fee \n6. Display all details of student \n7.Return to previous menu \n8. Exit Program \nEnter your choice: ");
                    studentoption = sc.nextInt();
                    sc.nextLine();

                    if (studentoption == 1) {
                        System.out.print("\nEnter the new name: ");
                        String newname = sc.nextLine();
                        student.setName(newname);
                    } 

                    else if (studentoption == 2) {
                        System.out.print("\nEnter the new program: ");
                        String newprog = sc.nextLine();
                        student.setProgram(newprog);
                    } 
                    
                    else if (studentoption == 3) {
                        System.out.print("\nEnter the new year: ");
                        int newyear = sc.nextInt();
                        student.setYear(newyear);
                    } 
                    
                    else if (studentoption == 4) {
                        System.out.print("\nEnter the new address: ");
                        String newadd = sc.nextLine();
                        student.setAddress(newadd);
                    } 
                    
                    else if (studentoption == 5) {
                        System.out.print("\nEnter the new fee: ");
                        double newfee = sc.nextDouble();
                        student.setFee(newfee);
                    } 
                    
                    else if (studentoption == 6) {
                        student.display();
                    }
                    
                    else if (studentoption == 7){
                        break;
                    }
                    
                    else if (studentoption == 8){
                        System.exit(0);
                    }
                }
            } else if (optionmain == 2) {

                int teacheroption = 0;

                while (teacheroption != 5)
                {
                    System.out.print("STAFF MENU\n\n1. Change name \n2. Change School \n3. Change Address \n4. Change pay \n5. Display all Staff details \n6. Return to previous menu \n7. Exit Program \nEnter your choice: ");
                    teacheroption = sc.nextInt();
                    sc.nextLine();
                    
                    if (teacheroption == 1) {
                        System.out.print("\nEnter the new name: ");
                        String newname = sc.nextLine();
                        staff.setName(newname);
                    }
                    
                    else if (teacheroption == 2) {
                        System.out.print("\nEnter the new program: ");
                        String newschool = sc.nextLine();
                        staff.setSchool(newschool);
                    }
                    
                    else if (teacheroption == 3){
                        System.out.print("\nEnter the new Address: ");
                        String newaddress = sc.nextLine();
                        staff.setAddress(newaddress);
                    }
                    
                    else if (teacheroption == 4){
                        System.out.print("\nEnter the new pay");
                        double newpay = sc.nextDouble();
                        staff.setPay(newpay);
                    }
                    
                    else if (teacheroption == 5){
                        staff.display();
                    }
                    
                    else if (teacheroption == 6){
                        break;
                    }
                    
                    else if (teacheroption == 7){
                        System.exit(0);
                    }
                }    
            }
            
            else if (optionmain == 3){
                break;
            }
            
            else {
                System.exit(0);
            }
        }
    }
}
    
