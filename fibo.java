import java.util.*;

class fibo {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        
        int num1 = 0, num2 = 1;
        int num3 = num1 + num2;
        
        System.out.print("\n" + num1 + " ," + num2 + " ," );

        for (int i = 0; i < terms; i++)
        {
            System.out.print(num3 + ", ");
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }

        sc.close();
    }
}
