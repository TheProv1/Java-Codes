import java.util.*;

public class BToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        StringTokenizer strTok = new StringTokenizer(str1);

        System.out.println("Tokens with B:");

        while (strTok.hasMoreTokens() == true)
        {
            String t = strTok.nextToken();
            if (t.startsWith("b") || t.startsWith("B"))
            {
                System.out.println(t);
            }
        }
        
        sc.close();
    }
}