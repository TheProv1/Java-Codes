import java.util.*;

public class Election {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int count_1 = 0;
        int count_err = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        int count_5 = 0;

        System.out.print("Enter the number of voters: ");
        int n = sc.nextInt();

        int votes[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("\nEnter your vote: ");
            votes[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            int t = votes[i];

            if (t == 1)
            {
                count_1 += 1;
            }

            else if (t == 2)
            {
                count_2 += 1;
            }

            else if (t == 3)
            {
                count_3 += 1;
            }

            else if (t == 4)
            {
                count_4 += 1;
            }

            else if (t == 5)
            {
                count_5 += 1;
            }

            else
            {
                count_err +=1;
            }
        }

        System.out.println("\n1: " + count_1 + "\n2: " + count_2 + "\n3: " + count_3 + "\n4: " + count_4 + "\n5: " + count_5 + "\nInvalid votes: " + count_err);
    }
}
