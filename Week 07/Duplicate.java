import java.util.*;

class Dup {
    void check_dup(int[] dup) 
    {
        for (int i = 0; i < dup.length; i++) 
        {
            int count = 0;

            for (int j = i; j < dup.length; j++) 
            {
                if (dup[i] == dup[j]) 
                {
                    count += 1;
                }
            }

            if (count > 1) 
            {
                System.out.println("Element: " + dup[i] + " found " + count + " times");
            }
        }
    }
}

class Duplicate 
{
    private static Scanner sc = new Scanner(System.in);
    private static Dup d = new Dup();

    public static void main(String[] args) 
    {
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("\nEnter the element: ");
            arr[i] = sc.nextInt();
        }

        d.check_dup(arr);
    }
}
