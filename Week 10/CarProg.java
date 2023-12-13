import java.util.*;

class Car{
    double price;
    int year;

    public Car(double price, int year){
        this.price = price;
        this.year = year;
    }

    public double calculateSalePrice(){
        return (price*0.25);
    }

    public String toString(){
        return ("The price of the car is: " + price + "\nThe year of the car is: " + year);
    }
}

class SportCar extends Car{

    public SportCar(double price, int year){
        super(price, year);
    }

    @Override
    public double calculateSalePrice(){
        double salesprice;
        if (year >= 2000){
            salesprice = 0.75 * price;
        }

        else if ((year > 1995) && (year < 2000)){
            salesprice = 0.5 * price;
        }

        else{
            salesprice = -1;
        }

        return salesprice;
    }
}

class ClassicCar extends Car{
    
    public ClassicCar(double price, int year){
        super(price, year);
    }

    @Override
    public double calculateSalePrice(){
        return 10000;
    }
}

class CarProg{
    public static void main(String[] args) {

        int menuchoice = 0;
        
        Scanner sc = new Scanner(System.in);

        while (menuchoice != 3){
            System.out.print("MAIN MENU\n\n1. Sports Car \n2. Classic Car \n3. Exit Program \nEnter your choice: ");
            menuchoice = sc.nextInt();

            if (menuchoice == 1){
                System.out.print("Enter the price of the car: ");
                double sportscarprice = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter the car\'s make year: ");
                int sportscaryear = sc.nextInt();
                sc.nextLine();

                SportCar sportcar = new SportCar(sportscarprice, sportscaryear);
                System.out.print("\nThe sales attributes of the sports car is: " + sportcar.toString());
                System.out.print("\nThe sales price of the sports car is: " + sportcar.calculateSalePrice());
            }

            else if (menuchoice == 2){
                System.out.print("Enter the price of the car: ");
                double classiccarprice = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter the car\'s make year: ");
                int classiccaryear = sc.nextInt();
                sc.nextLine();

                ClassicCar classiccar = new ClassicCar(classiccarprice, classiccaryear);
                System.out.print("\nThe sales attributes of the classic car are: \n" + classiccar.toString());
                System.out.print("\nThe sales price of the classic car is: " + classiccar.calculateSalePrice());
            }

            else if (menuchoice == 3){
                break;
            }
        }
        sc.close();
    }
}
