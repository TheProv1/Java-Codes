import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();
        s2 = s2.toLowerCase();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2))
        {
            System.out.println("Anagram");
        }

        else
        {
            System.out.println("Not an Anagram");
        }

        sc.close();
    }
}
