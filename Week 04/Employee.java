import java.util.*;

class Details {
    String ID, name;
    int Department;
    float allowance, totalSalary, basic;


}


class Employee{
    
    public static void emp()
    {
        Details det = new Details();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the name of the employee: ");
        det.name = sc.nextLine();

        System.out.print("\nEnter the employee ID: ");
        det.ID = sc.nextLine();

        System.out.print("\nEnter the Department number of the employee: ");
        det.Department = sc.nextInt();

        System.out.print("\nEnter the allowance: ");
        det.allowance = sc.nextFloat();

        System.out.print("\nEnter the basic salary: ");
        det.basic= sc.nextFloat();
        
        det.totalSalary = det.basic + det.allowance + ((float)0.4 * det.basic);

        sc.close();

        display_employee_details(det.ID, det.name, det.Department, det.totalSalary);
    }

    public static void display_employee_details(String id, String name, int dept, float totSal)
    {
        System.out.print("\nEmployee Name: "+ name + "\nEmployee ID: " + id + "\nDepartment: " + dept + "\nTotal Salary: " + totSal);
    }

    public static void main(String args[])
    {
        Employee.emp();
        
    }
}
