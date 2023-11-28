import java.util.*;

class SumThread extends Thread {
    private int start;
    private int end;
    private int[] arr;
    private long partialSum;

    public SumThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
        this.partialSum = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += arr[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class ThreadSum {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the total number of elements (num): ");
        int num = scanner.nextInt();
        System.out.print("Enter the number of threads (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int[] numbers = new int[num];
        
        for (int i = 0; i < num; i++) {
            numbers[i] = i + 1;
        }

        
        int range = num / n;

        SumThread[] threads = new SumThread[n];
        int start = 0;
        int end = range;

        
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                end = num - 1;
            }
            threads[i] = new SumThread(start, end, numbers);
            threads[i].start();
            start = end + 1;
            end += range;
        }

        
        try {
            for (int i = 0; i < n; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += threads[i].getPartialSum();
        }

        
        System.out.println("The sum of numbers from 1 to " + num + " using " + n + " threads is: " + totalSum);
    }
}
