import java.util.*;

class PensionContributionCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double employeepercentage = 0;
        double employerpercentage = 0;
        double employeecontribution = 0;
        double employercontribution = 0;
        double totalcontribution = 0;

        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nEnter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age <= 55){
            employeepercentage = 0.20;
            employerpercentage = 0.17;
            
            if (salary > 6000){
                employeecontribution = (6000 * employeepercentage);
                employercontribution = (6000 * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }

            else{
                employeecontribution = (salary * employeepercentage);
                employercontribution = (salary * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }
        }

        else if (age > 55 && age <=60){
            employeepercentage = 0.13;
            employerpercentage = 0.13;
            
            if (salary > 6000){
                employeecontribution = (6000 * employeepercentage);
                employercontribution = (6000 * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }

            else{
                employeecontribution = (salary * employeepercentage);
                employercontribution = (salary * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }
        }

        else if (age > 60 && age <= 65){
            employeepercentage = 0.075;
            employerpercentage = 0.09;
            
            if (salary > 6000){
                employeecontribution = (6000 * employeepercentage);
                employercontribution = (6000 * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }

            else{
                employeecontribution = (salary * employeepercentage);
                employercontribution = (salary * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }
        }

        else {
            employeepercentage = 0.05;
            employerpercentage = 0.075;
            
            if (salary > 6000){
                employeecontribution = (6000 * employeepercentage);
                employercontribution = (6000 * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }

            else{
                employeecontribution = (salary * employeepercentage);
                employercontribution = (salary * employerpercentage);

                totalcontribution = employeecontribution + employercontribution;
            }
        }

        System.out.println("Employer Contribution: $" + String.format("%.2f", employercontribution) + "\nEmployee Contribution: $" + String.format("%.2f", employeecontribution) + "\nTotal Contribution: $" + String.format("%.2f", totalcontribution) );

        scanner.close();
    }
}