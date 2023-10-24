import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mobile number: ");
        String phNum = sc.nextLine();
        
        String countryCode = "";
        
        for (int i = 0; i < phNum.length(); i++)
        {
            countryCode += phNum.charAt(i);
        }

        if (countryCode.startsWith("00971"))
        {
            System.out.println("UAE Code");
            if (countryCode.startsWith("009715"))
            {
                System.out.println("Mobile Number");
            }
            else
            {
                System.out.println("Land line");
            }
        }

        else
        {
            System.out.println("Unrecognized Code");
        }

        sc.close();
    }
}
