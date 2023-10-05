import java.util.*;

class MinMaxAvg
{
        private static Scanner sc = new Scanner(System.in);
        public static void main(String args[])
        {
                float min, max, average, sum = 0;
                float[] arr = new float[10];
                for (int i = 0; i < 10; i++)
                {
                        System.out.print("\nEnter a number: ");
                        arr[i] = sc.nextFloat();
                }

                min = arr[0];
                max = arr[0];

                for (int i = 0; i < 10; i++)
                {
                        if (arr[i] > max)
                        {
                                max = arr[i];
                        }

                        else if (arr[i] < min)
                        {
                                min = arr[i];
                        }

                        sum += arr[i];
                }

                average = sum/10;

                System.out.print("\nThe max element: " + max + "\nThe min element: " + min + "\nAverage: " + average);

        }
}
