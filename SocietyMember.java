import java.util.*;

interface Member {
    String getName();
    String getAddress();
    int getFee();
}

class SeniorMember implements Member {
    int fee;
    String name;
    String address;

    public SeniorMember(String name, String address, double fee) {
        this.name = name;
        this.address = address;
        this.fee = (int)fee; 
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFee() {
        return fee;
    }
}

class StandardMember implements Member {
    int fee;
    String name;
    String address;

    public StandardMember(String name, String address) {
        this.name = name;
        this.address = address;
        this.fee = 100; 
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFee() {
        return fee;
    }
}


class Society {
    private ArrayList<Member> members;

    public Society() {
        this.members = new ArrayList<>();
    }

    public void addMember(String name, String address) {
        Member newMember = new StandardMember(name, address);
        members.add(newMember);
    }

    public void addSeniorMember(String name, String address, double fee) {
        Member newMember = new SeniorMember(name, address, fee);
        members.add(newMember);
    }

    public double getFeeTotal() {
        double totalFee = 0.00;
        for (Member member : members) {
            totalFee += member.getFee();
        }
        return totalFee;
    }
}



public class SocietyMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Society society = new Society();
        
        int menuoption = 0;
        
        System.out.print("Menu\n1. Standard Member\n2. SeniorMember\nEnter your choice: ");
        menuoption = sc.nextInt();
        sc.nextLine();

        if (menuoption == 1){
            System.out.print("Enter the name of the Member: ");
            String name = sc.nextLine();
            System.out.print("Enter the address: ");
            String address = sc.nextLine();

            society.addMember(name, address);
        }

        if (menuoption == 2){
            System.out.print("Enter the name of the Member: ");
            String name = sc.nextLine();
            System.out.print("Enter the address: ");
            String address = sc.nextLine();
            System.out.print("Enter the price of the member: ");
            double fee = sc.nextDouble();
            society.addSeniorMember(name, address, fee);
        }
        double admfee = society.getFeeTotal();
        System.out.println("Total fee: " + admfee);

        sc.close();
    }
}
