import java.util.*;


class Shape
{
        private static Scanner sc = new Scanner(System.in);

        public static void main(String args[])
        {
                for (int i = 0; i < 100; i++)
                {
                        System.out.print("MENU\n1. Circle Area\n2. Square Area\n3. Rectangle Area\n4. Exit\n\nEnter your choice: ");
                        int option = sc.nextInt();

                        switch(option)

                        {
                                case 1:
                                        {
                                                System.out.print("Enter the radius of the circle: ");
                                                float radius = sc.nextFloat();
                                                System.out.print("The area of the circle: " + calc_Area(radius));
                                                break;
                                        }

                                case 2:
                                        System.out.print("Enter the side of the square: ");
                                        int s = sc.nextInt();
                                        System.out.print("\nArea of the square is: " + calc_Area(s));
                                        break;

                                case 3:
                                        System.out.print("\nEnter the measurement of side1: ");
                                        float s1,s2;
                                        s1 = sc.nextFloat();
                                        System.out.print("\nEnter the measurement of side2: ");
                                        s2 = sc.nextFloat();
                                        System.out.print("\nThe area of the figure is: " + calc_Area(s1,s2));
                                        break;

                                case 4:
                                        i = 100;
                                        break;
                        }
                }
        }

        static double calc_Area(int side)
        {
                double area = side * side;
                return area;
        }

        static double calc_Area(float radius)
        {
                double area = 3.14 * radius * radius;
                return area;
        }

        static double calc_Area(float s1, float s2)
        {
                double area = s1 * s2;
                return area;
        }
}
