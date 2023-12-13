import java.util.*;

class Table
{
    static void printTable(int n)
    {
        int[][] array = new int[n+1][n+1];

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < n + 1; j++)
            {
                array[i][j] = i * j;
            }
        }

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < n + 1; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

class TableProg
{
    private static Table t = new Table();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        t.printTable(n);
    }
}
