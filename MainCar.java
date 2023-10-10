import java.util.*;

class Car
{
    String Vehicle_id;
    float[] cost = new float[3];
    
    static float calc_total(float[] cost)
    {
        float total = cost[0] + cost[1] + cost[2];
        return total;
    }

    static float grand_total(float total)
    {
        float g_total = (float)total - (float)(total * 0.1);
        return g_total;
    }
}

class MainCar
{
private static Scanner sc = new Scanner(System.in);
private static Car[] arr = new Car[10];
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            arr[i] = new Car();
            System.out.print("\n\n");

            System.out.print("\n\nEnter the name of the car: ");
            String car_name = sc.next();
            arr[i].Vehicle_id = car_name;

            System.out.print("\nEnter the base price of the car: ");
            arr[i].cost[0] = sc.nextFloat();
            
            System.out.print("\nEnter the Exercise Duty of the car: ");
            arr[i].cost[1] = sc.nextFloat();

            System.out.print("\nEnter the Sales Tax of the car: ");
            arr[i].cost[2] = sc.nextFloat();

            arr[i].calc_total(arr[i].cost);

            System.out.print("\n\n");
        }

        float max_grand_price = 0;

        for (int i = 0; i < 10; i++)
        {
            

            System.out.println("Car Name: " + arr[i].Vehicle_id);
            
            float total = arr[i].calc_total(arr[i].cost);
            System.out.println("The Cost of the car is: Rs " + total);

            float grand_total_var = arr[i].grand_total(total);
            System.out.println("The cost of the car after the discount is: Rs " + grand_total_var);
            
            if (grand_total_var > max_grand_price)
            {
                max_grand_price = grand_total_var;
            }
        }
        
        System.out.println("The highest value after discount is: " + max_grand_price);
    
    }
}