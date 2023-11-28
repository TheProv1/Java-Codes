import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class Prime {
    int startRange;
    int endRange;

    public Prime(int startRange, int endRange) throws NegativeNumberException {
        if (startRange < 0 || endRange < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed in this code");
        }
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public void generatePrime() {
        for (int i = startRange; i <= endRange; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start range: ");
        int start = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the end range: ");
        int end = sc.nextInt();
        sc.nextLine();

        try {
            Prime prime = new Prime(start, end);
            prime.generatePrime();
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
